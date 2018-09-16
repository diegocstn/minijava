package com.diegocostantino.minijava.ast.expr;

import com.diegocostantino.minijava.ast.ASTNode;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.List;

@AllArgsConstructor
@EqualsAndHashCode
public class ASTExprList extends ASTExpression implements ASTNode {
    List<ASTExpression> expressions;
}
