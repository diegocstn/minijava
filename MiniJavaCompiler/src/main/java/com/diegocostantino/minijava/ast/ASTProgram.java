package com.diegocostantino.minijava.ast;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ASTProgram implements ASTNode {
    public ASTClassList classList;

    public ASTProgram(ASTClassList classList) {
        this.classList = classList;
    }
}
