import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

/**
 * This is the JUnit test for class WordMultiple.
 * @author Mengyuan Ding
 * @since 2026-02-03
 * course CS5004 (Object-Oriented Programming)
 */
public class WordMultipleTest {
    private WordMultiple wm;

    @Before
    public void setUp() {
        wm = new WordMultiple();
    }

    @Test
    public void testBasicCase() {
        String[] input = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> result = wm.wordMultiple(input);
        
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", true);
        expected.put("c", false);
        
        assertEquals("Should return correct map for basic case", expected, result);
    }

    @Test
    public void testUniqueStrings() {
        String[] input = {"c", "b", "a"};
        Map<String, Boolean> result = wm.wordMultiple(input);
        
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", false);
        expected.put("b", false);
        expected.put("c", false);
        
        assertEquals("Should return correct map for unique strings", expected, result);
    }

    @Test
    public void testAllSameStrings() {
        String[] input = {"c", "c", "c", "c"};
        Map<String, Boolean> result = wm.wordMultiple(input);
        
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("c", true);
        
        assertEquals("Should return correct map for all same strings", expected, result);
    }

    @Test
    public void testEmptyArray() {
        String[] input = {};
        Map<String, Boolean> result = wm.wordMultiple(input);
        
        Map<String, Boolean> expected = new HashMap<>();
        
        assertEquals("Should return empty map for empty array", expected, result);
    }
}
