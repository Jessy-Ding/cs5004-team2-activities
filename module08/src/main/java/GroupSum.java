/**
 * CodingBat: Recursion-2 > groupSum.
 * Given an array of ints, is it possible to choose a group of some of the ints,
 * such that the group sums to the given target?
 *
 * @author Hongkun Yi
 * @since 2026-02-25
 * course CS5004
 */
public class GroupSum {

    /**
     * Returns true if a subset of nums[start..end] can sum to target.
     *
     * @param start  starting index to consider
     * @param nums   input array of integers
     * @param target desired sum
     * @return true if possible, otherwise false
     */
    public boolean groupSum(int start, int[] nums, int target) {

        // base case: considered all elements
        if (start >= nums.length) {
            return target == 0;
        }

        // choose to include nums[start]
        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }

        // choose to not include nums[start]
        return groupSum(start + 1, nums, target);
    }
}
