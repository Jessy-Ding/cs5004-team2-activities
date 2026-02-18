/**
 * CodingBat :Array-1 :sameFirstLast
 * Given an array of ints, return true if the array is length 1 or more,
 * and the first element and the last element are equal.
 * @author Kecheng Hu(Caesar)
 * @since 01/27/2026
 * course CS5004 (Object-oriented programming)
 */


public class SameFirstLast {
    /**
     * Returns whether the first and last elements are equal in a non-empty array.
     *
     * @param nums input integer array
     * @return {@code true} if array is non-empty and first element equals last element
     */
    public boolean sameFirstLast(int[] nums) {
        if(nums.length == 0) {
            return false;
        }
        return nums[0] == nums[nums.length - 1];

    }
}
