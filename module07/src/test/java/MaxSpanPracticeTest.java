import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit test for class MaxSpanPractice.
 *
 * @author Hongkun Yi
 * @since 2026-02-18
 * course CS5004
 */
class MaxSpanPracticeTest {

    @Test
    void testExample1() {
        MaxSpanPractice m = new MaxSpanPractice();
        assertEquals(4, m.maxSpan(new int[]{1, 2, 1, 1, 3}));
    }

    @Test
    void testExample2() {
        MaxSpanPractice m = new MaxSpanPractice();
        assertEquals(6, m.maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
    }

    @Test
    void testExample3() {
        MaxSpanPractice m = new MaxSpanPractice();
        assertEquals(6, m.maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
    }
}
