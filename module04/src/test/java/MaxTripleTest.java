import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class is used to test method maxTriple
 * @author Kecheng Hu(Caesar)
 * @since 02/04/2026
 * course CS5004 (Object-Oriented Programming)
 */


public class MaxTripleTest {
    @Test
    void testEmpty() {
        int[] input = {};
        int result = MaxTriple.maxTriple(input);
        assertEquals(-1,result);

    }

    @Test
    void testOneElement() {
        int[] input = {5};
        int result = MaxTriple.maxTriple(input);
        assertEquals(5,result);
    }

    @Test
    void testFirstIsMax() {
        int[] input = {5,3,1};
        int result = MaxTriple.maxTriple(input);
        assertEquals(5,result);

    }

    @Test
    void testMiddleIsMax() {
        int[] input = {3,7,5};
        int result = MaxTriple.maxTriple(input);
        assertEquals(7,result);
    }

    @Test
    void testLastIsMax() {
        int[] input = {3,5,7};
        int result = MaxTriple.maxTriple(input);
        assertEquals(7,result);

    }


}
