package com.diegocostantino.minijava.ast.expr;

import com.diegocostantino.minijava.ast.ASTNode;
import com.diegocostantino.minijava.lexer.Token;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class ASTBinaryExpr extends ASTExpression implements ASTNode {
    ASTExpression left;
    ASTExpression  right;
    Token operator; // + - * / < &&
}
