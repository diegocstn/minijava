package com.diegocostantino.minijava.ast;

import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
public class ASTFormalList implements ASTNode {
    List<ASTFormalRest> formalRests;

    public ASTFormalList(List<ASTFormalRest> formalRests) {
        this.formalRests = formalRests;
    }
}
