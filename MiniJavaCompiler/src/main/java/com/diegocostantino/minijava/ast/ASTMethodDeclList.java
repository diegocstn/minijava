package com.diegocostantino.minijava.ast;

import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
public class ASTMethodDeclList implements ASTNode {
    List<ASTMethodDecl> methods;

    public ASTMethodDeclList(List<ASTMethodDecl> methods) {
        this.methods = methods;
    }
}
