package com.diegocostantino.minijava.ast;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ASTMethodDecl implements ASTNode {
    ASTAccessModifier modifier;
    ASTIdentifierType returnType;
    ASTIdentifier identifier;
    ASTFormalList formalList;

    public ASTMethodDecl(ASTAccessModifier modifier,
                         ASTIdentifierType returnType,
                         ASTIdentifier identifier,
                         ASTFormalList formalList) {
        this.modifier = modifier;
        this.returnType = returnType;
        this.identifier = identifier;
        this.formalList = formalList;
    }
}
