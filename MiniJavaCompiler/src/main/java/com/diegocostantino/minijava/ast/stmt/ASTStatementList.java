package com.diegocostantino.minijava.ast.stmt;

import com.diegocostantino.minijava.ast.ASTNode;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;


@EqualsAndHashCode
public class ASTStatementList extends ASTStatement implements ASTNode {
    List<ASTStatement> statements;

    public ASTStatementList() {
        this.statements = new ArrayList<>();
    }

    public void appendStmt(ASTStatement statement) {
        this.statements.add(statement);
    }
}
