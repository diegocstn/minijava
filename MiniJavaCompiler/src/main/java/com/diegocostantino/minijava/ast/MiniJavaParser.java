package com.diegocostantino.minijava.ast;

import com.diegocostantino.minijava.ast.expr.*;
import com.diegocostantino.minijava.ast.stmt.*;
import com.diegocostantino.minijava.lexer.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.diegocostantino.minijava.ast.MiniJavaParserUnionConstants.*;

public class MiniJavaParser {

    private List<Token> tokens;
    private MiniJavaLexer lexer;

    private int currentTokenIndex;

    private ASTExpression lastParsedExpr;

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
                TYPES);

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
        if (check(peek(), MiniJavaLexerTokenManager.RPAREN)) {
            return prevs;
        }

        Token typeToken = advance();
        Token idToken = advance();

        checkAndReport(idToken, MiniJavaLexerTokenManager.IDENTIFIER);
        checkAndReport(typeToken, TYPES);

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

    private void parseMethodLocalsVar(List<ASTVarDeclaration> vars) throws ASTParserException {
        // no local vars
        if (!TYPES.contains(peek().kind)) {
            return;
        }

        Token typeToken = advance();
        Token idToken = advance();

        checkAndReport(typeToken, TYPES);
        checkAndReport(idToken, MiniJavaLexerTokenManager.IDENTIFIER);
        checkAndReport(advance(), MiniJavaLexerTokenManager.SEMICOLON);

        vars.add(new ASTVarDeclaration(
                ASTIdentifierType.fromToken(typeToken),
                new ASTIdentifier(idToken.image)));

        if (isIdentifierType(peek())) {
            parseMethodLocalsVar(vars);
        }
    }

    /**
     * Expressions
     */

    private ASTIdentifier parseAndVerifyIdentifier(Token token) throws ASTParserException {
        checkAndReport(token, MiniJavaLexerTokenManager.IDENTIFIER);
        return new ASTIdentifier(token.image);
    }

    private ASTExpression parseCall() throws ASTParserException {
       Token identifier = advance();

       if (check(identifier, MiniJavaLexerTokenManager.ARRAY_LENGTH)) {
           return new ASTArrayLengthExpr(lastParsedExpr);
       }

       // object method call
       checkAndReport(identifier, MiniJavaLexerTokenManager.IDENTIFIER);
       checkAndReport(advance(), MiniJavaLexerTokenManager.LPAREN);
       ASTExprList exprList = parseExpressionList();
       checkAndReport(advance(), MiniJavaLexerTokenManager.RPAREN);

       lastParsedExpr = new ASTCallExpr(lastParsedExpr, new ASTIdentifier(identifier.image), parseExpressionList());

       return lastParsedExpr;
    }

    private ASTExprList parseExpressionList() {
        return null;
    }

    private ASTExpression parseExpression() throws ASTParserException {
        Token token = peek();
        // keep track of last expr for special cases handling

        if (isBinaryOperator(token)) {
            lastParsedExpr = new ASTBinaryExpr(lastParsedExpr, parseExpression(), token);
        }

        if (check(token, MiniJavaLexerTokenManager.LSQPAREN)) {
            // consume [
            advance();
            lastParsedExpr = new ASTArrayLookupExpr(lastParsedExpr, parseExpression());
            // consume ]
            advance();
        }

        if (check(token, MiniJavaLexerTokenManager.DOT)) {
            lastParsedExpr = parseCall();
        }


        switch (token.kind) {
            case MiniJavaLexerTokenManager.INTEGER_LITERAL:
                lastParsedExpr = new ASTIntegerLiteralExpr(Integer.parseInt(token.image));

            case MiniJavaLexerTokenManager.TRUE:
                lastParsedExpr = new ASTTrueExpr();

            case MiniJavaLexerTokenManager.FALSE:
                lastParsedExpr = new ASTFalseExpr();

            case MiniJavaLexerTokenManager.IDENTIFIER:
                lastParsedExpr = new ASTIdentifier(token.image);

            case MiniJavaLexerTokenManager.THIS:
                lastParsedExpr = new ASTThisExpr();

            case MiniJavaLexerTokenManager.NEW:
                // discard new operator
                advance();

                // get instance type int or class identifier
                Token instanceType = advance();

                // check if is a new int array instance
                if (check(instanceType, MiniJavaLexerTokenManager.T_INT)) {
                    checkAndReport(advance(), MiniJavaLexerTokenManager.LSQPAREN);
                    ASTExpression idExpression = parseExpression();
                    checkAndReport(advance(), MiniJavaLexerTokenManager.RSQPAREN);

                    lastParsedExpr = new ASTNewArrayExpr(idExpression);
                }

                // check if is a new object instance
                if (check(advance(), MiniJavaLexerTokenManager.LBRACE) &&
                        check(advance(), MiniJavaLexerTokenManager.RBRACE)) {
                    lastParsedExpr = new ASTNewObjectExpr(parseAndVerifyIdentifier(token));
                }

                throw new ASTParserException(token, IDENTIFIER_OR_ARRAY);

            // ! Expr
            case MiniJavaLexerConstants.BANG:
                // discard ! op
                advance();
                lastParsedExpr = new ASTNotExpr(parseExpression());

            // parentesized expression (EXP)
            case MiniJavaLexerConstants.LPAREN:
                // discard (
                advance();
                ASTExpression expression = parseExpression();
                checkAndReport(advance(), MiniJavaLexerTokenManager.RPAREN);
                lastParsedExpr = expression;
        }

        return lastParsedExpr;
    }

    /**
     * Statements
     */
    private ASTStatement parseBlockStatement() throws ASTParserException {
        // consume left brace
        advance();

        // parse block statements
        ASTStatementList astStatementList = new ASTStatementList();
        parseStatements(astStatementList);

        // check and consume right brace
        checkAndReport(advance(), MiniJavaLexerTokenManager.RBRACE);

        return astStatementList;
    }

    private ASTStatement parseIfStatement() throws ASTParserException {
        // consume IF token
        checkAndReport(advance(), MiniJavaLexerTokenManager.LPAREN);
        ASTExpression condition = parseExpression();
        checkAndReport(advance(), MiniJavaLexerTokenManager.RPAREN);

        ASTStatement trueStatement = parseStatement();
        ASTStatement elseStatement = null;

        if (check(peek(), MiniJavaLexerTokenManager.ELSE)) {
            elseStatement = parseStatement();
        }

        return new ASTIfStmt(condition, trueStatement, elseStatement);
    }

    private ASTStatement parseWhileStatement() throws ASTParserException {
        // consume IF token
        checkAndReport(advance(), MiniJavaLexerTokenManager.LPAREN);
        ASTExpression condition = parseExpression();
        checkAndReport(advance(), MiniJavaLexerTokenManager.RPAREN);

        ASTStatement trueStatement = parseStatement();
        ASTStatement elseStatement = null;

        if (check(peek(), MiniJavaLexerTokenManager.ELSE)) {
            elseStatement = parseStatement();
        }

        return new ASTIfStmt(condition, trueStatement, elseStatement);
    }

    private ASTStatement parsePrintStatement() throws ASTParserException {
        // consume printStatement
        advance();
        checkAndReport(advance(), MiniJavaLexerTokenManager.LPAREN);
        ASTExpression expression = parseExpression();
        checkAndReport(advance(), MiniJavaLexerTokenManager.RPAREN);

        return new ASTPrintStmt(expression);
    }

    private ASTStatement parseIdentifierAssignment() throws ASTParserException {
        ASTIdentifier identifier = new ASTIdentifier(advance().image);
        ASTStatement stmt;
        Token nextToken = advance();
        if (check(nextToken, MiniJavaLexerTokenManager.ASSIGN)) {
            // standard identifier assignment
            stmt = new ASTAssignStmt(
                    identifier,
                    parseExpression());

        } else {
            // array assigment
            checkAndReport(advance(), MiniJavaLexer.LSQPAREN);
            ASTExpression indexExpr = parseExpression();
            checkAndReport(advance(), MiniJavaLexer.RSQPAREN);
            stmt = new ASTArrayAssignStmt(identifier, indexExpr, parseExpression());
        }

        checkAndReport(advance(), MiniJavaLexer.SEMICOLON);

        return stmt;
    }

    private ASTStatement parseStatement() throws ASTParserException {
        switch (peek().kind) {
            // parse block
            case MiniJavaLexerTokenManager.LBRACE:
                return parseBlockStatement();

            // parse if
            case MiniJavaLexerTokenManager.IF:
                return parseIfStatement();

            // parse while
            case MiniJavaLexerTokenManager.WHILE:
                return parseWhileStatement();

            case MiniJavaLexerConstants.PRINT:
                return parsePrintStatement();

            case MiniJavaLexerConstants.IDENTIFIER:
                return parseIdentifierAssignment();
        }

        throw new ASTParserException(peek(), STMT);

    }

    private ASTStatementList parseStatements(ASTStatementList statementList) throws ASTParserException {
        if (isReturnToken(peek()) || check(peek(), MiniJavaLexerTokenManager.RBRACE)) {
            return statementList;
        }
        statementList.appendStmt(parseStatement());
        return parseStatements(statementList);
    }

    private ASTMethodDecl parseMethodDecl() throws ASTParserException {
        List<ASTVarDeclaration> localVars = new ArrayList<>();

        Token accModifier = advance();
        Token typeToken = advance();
        Token idToken = advance();

        checkAndReport(accModifier,
                isAccessModifier(accModifier),
                ACC_MODIFIERS);

        checkAndReport(typeToken, TYPES);
        checkAndReport(idToken, MiniJavaLexerTokenManager.IDENTIFIER);

        // parse formal params
        ASTFormalList formalList = parseFormalList();

        // check and consume left brace
        checkAndReport(advance(), MiniJavaLexerTokenManager.LBRACE);

        parseMethodLocalsVar(localVars);
        ASTStatementList astStatementList = parseStatements(new ASTStatementList());

        // check and consume right brace
        checkAndReport(advance(), MiniJavaLexerTokenManager.RBRACE);

        return new ASTMethodDecl(
                ASTAccessModifier.fromToken(accModifier),
                ASTIdentifierType.fromToken(typeToken),
                new ASTIdentifier(idToken.image),
                formalList,
                localVars
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
        return TYPES.contains(token.kind);
    }

    private boolean isAccessModifier(Token token) {
        return token.kind == MiniJavaLexerTokenManager.PRIVATE ||
                token.kind == MiniJavaLexerTokenManager.PUBLIC;
    }

    private boolean isEndOfScope(Token token) {
        return token.kind == MiniJavaLexerTokenManager.RBRACE;
    }

    private boolean isReturnToken(Token token) { return check(token, MiniJavaLexerTokenManager.RET); }

    private boolean check(Token token, int expected) {
        return token.kind == expected;
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

    private boolean isBinaryOperator(Token token) {
        return BINARY_OPS.contains(token.kind);
    }

    /**
     * Main function
     * @return
     * @throws ASTParserException
     */
    public ASTNode parse() throws ASTParserException {
        return new ASTProgram(parseClassList());
    }
}
