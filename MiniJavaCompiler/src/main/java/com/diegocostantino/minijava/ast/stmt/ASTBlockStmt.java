package com.diegocostantino.minijava.ast.stmt;

import com.diegocostantino.minijava.ast.ASTNode;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class ASTBlockStmt extends ASTStatement implements ASTNode {
    ASTStatementList statementList;
}
