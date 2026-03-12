import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit test for class HelloName.
 *
 * @author Hongkun Yi
 * @since 2026-03-11
 * course CS5004
 */
class HelloNameTest {

    /**
     * helloName("Bob") -> "Hello Bob!"
     */
    @Test
    void testBob() {
        HelloName h = new HelloName();
        assertEquals("Hello Bob!", h.helloName("Bob"));
    }

    /**
     * helloName("Alice") -> "Hello Alice!"
     */
    @Test
    void testAlice() {
        HelloName h = new HelloName();
        assertEquals("Hello Alice!", h.helloName("Alice"));
    }

    /**
     * helloName("X") -> "Hello X!"
     */
    @Test
    void testSingleChar() {
        HelloName h = new HelloName();
        assertEquals("Hello X!", h.helloName("X"));
    }

    /**
     * helloName("") -> "Hello !"
     */
    @Test
    void testEmptyString() {
        HelloName h = new HelloName();
        assertEquals("Hello !", h.helloName(""));
    }

    /**
     * helloName("Hongkun") -> "Hello Hongkun!"
     */
    @Test
    void testLongerName() {
        HelloName h = new HelloName();
        assertEquals("Hello Hongkun!", h.helloName("Hongkun"));
    }
}
