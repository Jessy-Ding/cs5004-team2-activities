import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the SumDigits class.
 * Tests ensure the recursive logic correctly sums the digits of various integers.
 * @author Kecheng Hu(Caesar)
 * @since 02/18/2026
 * @version CS5004 Object-Oriented Programming
 */

public class SumDigitsTest {

    @Test
    public void testSingleDigit() {
        // Base case: n < 10 should return n
        assertEquals(5, SumDigits.sumDigits(5));
        assertEquals(0, SumDigits.sumDigits(0));
    }

    @Test
    public void testTwoDigits() {
        // 1 + 9 = 10
        assertEquals(10, SumDigits.sumDigits(19));
        // 2 + 0 = 2
        assertEquals(2, SumDigits.sumDigits(20));
    }

    @Test
    public void testMultipleDigits() {
        // 1 + 2 + 3 = 6
        assertEquals(6, SumDigits.sumDigits(123));
        // 9 + 9 + 9 + 9 = 36
        assertEquals(36, SumDigits.sumDigits(9999));
    }

    @Test
    public void testLargeNumber() {
        // 1 + 0 + 0 + 0 + 0 + 1 = 2
        assertEquals(2, SumDigits.sumDigits(100001));
    }
}