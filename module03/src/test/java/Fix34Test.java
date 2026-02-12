import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This is the JUnit test for class Fix34.
 * @author Mengyuan Ding
 * @since 2026-01-26
 * course CS5004 (Object-Oriented Programming)
 */

public class Fix34Test {
    private Fix34 f;

    @Before
    public void setUp() {
        f = new Fix34();
    }

    @Test
    public void testBasicCase() {
        assertArrayEquals(
                new int[]{1, 3, 4, 1},
                f.fix34(new int[]{1, 3, 1, 4})
        );
    }

    @Test
    public void testMultipleThrees() {
        assertArrayEquals(
                new int[]{1, 3, 4, 1, 1, 3, 4},
                f.fix34(new int[]{1, 3, 1, 4, 4, 3, 1})
        );
    }

    @Test
    public void testEdgeCase() {
        assertArrayEquals(
                new int[]{3, 4, 2, 2},
                f.fix34(new int[]{3, 2, 2, 4})
        );
    }

    @Test
    public void testFourBeforeThree() {
        assertArrayEquals(
                new int[]{1, 1, 1, 3, 4},
                f.fix34(new int[]{1, 4, 1, 3, 1})
        );
    }
}
