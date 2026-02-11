/**
 * CodingBat: Array-1 > sum2
 * <p>
 *
 * Given an array of ints, return the sum of the first 2 elements in the array.
 * If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
 * </p>
 * <pre>{@code
 * sum2([1, 2, 3]) → 3
 * sum2([1, 1]) → 2
 * sum2([1, 1, 1, 1]) → 2
 * }</pre>
 * @author Yanshi Liu
 * @since 2026-02-10
 * course CS5004 (Object-Oriented Programming)
 */
public class Sum2 {
    public int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return nums[0] + nums[1];
    }
}
