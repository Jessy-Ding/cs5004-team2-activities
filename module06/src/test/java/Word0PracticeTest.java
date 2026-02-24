    import org.junit.jupiter.api.Test;

    import java.util.HashMap;
    import java.util.Map;

    import static org.junit.jupiter.api.Assertions.assertEquals;

    /**
     * JUnit test for class Word0Practice.
     *
     * @author Hongkun Yi
     * @since 2026-02-17
     * course CS5004
     */
    class Word0PracticeTest {

        @Test
        void testExample1() {
            Word0Practice w = new Word0Practice();

            Map<String, Integer> expected = new HashMap<>();
            expected.put("a", 0);
            expected.put("b", 0);

            assertEquals(expected, w.word0(new String[]{"a", "b", "a", "b"}));
        }

        @Test
        void testExample2() {
            Word0Practice w = new Word0Practice();

            Map<String, Integer> expected = new HashMap<>();
            expected.put("a", 0);
            expected.put("b", 0);
            expected.put("c", 0);

            assertEquals(expected, w.word0(new String[]{"a", "b", "a", "c", "b"}));
        }

        @Test
        void testExample3() {
            Word0Practice w = new Word0Practice();

            Map<String, Integer> expected = new HashMap<>();
            expected.put("a", 0);
            expected.put("b", 0);
            expected.put("c", 0);

            assertEquals(expected, w.word0(new String[]{"c", "b", "a"}));
        }
    }
