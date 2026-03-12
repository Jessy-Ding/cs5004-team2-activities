import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Course: CS5004
 *
 * CodingBat Logic-2 - luckySum
 *
 * JUnit test class for luckySum method.
 *
 * @author Yunmengze Fang
 * @since March 11, 2026
 */

public class LuckySumPracticeTest {

    @Test
    void testLuckySumCase1() {
        LuckySumPractice p = new LuckySumPractice();
        assertEquals(6, p.luckySum(1, 2, 3));
    }

    @Test
    void testLuckySumCase2() {
        LuckySumPractice p = new LuckySumPractice();
        assertEquals(3, p.luckySum(1, 2, 13));
    }

    @Test
    void testLuckySumCase3() {
        LuckySumPractice p = new LuckySumPractice();
        assertEquals(1, p.luckySum(1, 13, 3));
    }

    @Test
    void testLuckySumCase4() {
        LuckySumPractice p = new LuckySumPractice();
        assertEquals(0, p.luckySum(13, 2, 3));
    }
}
