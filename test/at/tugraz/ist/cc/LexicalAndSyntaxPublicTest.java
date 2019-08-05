package at.tugraz.ist.cc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import at.tugraz.ist.cc.interfaces.LexicalAndSyntaxAnalyzerInterface;

public class LexicalAndSyntaxPublicTest {

    private final String path_lexer = "test/input/lexer/";
    private final String path_parser = "test/input/parser/";
    private final String path_own = "test/input/ownTests/";

    LexicalAndSyntaxAnalyzerInterface lexAndSyntax = new LexicalAndSyntaxAnalyzer();
    boolean debug = true;

    @Test
    public void testLexerPass01() {
        int result = lexAndSyntax.lexer(path_lexer + "pass01.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testLexerPass02() {
        int result = lexAndSyntax.lexer(path_lexer + "pass02.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testLexerPass03() {
        int result = lexAndSyntax.lexer(path_lexer + "pass03.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testLexerPass04() {
        int result = lexAndSyntax.lexer(path_lexer + "pass04.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testLexerFail01() {
        int result = lexAndSyntax.lexer(path_lexer + "fail01.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testLexerFail02() {
        int result = lexAndSyntax.lexer(path_lexer + "fail02.jova", debug);
        assertTrue(result >= 4);
    }

    @Test
    public void testLexerFail03() {
        int result = lexAndSyntax.lexer(path_lexer + "fail03.jova", debug);
        assertTrue(result >= 2);
    }

    // PARSER

    @Test
    public void testParserPass01() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass01.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testParserPass02() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass02.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testParserPass03() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass03.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testParserPass04() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass04.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testParserPass05() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass05.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testParserPass06() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass06.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testParserFail01() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail01.jova", debug);
        assertEquals(2, result);
    }

    @Test
    public void testParserFail02() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail02.jova", debug);
        assertTrue(result >= 3);
    }

    @Test
    public void testParserFail03() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail03.jova", debug);
        assertTrue(result >= 1);
    }

    @Test
    public void testParserFail04() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail04.jova", debug);
        assertEquals(4, result);
    }

    @Test
    public void testParserFail05() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail05.jova", debug);
        assertEquals(2, result);
    }

    @Test
    public void testParserFail06() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail06.jova", debug);
        assertEquals(4, result);
    }

    @Test
    public void testAss1Pass01() {
        assertEquals(0, lexAndSyntax.checkSyntax(path_own + "pass01.jova", debug));
    }

    @Test
    public void testAss1Pass02() {
        assertEquals(0, lexAndSyntax.checkSyntax(path_own + "pass02.jova", debug));
    }

    @Test
    public void testAss1Pass03() {
        assertEquals(0, lexAndSyntax.checkSyntax(path_own + "pass03.jova", debug));
    }

    @Test
    public void testAss1Fail01() {
        assertEquals(1, lexAndSyntax.checkSyntax(path_own + "fail01.jova", debug));
    }

    @Test
    public void testAss1Fail02() {
        assertEquals(2, lexAndSyntax.checkSyntax(path_own + "fail02.jova", debug));
    }

    @Test
    public void testAss1Fail03() {
        assertEquals(2, lexAndSyntax.checkSyntax(path_own + "fail03.jova", debug));
    }

    @Test
    public void testAss1Fail04() {
        assertEquals(2, lexAndSyntax.checkSyntax(path_own + "fail04.jova", debug));
    }

    @Test
    public void testAss1Fail05() {
        assertEquals(4, lexAndSyntax.checkSyntax(path_own + "fail05.jova", debug));
    }
}
