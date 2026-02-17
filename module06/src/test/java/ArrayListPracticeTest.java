import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit test for class ArrayListPractice
 * @author Mengyuan Ding
 * @since 2026-02-16
 * course CS5004
 */
class ArrayListPracticeTest {

    private static String run(String input) {
        var oldIn = System.in;
        var oldOut = System.out;

        var in = new ByteArrayInputStream(input.getBytes(UTF_8));
        var buffer = new ByteArrayOutputStream();
        var out = new PrintStream(buffer, true, UTF_8);

        try {
            System.setIn(in);
            System.setOut(out);
            ArrayListPractice.main(new String[0]);
            return buffer.toString(UTF_8);
        } finally {
            System.setIn(oldIn);
            System.setOut(oldOut);
        }
    }

    @Test
    void testValidQueries() {
        String input =
                "2\n" +
                "3 10 20 30\n" +
                "1 5\n" +
                "3\n" +
                "1 1\n" +   // 10
                "1 3\n" +   // 30
                "2 1\n";    // 5

        assertEquals("10\n30\n5\n", run(input));
    }

    @Test
    void testErrorOutOfBoundsRowAndColumn() {
        String input =
                "2\n" +
                "2 7 8\n" +
                "0\n" +      // empty row
                "4\n" +
                "1 3\n" +    // col out of bounds -> ERROR!
                "2 1\n" +    // empty row -> ERROR!
                "3 1\n" +    // row out of bounds -> ERROR!
                "1 0\n";     // invalid 1-based column -> ERROR!

        assertEquals("ERROR!\nERROR!\nERROR!\nERROR!\n", run(input));
    }

    @Test
    void testNegativeIndicesInQueries() {
        String input =
                "1\n" +
                "1 42\n" +
                "3\n" +
                "0 1\n" +    // invalid 1-based row -> ERROR!
                "1 -1\n" +   // invalid 1-based col -> ERROR!
                "-2 1\n";    // invalid 1-based row -> ERROR!

        assertEquals("ERROR!\nERROR!\nERROR!\n", run(input));
    }
}
