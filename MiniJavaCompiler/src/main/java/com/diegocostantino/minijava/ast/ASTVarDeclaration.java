package com.diegocostantino.minijava.ast;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ASTVarDeclaration implements ASTNode {
    public ASTIdentifierType type;
    public ASTIdentifier id;

    public ASTVarDeclaration(ASTIdentifierType type, ASTIdentifier id) {
        this.type = type;
        this.id = id;
    }
}
