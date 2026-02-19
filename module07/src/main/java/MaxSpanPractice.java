/**
 * @author  Hongkun Yi
 * Course: CS5004
 * @since February 18, 2026
 *
 * CodingBat - Array-3 - maxSpan
 *
 * Consider the leftmost and rightmost appearances of some value in an array.
 * The "span" is the number of elements between the two inclusive.
 * A single value has a span of 1.
 *
 * Returns the largest span found in the given array.
 */
public class MaxSpanPractice {

    /**
     * Returns the largest span found in the array.
     *
     * @param nums input array of integers
     * @return maximum span between equal values
     */
    public int maxSpan(int[] nums) {

        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = nums.length - 1; j >= i; j--) {

                if (nums[j] == nums[i]) {

                    int span = j - i + 1;

                    if (span > max) {
                        max = span;
                    }

                    break; // found the rightmost match for nums[i]
                }
            }
        }

        return max;
    }
}
