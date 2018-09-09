package com.diegocostantino.minijava.ast;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ASTClass implements ASTNode {
    ASTIdentifier identifier;
    ASTMethodDeclList methods;
    ASTVarDeclList attributes;

    public ASTClass(ASTIdentifier identifier, ASTVarDeclList attributes, ASTMethodDeclList methods) {
        this.identifier = identifier;
        this.methods = methods;
        this.attributes = attributes;
    }
}
