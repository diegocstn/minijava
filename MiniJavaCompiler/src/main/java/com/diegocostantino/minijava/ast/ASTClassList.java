package com.diegocostantino.minijava.ast;

import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
public class ASTClassList {
    public List<ASTClass> classes;

    public ASTClassList(List<ASTClass> classes) {
        this.classes = classes;
    }

}
