
/**
 * CodingBat: Recursion-2 > groupSum
 * <p>
 * Given an array of ints, choose a group of some of the ints, such that the group sums to the given target.
 * Return:true if possible, false otherwise.
 * </p>
 * <pre>{@code
 * groupSum(0, [2, 4, 8], 10) → true
 * groupSum(0, [2, 4, 8], 14) → true
 * groupSum(0, [2, 4, 8], 9) → false
 * }</pre>
 * @author Mengyuan Ding
 * @since 2026-02-10
 * course CS5004 (Object-Oriented Programming)
 */
public class GroupSum {
    /**
     * Determines recursively whether a subset can sum to the target.
     *
     * @param start current index in the array
     * @param nums input integer array
     * @param target remaining target sum
     * @return {@code true} if a valid subset exists; otherwise {@code false}
     */
    public boolean groupSum(int start, int[] nums, int target){
    // base case
    if (start == nums.length) return target == 0;

    // choice 1: take nums[start]
    if (groupSum(start + 1, nums, target - nums[start])) {
        return true;
    }

    // choice 2: skip nums[start]
    return groupSum(start + 1, nums, target);
}
}
