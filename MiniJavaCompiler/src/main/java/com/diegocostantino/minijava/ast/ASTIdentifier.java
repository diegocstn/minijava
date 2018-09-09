package com.diegocostantino.minijava.ast;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ASTIdentifier implements ASTNode {
    public String id;

    public ASTIdentifier(String id) {
        this.id = id;
    }
}
