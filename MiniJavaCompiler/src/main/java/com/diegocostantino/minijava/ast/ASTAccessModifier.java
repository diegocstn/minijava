package com.diegocostantino.minijava.ast;

import com.diegocostantino.minijava.lexer.MiniJavaLexerTokenManager;
import com.diegocostantino.minijava.lexer.Token;

public enum  ASTAccessModifier implements ASTNode {
    PUBLIC,
    PRIVATE;

    static ASTAccessModifier fromToken(Token token) throws ASTParserException {
        switch (token.kind) {
            case MiniJavaLexerTokenManager.PRIVATE:
                return ASTAccessModifier.PRIVATE;

            case MiniJavaLexerTokenManager.PUBLIC:
                return ASTAccessModifier.PUBLIC;

            default:
                throw new ASTParserException(token, MiniJavaLexerTokenManager.PUBLIC);
        }
    }

}
