package com.diegocostantino.minijava.ast;

import java.util.ArrayList;
import java.util.List;

public class ASTTokenUnion {
    List<Integer> tokenTypes;

    public ASTTokenUnion(int ...types) {
        tokenTypes = new ArrayList<>();
        for (int tokenType : types) {
           tokenTypes.add(tokenType);
        }
    }

    public boolean contains(int type) {
        return tokenTypes.contains(type);
    }

    public static ASTTokenUnion of(int ...types) {
        return new ASTTokenUnion(types);
    }
}
