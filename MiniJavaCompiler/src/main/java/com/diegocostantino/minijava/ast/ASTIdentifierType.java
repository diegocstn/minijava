package com.diegocostantino.minijava.ast;

import com.diegocostantino.minijava.lexer.Token;

public enum ASTIdentifierType implements ASTNode {
    INT,
    ARRAY_INT,
    BOOLEAN;

    static ASTIdentifierType fromToken(Token token) throws ASTParserException {
        switch (token.image) {
            case "int":
                return ASTIdentifierType.INT;
            case "boolean":
                return ASTIdentifierType.BOOLEAN;
            case "int[]":
                return ASTIdentifierType.ARRAY_INT;
            default:
                return ASTIdentifierType.INT;
        }
    }
}