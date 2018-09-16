package com.diegocostantino.minijava.ast.stmt;

import com.diegocostantino.minijava.ast.ASTNode;
import com.diegocostantino.minijava.ast.expr.ASTExpression;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class ASTIfStmt extends ASTStatement implements ASTNode {
    ASTExpression expr;
    ASTStatement statementIfBranch;
    ASTStatement statementElseBranch;
}
