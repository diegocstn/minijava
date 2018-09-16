package com.diegocostantino.minijava.ast.stmt;

import com.diegocostantino.minijava.ast.ASTNode;
import com.diegocostantino.minijava.ast.expr.ASTExpression;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class ASTPrintStmt extends ASTStatement implements ASTNode {
    ASTExpression expression;
}
