import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for Module08Example.
 */
public class Module08ExampleTest {
    private Module08Example example;

    @BeforeEach
    void setUp() {
        example = new Module08Example();
    }

    @Test
    void testAddPositiveNumbers() {
        assertEquals(5, example.add(2, 3));
    }

    @Test
    void testAddWithNegativeNumber() {
        assertEquals(1, example.add(3, -2));
    }
}

