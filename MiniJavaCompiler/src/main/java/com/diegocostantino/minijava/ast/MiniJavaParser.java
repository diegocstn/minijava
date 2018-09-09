package com.diegocostantino.minijava.ast;

import com.diegocostantino.minijava.lexer.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MiniJavaParser {

    private List<Token> tokens;
    private MiniJavaLexer lexer;

    private int currentTokenIndex;

    public MiniJavaParser(String program) {
        this(new ByteArrayInputStream(program.getBytes()));
    }

    public MiniJavaParser(InputStream program) {
        MiniJavaLexer lexer = new MiniJavaLexer(new ByteArrayInputStream("".getBytes()));
        lexer.ReInit(program);
        tokens = new ArrayList<>();
        Token token;
        while ((token = lexer.getNextToken()).image.length() != 0) {
            tokens.add(token);
        }

        currentTokenIndex = -1;
    }

    public int getListLength() {
        return tokens.size();
    }

    public Iterator<Token> getTokenIterator() {
        return this.tokens.iterator();
    }

    /**
     * get next token without consuming it
     * @return next token
     */
    private Token peek() {
        if (currentTokenIndex == tokens.size() - 1) {
            return new Token(MiniJavaLexerTokenManager.EOF);
        }
        return tokens.get(currentTokenIndex + 1);
    }

    private Token advance() {
        if (currentTokenIndex == tokens.size() - 1) {
            return new Token(MiniJavaLexerTokenManager.EOF);
        }

        currentTokenIndex += 1;
        return tokens.get(currentTokenIndex);
    }


    private ASTClass parseClass() throws ASTParserException {
        Token next = advance();
        ASTIdentifier identifier;

        checkAndReport(next, MiniJavaLexerTokenManager.CLASS);

        next = advance();
        checkAndReport(next, MiniJavaLexerTokenManager.IDENTIFIER);
        identifier = new ASTIdentifier(next.image);

        checkAndReport(advance(), MiniJavaLexerTokenManager.LBRACE);

        ASTClass astClass = new ASTClass(identifier, parseVarDeclList(), parseMethodDeclList());

        checkAndReport(advance(), MiniJavaLexerTokenManager.RBRACE);

        return astClass;
    }

    private ASTVarDeclaration parseVarDeclaration() throws ASTParserException {
        Token typeToken = advance();
        Token idToken = advance();

        checkAndReport(typeToken,
                isIdentifierType(typeToken),
                ASTTokenUnion.of(MiniJavaLexerTokenManager.T_INT, MiniJavaLexerTokenManager.T_BOOLEAN));

        checkAndReport(idToken, MiniJavaLexerTokenManager.IDENTIFIER);

        checkAndReport(advance(), MiniJavaLexerTokenManager.SEMICOLON);

        return new ASTVarDeclaration(
                ASTIdentifierType.fromToken(typeToken),
                new ASTIdentifier(idToken.image)
        );
    }

    private ASTVarDeclList parseVarDeclList() throws ASTParserException {
        List<ASTVarDeclaration> vars = new ArrayList<>();
        while (!isAccessModifier(peek()) && !isEndOfScope(peek())) {
            vars.add(parseVarDeclaration());
        }
        return new ASTVarDeclList(vars);
    }

    private ASTMethodDeclList parseMethodDeclList() throws ASTParserException {
        List<ASTMethodDecl> classMethods = new ArrayList<>();

        while (!isEndOfScope(peek())) {
            classMethods.add(parseMethodDecl());
        }

        return new ASTMethodDeclList(classMethods);
    }

    private List<ASTFormalRest> parseFormalRest(List<ASTFormalRest> prevs) throws ASTParserException {
        // no params
        if (peek().kind == MiniJavaLexerTokenManager.RPAREN) {
            return prevs;
        }

        Token typeToken = advance();
        Token idToken = advance();

        checkAndReport(idToken, MiniJavaLexerTokenManager.IDENTIFIER);
        checkAndReport(typeToken, ASTTokenUnion.of(MiniJavaLexerTokenManager.T_INT, MiniJavaLexerTokenManager.T_BOOLEAN));

        prevs.add(new ASTFormalRest(
                ASTIdentifierType.fromToken(typeToken),
                new ASTIdentifier(idToken.image)));

        if (peek().kind == MiniJavaLexerTokenManager.COMMA) {
            return parseFormalRest(prevs);
        }

        return prevs;
    }

    private ASTFormalList parseFormalList() throws ASTParserException {
        List<ASTFormalRest> params = new ArrayList<>();
        checkAndReport(advance(), MiniJavaLexerTokenManager.LPAREN);

        params = parseFormalRest(params);

        checkAndReport(advance(), MiniJavaLexerTokenManager.RPAREN);

        return new ASTFormalList(params);
    }

    private ASTMethodDecl parseMethodDecl() throws ASTParserException {
        List<ASTFormalRest> params;

        Token accModifier = advance();
        Token typeToken = advance();
        Token idToken = advance();

        checkAndReport(accModifier,
                isAccessModifier(accModifier),
                ASTTokenUnion.of(MiniJavaLexerTokenManager.PUBLIC, MiniJavaLexerTokenManager.PRIVATE));

        checkAndReport(typeToken, ASTTokenUnion.of(MiniJavaLexerTokenManager.T_INT, MiniJavaLexerTokenManager.T_BOOLEAN));

        checkAndReport(idToken, MiniJavaLexerTokenManager.IDENTIFIER);

        // parse formal params
        ASTFormalList formalList = parseFormalList();

        // check and consume left brace
        checkAndReport(advance(), MiniJavaLexerTokenManager.LBRACE);

        // TODO parse method body

        // check and consume right brace
        checkAndReport(advance(), MiniJavaLexerTokenManager.RBRACE);

        return new ASTMethodDecl(
                ASTAccessModifier.fromToken(accModifier),
                ASTIdentifierType.fromToken(typeToken),
                new ASTIdentifier(idToken.image),
                formalList
        );
    }


    private ASTClassList parseClassList() throws ASTParserException {
        List<ASTClass> classes = new ArrayList<>();
        while (peek().kind != MiniJavaLexerTokenManager.EOF && !isEndOfScope(peek())) {
            classes.add(parseClass());
        }
        return new ASTClassList(classes);
    }

    /**
     * Helpers
     */
    private boolean isIdentifierType(Token token) {
        return token.kind == MiniJavaLexerTokenManager.T_INT ||
                token.kind == MiniJavaLexerTokenManager.T_BOOLEAN;
    }

    private boolean isAccessModifier(Token token) {
        return token.kind == MiniJavaLexerTokenManager.PRIVATE ||
                token.kind == MiniJavaLexerTokenManager.PUBLIC;
    }

    private boolean isEndOfScope(Token token) {
        return token.kind == MiniJavaLexerTokenManager.RBRACE;
    }

    private void checkAndReport(Token token, int expected) throws ASTParserException {
        if (token.kind != expected) {
            throw new ASTParserException(token, expected);
        }
    }

    private void checkAndReport(Token token, ASTTokenUnion expected) throws ASTParserException {
        if (!expected.contains(token.kind)) {
            throw new ASTParserException(token, expected);
        }
    }

    private void checkAndReport(Token token, boolean condition, int expected) throws ASTParserException {
        if (!condition) {
            throw new ASTParserException(token, expected);
        }
    }

    private void checkAndReport(Token token, boolean condition, ASTTokenUnion expected) throws ASTParserException {
        if (!condition) {
            throw new ASTParserException(token, expected);
        }
    }


    public ASTNode parse() throws ASTParserException {
        return new ASTProgram(parseClassList());
    }
}
