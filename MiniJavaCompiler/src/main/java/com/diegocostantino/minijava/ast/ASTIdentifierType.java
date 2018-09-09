package com.diegocostantino.minijava.ast;

import com.diegocostantino.minijava.lexer.MiniJavaLexerTokenManager;
import com.diegocostantino.minijava.lexer.Token;

public enum ASTIdentifierType implements ASTNode {
    INT,
    BOOLEAN;

    static ASTIdentifierType fromToken(Token token) throws ASTParserException {
        switch (token.image) {
            case "int":
                return ASTIdentifierType.INT;
            case "boolean":
                return ASTIdentifierType.BOOLEAN;
            default:
                throw new ASTParserException(token, MiniJavaLexerTokenManager.T_INT);
        }
    }
}