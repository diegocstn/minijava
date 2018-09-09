package com.diegocostantino.minijava.ast;

import com.diegocostantino.minijava.lexer.MiniJavaLexerTokenManager;
import com.diegocostantino.minijava.lexer.Token;

public class ASTParserException extends Exception {
    Token token;
    String expected;

    public ASTParserException(Token token, int expectedId) {
        this.token = token;
        this.expected = MiniJavaLexerTokenManager.tokenImage[expectedId];
    }

    public ASTParserException(Token token, ASTTokenUnion expectedIds) {
        this.token = token;
        StringBuilder expectedMessage = new StringBuilder();
        for (int expectedId : expectedIds.tokenTypes) {
            expectedMessage.append("or <");
            expectedMessage.append(MiniJavaLexerTokenManager.tokenImage[expectedId]);
            expectedMessage.append(">");
        }
        expected = expectedMessage.toString();
    }

    @Override
    public String toString() {
        return String.format("ASTParserException (line %d, col %d) found <%s> - expected <%s>",
                token.beginLine,
                token.beginColumn,
                token.image,
                expected);
    }
}
