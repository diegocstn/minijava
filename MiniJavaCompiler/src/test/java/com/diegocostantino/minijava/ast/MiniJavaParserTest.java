package com.diegocostantino.minijava.ast;

import com.diegocostantino.minijava.helpers.TestHelpers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MiniJavaParserTest {

    @Test
    public void testTokensListLengthFactorial() {
        MiniJavaParser parser = new MiniJavaParser(TestHelpers.readProg("factorial"));
        Assert.assertEquals(45, parser.getListLength());
    }

    @Test
    public void testTokensListLengthMain() {
        MiniJavaParser parser = new MiniJavaParser(TestHelpers.readProg("main"));
        Assert.assertEquals(9, parser.getListLength());
    }

    @Test
    public void testTokensListLengthSimpleClass() {
        MiniJavaParser parser = new MiniJavaParser(TestHelpers.readProg("class_simple_nomethods"));
        Assert.assertEquals(10, parser.getListLength());
    }

    @Test
    public void testASTSimpleClass() throws ASTParserException {
        MiniJavaParser parser = new MiniJavaParser(TestHelpers.readProg("class_simple_nomethods"));
        ASTProgram expected = new ASTProgram(
                new ASTClassList(List.of(
                        new ASTClass(
                                new ASTIdentifier("Simple"),
                                new ASTVarDeclList(
                                        List.of(
                                                new ASTVarDeclaration(
                                                        ASTIdentifierType.INT,
                                                        new ASTIdentifier("number")),

                                                new ASTVarDeclaration(
                                                        ASTIdentifierType.BOOLEAN,
                                                        new ASTIdentifier("flag")
                                                )
                                        )
                                ),
                                new ASTMethodDeclList(new ArrayList<>())
                        )
                ))
        );

        Assert.assertEquals(expected, parser.parse());
    }

    @Test
    public void testASTMultipleSimpleClasses() throws ASTParserException {
        MiniJavaParser parser = new MiniJavaParser(TestHelpers.readProg("class_multiple"));
        ASTProgram expected = new ASTProgram(
                new ASTClassList(List.of(
                        new ASTClass(
                                new ASTIdentifier("Cat"),
                                new ASTVarDeclList(
                                        List.of(
                                                new ASTVarDeclaration(
                                                        ASTIdentifierType.INT,
                                                        new ASTIdentifier("number")),

                                                new ASTVarDeclaration(
                                                        ASTIdentifierType.BOOLEAN,
                                                        new ASTIdentifier("flag")
                                                )
                                        )
                                ),
                                new ASTMethodDeclList(new ArrayList<>())
                        ),
                        new ASTClass(
                                new ASTIdentifier("Dog"),
                                new ASTVarDeclList(
                                        List.of(
                                                new ASTVarDeclaration(
                                                        ASTIdentifierType.BOOLEAN,
                                                        new ASTIdentifier("isCute")
                                                )
                                        )
                                ),
                                new ASTMethodDeclList(new ArrayList<>())
                        )
                ))
        );

        ASTNode parsed = parser.parse();

        Assert.assertEquals(expected, parsed);
    }

    @Test
    public void testASTSimpleClassWithMethods() throws ASTParserException {
        MiniJavaParser parser = new MiniJavaParser(TestHelpers.readProg("class_simple"));
        ASTProgram expected = new ASTProgram(
                new ASTClassList(List.of(
                        new ASTClass(
                                new ASTIdentifier("Simple"),
                                new ASTVarDeclList(
                                        List.of(
                                                new ASTVarDeclaration(
                                                        ASTIdentifierType.INT,
                                                        new ASTIdentifier("number")),

                                                new ASTVarDeclaration(
                                                        ASTIdentifierType.BOOLEAN,
                                                        new ASTIdentifier("flag")
                                                )
                                        )
                                ),
                                new ASTMethodDeclList(List.of(
                                        new ASTMethodDecl(
                                                ASTAccessModifier.PUBLIC,
                                                ASTIdentifierType.INT,
                                                new ASTIdentifier("magicNumber"),
                                                new ASTFormalList(
                                                        List.of()
                                                ),
                                                List.of(
                                                        new ASTVarDeclaration(
                                                                ASTIdentifierType.INT,
                                                                new ASTIdentifier("guess"))
                                                )),
                                        new ASTMethodDecl(
                                                ASTAccessModifier.PRIVATE,
                                                ASTIdentifierType.BOOLEAN,
                                                new ASTIdentifier("checkThatNumber"),
                                                new ASTFormalList(
                                                        List.of(
                                                                new ASTFormalRest(
                                                                        ASTIdentifierType.INT,
                                                                        new ASTIdentifier("x"))
                                                        )
                                                ),
                                                List.of()
                                                )
                                ))
                        )
                ))
        );
        ASTNode parsed = parser.parse();
        Assert.assertEquals(expected, parsed);
    }

    @Test
    public void testASTSimpleClassNoAttrsWithMethods() throws ASTParserException {
        MiniJavaParser parser = new MiniJavaParser(TestHelpers.readProg("class_simple_no_attrs"));
        ASTProgram expected = new ASTProgram(
                new ASTClassList(List.of(
                        new ASTClass(
                                new ASTIdentifier("Simple"),
                                new ASTVarDeclList(null),
                                new ASTMethodDeclList(List.of(
                                        new ASTMethodDecl(
                                                ASTAccessModifier.PUBLIC,
                                                ASTIdentifierType.INT,
                                                new ASTIdentifier("magicNumber"),
                                                new ASTFormalList(
                                                        List.of()
                                                ),
                                                List.of(
                                                        new ASTVarDeclaration(
                                                                ASTIdentifierType.INT,
                                                                new ASTIdentifier("guess")),

                                                        new ASTVarDeclaration(
                                                                ASTIdentifierType.ARRAY_INT,
                                                                new ASTIdentifier("guesses")))
                                                )
                                ))
                        )
                ))
        );
        ASTNode parsed = parser.parse();
        Assert.assertEquals(expected, parsed);
    }
}
