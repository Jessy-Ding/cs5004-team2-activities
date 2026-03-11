import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Unit tests for the WithoutString class.
 * @author Kecheng Hu(Caesar)
 * @since 03/10/2026
 * @version CS5004 Object-Oriented Design
 */

public class WithoutStringTest {

    private WithoutString ws;

    @BeforeEach
    public void setUp() {
        // Initialize the object before each test to keep a clean test environment
        ws = new WithoutString();
    }

    @Test
    public void testNormalRemoval() {
        // Test basic string removal
        assertEquals("He there", ws.withoutString("Hello there", "llo"), "Should remove middle substring");
        assertEquals("Hllo thr", ws.withoutString("Hello there", "e"), "Should remove multiple single characters");
        assertEquals("Hello there", ws.withoutString("Hello there", "x"), "Should return original string if 'remove' is not found");
    }

    @Test
    public void testCaseInsensitiveRemoval() {
        // Test case-insensitive removal (a core requirement)
        assertEquals("Th  a FH", ws.withoutString("This is a FISH", "IS"), "Should ignore case when matching");
        assertEquals("Hi ", ws.withoutString("Hi HoHo", "ho"), "Should ignore case for multiple occurrences");
    }

    @Test
    public void testNonOverlappingRemoval() {
        // Test non-overlapping removal (skip the matched length directly)
        assertEquals("x", ws.withoutString("xxx", "xx"), "Should not overlap matches. 'xxx' removing 'xx' leaves 'x'");
        assertEquals("ba", ws.withoutString("ababa", "aba"), "Should skip matched length, leaving 'ba'");
    }

    @Test
    public void testEdgeCases() {
        // Test some edge cases
        assertEquals("", ws.withoutString("", "x"), "Empty base string should return empty string");
        assertEquals("", ws.withoutString("xxx", "x"), "Removing a character entirely composed of it should return empty");
         assertEquals("", ws.withoutString("Hello", "Hello"), "Removing the exact string should return empty");
    }
}