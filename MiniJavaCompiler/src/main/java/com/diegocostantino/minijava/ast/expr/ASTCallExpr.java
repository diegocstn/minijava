package com.diegocostantino.minijava.ast.expr;

import com.diegocostantino.minijava.ast.ASTIdentifier;
import com.diegocostantino.minijava.ast.ASTNode;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class ASTCallExpr extends ASTExpression implements ASTNode {
    ASTExpression expression;
    ASTIdentifier identifier;
    ASTExprList exprList;
}
