import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * This is used to test RoundSum.
 * @author Kecheng Hu(Caesar)
 * @since 02/17/2026
 * @version CS5004 Object-Oriented Design
 */
class RoundSumTest {

    @Test
    void testRoundHelper_RoundDown() {
        assertEquals(10, RoundSum.roundHelper(14));
        assertEquals(10, RoundSum.roundHelper(12));
        assertEquals(0, RoundSum.roundHelper(1));
    }

    @Test
    void testRoundHelper_RoundUp() {
        assertEquals(20, RoundSum.roundHelper(15));
        assertEquals(20, RoundSum.roundHelper(19));
        assertEquals(10, RoundSum.roundHelper(6));
    }

    @Test
    void testRoundHelper_AlreadyRound() {
        assertEquals(10, RoundSum.roundHelper(10));
        assertEquals(100, RoundSum.roundHelper(100));
        assertEquals(0, RoundSum.roundHelper(0));
    }

    @Test
    void testRoundSum_AllRoundUp() {
        assertEquals(60, RoundSum.roundSum(16, 17, 18));
    }

    @Test
    void testRoundSum_AllRoundDown() {
        assertEquals(30, RoundSum.roundSum(12, 13, 14));
    }

    @Test
    void testRoundSum_BoundaryMix() {
        assertEquals(20, RoundSum.roundSum(4, 5, 10));
    }
}