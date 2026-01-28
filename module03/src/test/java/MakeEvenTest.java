import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is to test MakeEven
 * @author Yikang Liu(Richard)
 * @since 01/27/2026
 * course CS5004 (Object-oriented programming)
 */
public class MakeEvenTest {

    private MakeEven maker;

    @Before
    public void setUp() {
        maker = new MakeEven();
    }

    @Test
    public void testEmptyString() {
        String input = "";
        assertEquals("", maker.makeEven(input));
    }

    @Test
    public void testEvenLengthWord() {
        String input = "hi"; // length 2
        assertEquals("hi", maker.makeEven(input));
    }

    @Test
    public void testOddLengthWordAddsSpace() {
        String input = "hey"; // length 3
        assertEquals("hey ", maker.makeEven(input));
    }

    @Test
    public void testUnicodeStillCountsLength() {
        String input = "牛逼"; // length 2 in Java char units
        assertEquals("牛逼", maker.makeEven(input));
    }

    @Test(expected = NullPointerException.class)
    public void testNullInputThrows() {
        maker.makeEven(null);
    }
}
