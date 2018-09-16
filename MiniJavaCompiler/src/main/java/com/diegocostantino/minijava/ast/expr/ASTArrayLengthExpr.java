package com.diegocostantino.minijava.ast.expr;

import com.diegocostantino.minijava.ast.ASTNode;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class ASTArrayLengthExpr extends ASTExpression implements ASTNode {
    ASTExpression identifier;
}
