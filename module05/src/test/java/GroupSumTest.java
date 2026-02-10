import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is the JUnit test for class GroupSum.
 * @author Mengyuan Ding
 * @since 2026-02-10
 * course CS5004 (Object-Oriented Programming)
 */
public class GroupSumTest {

    private final GroupSum gs = new GroupSum();

    /* Test for solid cases*/
    @Test
    public void testGroupSum1() {
        assertTrue(gs.groupSum(0, new int[]{2, 4, 8}, 10));
    }

    /* Test for solid cases*/
    @Test
    public void testGroupSum2() {
        assertTrue(gs.groupSum(0, new int[]{2, 4, 8}, 14));
    }

    /* Test for wrong cases*/
    @Test
    public void testGroupSum3() {
        assertFalse(gs.groupSum(0, new int[]{2, 4, 8}, 9));
    }

    /* Test for individual adding case*/
    @Test
    public void testGroupSum4() {
        assertTrue(gs.groupSum(0, new int[]{2, 4, 8}, 8));
    }

    /* Test for empty cases:true*/
    @Test
    public void testGroupSumEmpty() {
        assertTrue(gs.groupSum(0, new int[]{}, 0));
    }

    /* Test for empty cases:false*/
    @Test
    public void testGroupSumEmptyFail() {
        assertFalse(gs.groupSum(0, new int[]{}, 1));
    }

    /* Test for large cases*/
    @Test
    public void testGroupSumLarge() {
        assertTrue(gs.groupSum(0, new int[]{10, 2, 2, 5}, 7));
    }
}
