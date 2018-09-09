package com.diegocostantino.minijava.lexer;

import com.diegocostantino.minijava.helpers.TestHelpers;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class MiniJavaLexerTest {

    private static MiniJavaLexer lexer;

    @Test
    public void testTokenClass() {
        String program = "class Factorial {}";
        lexer = new MiniJavaLexer(new ByteArrayInputStream(program.getBytes()));
        Token token;

        Assert.assertEquals(MiniJavaLexerConstants.CLASS, lexer.getNextToken().kind);

        // identifier
        token = lexer.getNextToken();
        Assert.assertEquals(MiniJavaLexerConstants.IDENTIFIER, token.kind);
        Assert.assertEquals("Factorial", token.image);

        // braces
        Assert.assertEquals(MiniJavaLexerConstants.LBRACE, lexer.getNextToken().kind);
        Assert.assertEquals(MiniJavaLexerConstants.RBRACE, lexer.getNextToken().kind);

    }

    @Test
    public void testTokenFactorial() {

        lexer = new MiniJavaLexer(TestHelpers.readProg("factorial"));
        Token token;

        Assert.assertEquals(MiniJavaLexerConstants.CLASS, lexer.getNextToken().kind);

        // identifier
        assertIdentifier("Fac");

        // left brace
        Assert.assertEquals(MiniJavaLexerConstants.LBRACE, lexer.getNextToken().kind);
        Assert.assertEquals(MiniJavaLexerConstants.PUBLIC, lexer.getNextToken().kind);
        Assert.assertEquals(MiniJavaLexerConstants.T_INT, lexer.getNextToken().kind);

        // identifier
        assertIdentifier("ComputeFact");

        Assert.assertEquals(MiniJavaLexerConstants.LPAREN, lexer.getNextToken().kind);
        Assert.assertEquals(MiniJavaLexerConstants.T_INT, lexer.getNextToken().kind);


        // identifier
        assertIdentifier("num");

        Assert.assertEquals(MiniJavaLexerConstants.RPAREN, lexer.getNextToken().kind);

        Assert.assertEquals(MiniJavaLexerConstants.LBRACE, lexer.getNextToken().kind);

        Assert.assertEquals(MiniJavaLexerConstants.T_INT, lexer.getNextToken().kind);


        // identifier
        assertIdentifier("num_aux");
        Assert.assertEquals(MiniJavaLexerConstants.SEMICOLON,  lexer.getNextToken().kind);

        Assert.assertEquals(MiniJavaLexerConstants.IF,  lexer.getNextToken().kind);
        Assert.assertEquals(MiniJavaLexerConstants.LPAREN, lexer.getNextToken().kind);

        assertIdentifier("num");
        Assert.assertEquals(MiniJavaLexerConstants.LT,  lexer.getNextToken().kind);

        assertIntegerLiteral(1);

        Assert.assertEquals(MiniJavaLexerConstants.RPAREN, lexer.getNextToken().kind);

        assertIdentifier("num_aux");
        Assert.assertEquals(MiniJavaLexerConstants.ASSIGN, lexer.getNextToken().kind);
        assertIntegerLiteral(1);
        Assert.assertEquals(MiniJavaLexerConstants.SEMICOLON, lexer.getNextToken().kind);


        Assert.assertEquals(MiniJavaLexerConstants.ELSE, lexer.getNextToken().kind);

        assertIdentifier("num_aux");
        Assert.assertEquals(MiniJavaLexerConstants.ASSIGN, lexer.getNextToken().kind);
        assertIdentifier("num");
        Assert.assertEquals(MiniJavaLexerConstants.STAR, lexer.getNextToken().kind);
        Assert.assertEquals(MiniJavaLexerConstants.LPAREN, lexer.getNextToken().kind);
        Assert.assertEquals(MiniJavaLexerConstants.THIS, lexer.getNextToken().kind);
        Assert.assertEquals(MiniJavaLexerConstants.DOT, lexer.getNextToken().kind);
        assertIdentifier("ComputeFac");
        Assert.assertEquals(MiniJavaLexerConstants.LPAREN, lexer.getNextToken().kind);
        assertIdentifier("num");
        Assert.assertEquals(MiniJavaLexerConstants.MINUS, lexer.getNextToken().kind);
        assertIntegerLiteral(1);
        Assert.assertEquals(MiniJavaLexerConstants.RPAREN, lexer.getNextToken().kind);
        Assert.assertEquals(MiniJavaLexerConstants.RPAREN, lexer.getNextToken().kind);
        Assert.assertEquals(MiniJavaLexerConstants.SEMICOLON, lexer.getNextToken().kind);

        Assert.assertEquals(MiniJavaLexerConstants.RET, lexer.getNextToken().kind);
        assertIdentifier("num_aux");
        Assert.assertEquals(MiniJavaLexerConstants.SEMICOLON, lexer.getNextToken().kind);


    }

    private void assertIdentifier(String id) {
        Token token = lexer.getNextToken();
        Assert.assertEquals(MiniJavaLexerConstants.IDENTIFIER, token.kind);
        Assert.assertEquals(id, token.image);
    }

    private void assertIntegerLiteral(int x) {
        Token token = lexer.getNextToken();
        Assert.assertEquals(MiniJavaLexerConstants.INTEGER_LITERAL, token.kind);
        Assert.assertEquals(x, Integer.parseInt(token.image));
    }
}
