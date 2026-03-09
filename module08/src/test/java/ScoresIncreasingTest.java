import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * JUnit test for class ScoresIncreasing
 * @author Mengyuan Ding
 * @since 2026-03-09
 * course CS5004
 */
public class ScoresIncreasingTest {
    private ScoresIncreasing scoresIncreasing;

    @BeforeEach
    void setUp() {
        scoresIncreasing = new ScoresIncreasing();
    }

    @Test
    void testStrictlyIncreasingReturnsTrue() {
        assertTrue(scoresIncreasing.scoresIncreasing(new int[]{1, 3, 4}));
    }

    @Test
    void testHasDecreaseReturnsFalse() {
        assertFalse(scoresIncreasing.scoresIncreasing(new int[]{1, 3, 2}));
    }

    @Test
    void testEqualAdjacentValuesReturnsTrue() {
        assertTrue(scoresIncreasing.scoresIncreasing(new int[]{1, 1, 4}));
    }

    @Test
    void testLengthTwoIncreasingReturnsTrue() {
        assertTrue(scoresIncreasing.scoresIncreasing(new int[]{2, 2}));
    }
}
