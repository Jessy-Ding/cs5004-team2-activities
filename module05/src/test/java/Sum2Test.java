import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test for class Sum2.
 * @author Yanshi Liu
 * @since 2026-02-10
 * course CS5004 (Object-Oriented Programming)
 */
public class Sum2Test {

    private final Sum2 s2 = new Sum2();

    @Test
    public void testSum2FirstTwo() {
        assertEquals(3, s2.sum2(new int[]{1, 2, 3}));
    }

    @Test
    public void testSum2LengthTwo() {
        assertEquals(2, s2.sum2(new int[]{1, 1}));
    }

    @Test
    public void testSum2LengthFour() {
        assertEquals(2, s2.sum2(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void testSum2Empty() {
        assertEquals(0, s2.sum2(new int[]{}));
    }

    @Test
    public void testSum2Single() {
        assertEquals(5, s2.sum2(new int[]{5}));
    }
}
