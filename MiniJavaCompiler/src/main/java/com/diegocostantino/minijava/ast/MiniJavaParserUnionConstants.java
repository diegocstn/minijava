package com.diegocostantino.minijava.ast;

import com.diegocostantino.minijava.lexer.MiniJavaLexer;
import com.diegocostantino.minijava.lexer.MiniJavaLexerTokenManager;

class MiniJavaParserUnionConstants {
    static final ASTTokenUnion TYPES = ASTTokenUnion.of(
            MiniJavaLexerTokenManager.T_INT,
            MiniJavaLexerTokenManager.T_BOOLEAN,
            MiniJavaLexerTokenManager.T_INT_ARRAY);

    static final ASTTokenUnion ACC_MODIFIERS = ASTTokenUnion.of(
            MiniJavaLexerTokenManager.PRIVATE,
            MiniJavaLexerTokenManager.PUBLIC
    );

    static final ASTTokenUnion STMT = ASTTokenUnion.of(
            MiniJavaLexerTokenManager.LBRACE,
            MiniJavaLexerTokenManager.IF,
            MiniJavaLexerTokenManager.WHILE,
            MiniJavaLexerTokenManager.PRINT,
            MiniJavaLexerTokenManager.IDENTIFIER
    );

    static final ASTTokenUnion IDENTIFIER_OR_ARRAY = ASTTokenUnion.of(
            MiniJavaLexerTokenManager.IDENTIFIER,
            MiniJavaLexerTokenManager.T_INT_ARRAY
    );

    static final ASTTokenUnion BINARY_OPS = ASTTokenUnion.of(
            MiniJavaLexerTokenManager.AND,
            MiniJavaLexerTokenManager.PLUS,
            MiniJavaLexerTokenManager.MINUS,
            MiniJavaLexerTokenManager.STAR,
            MiniJavaLexerTokenManager.LT,
            MiniJavaLexerTokenManager.GT
    );
}
