import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the CountYZ class.
 * Verifies the logic for counting words ending in 'y' or 'z', including 
 * case insensitivity, punctuation boundaries, and edge cases.
 * @author Kecheng Hu(Caesar)
 * @version CS5004 Object-Oriented Design
 * @since 03/11/2026
 */
public class CountYZTest {

    private CountYZ counter;

    @BeforeEach
    public void setUp() {
        // Initialize the object before each test to maintain a clean test environment
        counter = new CountYZ();
    }

    /**
     * Tests the basic word counting logic.
     */
    @Test
    public void testBasicCount() {
        assertEquals(2, counter.countYZ("fez day"), "Should correctly count words ending in z and y");
        assertEquals(2, counter.countYZ("day fez"), "Word order should not affect the result");
        assertEquals(2, counter.countYZ("day fyyyz"), "Internal 'y's are not counted, only the last character matters");
    }

    /**
     * Tests if the logic is truly case-insensitive.
     */
    @Test
    public void testCaseInsensitive() {
        assertEquals(2, counter.countYZ("FEZ DAY"), "Should handle all uppercase letters");
        assertEquals(2, counter.countYZ("dAy fEZy"), "Should handle mixed case letters");
    }

    /**
     * Tests that 'y' or 'z' are not counted when they are not at the end of a word.
     */
    @Test
    public void testNotAtEnd() {
        assertEquals(1, counter.countYZ("day yellow"), "The 'y' at the start of 'yellow' should not be counted, only the one in 'day'");
        assertEquals(0, counter.countYZ("yak zebra"), "'y' and 'z' at the start of words should not be counted");
        assertEquals(0, counter.countYZ("pizza"), "'z' in the middle of a word should not be counted");
    }

    /**
     * Tests the use of punctuation, symbols, and numbers as word boundaries.
     */
    @Test
    public void testNonAlphabeticBoundaries() {
        assertEquals(2, counter.countYZ("!!day--fez!!"), "Punctuation should be correctly identified as a word boundary");
        assertEquals(3, counter.countYZ("a:y:b:z:c:y"), "Colon-separated cases should count as 3");
        assertEquals(2, counter.countYZ("day123fez"), "Numbers are not letters, so the 'y' in 'day' counts as an end, and 'fez' is also an end");
    }

    /**
     * Tests edge cases.
     */
    @Test
    public void testEdgeCases() {
        assertEquals(0, counter.countYZ(""), "Empty string should return 0");
        assertEquals(1, counter.countYZ("y"), "Single character 'y' should return 1");
        assertEquals(1, counter.countYZ("Z"), "Single uppercase character 'Z' should return 1");
        assertEquals(0, counter.countYZ("a"), "Single unrelated character should return 0");
        assertEquals(0, counter.countYZ("   "), "String with only spaces should return 0");
    }
}