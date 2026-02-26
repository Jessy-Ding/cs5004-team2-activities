import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit test for class GroupSum.
 *
 * @author Hongkun Yi
 * @since 2026-02-25
 * course CS5004
 */
class GroupSumTest {

    /**
     * groupSum(0, [2, 4, 8], 10) -> true
     */
    @Test
    void testExample1() {
        GroupSum g = new GroupSum();
        assertEquals(true, g.groupSum(0, new int[]{2, 4, 8}, 10));
    }

    /**
     * groupSum(0, [2, 4, 8], 14) -> true
     */
    @Test
    void testExample2() {
        GroupSum g = new GroupSum();
        assertEquals(true, g.groupSum(0, new int[]{2, 4, 8}, 14));
    }

    /**
     * groupSum(0, [2, 4, 8], 9) -> false
     */
    @Test
    void testExample3() {
        GroupSum g = new GroupSum();
        assertEquals(false, g.groupSum(0, new int[]{2, 4, 8}, 9));
    }

    /**
     * Empty array:
     * groupSum(0, [], 0) -> true
     */
    @Test
    void testEmptyArrayTargetZero() {
        GroupSum g = new GroupSum();
        assertEquals(true, g.groupSum(0, new int[]{}, 0));
    }

    /**
     * Empty array:
     * groupSum(0, [], 5) -> false
     */
    @Test
    void testEmptyArrayTargetNonZero() {
        GroupSum g = new GroupSum();
        assertEquals(false, g.groupSum(0, new int[]{}, 5));
    }

    /**
     * Start not zero:
     * groupSum(1, [2, 4, 8], 8) -> true (pick 8)
     */
    @Test
    void testStartNotZero() {
        GroupSum g = new GroupSum();
        assertEquals(true, g.groupSum(1, new int[]{2, 4, 8}, 8));
    }
}
