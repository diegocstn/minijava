package com.diegocostantino.minijava.ast;

import com.diegocostantino.minijava.ast.expr.ASTExpression;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ASTIdentifier extends ASTExpression implements ASTNode {
    public String id;

    public ASTIdentifier(String id) {
        this.id = id;
    }
}
