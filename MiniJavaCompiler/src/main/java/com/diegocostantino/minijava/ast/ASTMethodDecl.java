package com.diegocostantino.minijava.ast;

import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
public class ASTMethodDecl implements ASTNode {
    ASTAccessModifier modifier;
    ASTIdentifierType returnType;
    ASTIdentifier identifier;
    ASTFormalList formalList;

    // method body
    List<ASTVarDeclaration> localVariables;

    public ASTMethodDecl(ASTAccessModifier modifier,
                         ASTIdentifierType returnType,
                         ASTIdentifier identifier,
                         ASTFormalList formalList,
                         List<ASTVarDeclaration> localVariables) {
        this.modifier = modifier;
        this.returnType = returnType;
        this.identifier = identifier;
        this.formalList = formalList;
        this.localVariables = localVariables;
    }
}
