package com.diegocostantino.minijava.ast;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
public class ASTVarDeclList implements ASTNode {
    List<ASTVarDeclaration> variables;

    public ASTVarDeclList(List<ASTVarDeclaration> variables) {
        this.variables = new ArrayList<>();
        if (variables != null) {
            this.variables.addAll(variables);
        }
    }
}
