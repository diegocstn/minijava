package com.diegocostantino.minijava.ast.expr;

import com.diegocostantino.minijava.ast.ASTNode;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class ASTArrayLookupExpr extends ASTExpression implements ASTNode {
    ASTExpression arrayIdentifier;
    ASTExpression indexExpr;
}
