import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * JUnit tests for class SeeColor.
 *
 * @author Yanshi Liu
 * @since 2026-02-04
 * Course: CS5004 (Object-Oriented Programming)
 */
public class SeeColorTest {

    private SeeColor sc;

    @Before
    public void setUp() {
        sc = new SeeColor();
    }

    @Test
    public void testRed() {
        assertEquals("red", sc.seeColor("redxx"));
    }

    @Test
    public void testBlue() {
        assertEquals("blue", sc.seeColor("blueTimes"));
    }

    @Test
    public void testNoColor() {
        assertEquals("", sc.seeColor("xxred"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", sc.seeColor(""));
    }
}
