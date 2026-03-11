import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author Yunmengze Fang
 * Course: CS5004
 * @since February 25, 2026
 *
 * Test class for haveThree method.
 */
public class Array2haveThreePracticeTest {

    @Test
    public void testHaveThreeCase1() {
        Array2haveThreePractice y = new Array2haveThreePractice();
        assertTrue(y.haveThree(new int[]{3, 1, 3, 1, 3}));
    }

    @Test
    public void testHaveThreeCase2() {
        Array2haveThreePractice y = new Array2haveThreePractice();
        assertFalse(y.haveThree(new int[]{3, 1, 3, 3}));
    }

    @Test
    public void testHaveThreeCase3() {
        Array2haveThreePractice y = new Array2haveThreePractice();
        assertFalse(y.haveThree(new int[]{3, 4, 3, 3, 4}));
    }
}
