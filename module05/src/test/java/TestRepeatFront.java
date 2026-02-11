import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * this class is used to test Class RepeatFront
 * @author Kecheng Hu(Caesar)
 * @since 02/10/2026
 * @version CS5004 object-oriented design
 */
public class TestRepeatFront {
    @Test
    void testChocolate4() {
        String expected = "ChocChoChC";
        String actual = RepeatFront.repeatFront("Chocolate", 4);
        assertEquals(expected, actual, "Should return 'ChocChoChC' for (Chocolate, 4)");
    }

    @Test
    void testChocolate3() {
        String expected = "ChoChC";
        String actual = RepeatFront.repeatFront("Chocolate", 3);
        assertEquals(expected, actual, "Should return 'ChoChC' for (Chocolate, 3)");
    }

    @Test
    void testIceCream2() {
        String expected = "IcI";
        String actual = RepeatFront.repeatFront("Ice Cream", 2);
        assertEquals(expected, actual, "Should handle spaces correctly");
    }

    @Test
    void testZero() {
        String expected = "";
        String actual = RepeatFront.repeatFront("Ice Cream", 0);
        assertEquals(expected, actual, "Should return empty string when n is 0");
    }

    @Test
    void testFullLength() {
        String expected = "XYZXYX";
        String actual = RepeatFront.repeatFront("XYZ", 3);
        assertEquals(expected, actual, "Should handle n == length correctly");
    }

}
