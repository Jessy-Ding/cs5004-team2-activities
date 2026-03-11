import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Name: Yunmengze Fang
 * Course: CS5004
 * Date: February 18, 2026
 *
 * Test class for either24 method.
 *
 * @author Yunmengze Fang
 * @since February 18, 2026
 */
public class Array2either24PracticeTest {

    @Test
    public void testEither24Case1() {
        Array2either24Practice y = new Array2either24Practice();
        assertTrue(y.either24(new int[]{1, 2, 2}));
    }

    @Test
    public void testEither24Case2() {
        Array2either24Practice y = new Array2either24Practice();
        assertTrue(y.either24(new int[]{4, 4, 1}));
    }

    @Test
    public void testEither24Case3() {
        Array2either24Practice y = new Array2either24Practice();
        assertFalse(y.either24(new int[]{4, 4, 1, 2, 2}));
    }
}
