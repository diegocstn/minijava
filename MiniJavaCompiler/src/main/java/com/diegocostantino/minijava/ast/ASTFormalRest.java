package com.diegocostantino.minijava.ast;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ASTFormalRest {
    ASTIdentifierType type;
    ASTIdentifier id;

    public ASTFormalRest(ASTIdentifierType type, ASTIdentifier id) {
        this.type = type;
        this.id = id;
    }
}
