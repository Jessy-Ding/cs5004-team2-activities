/**
 * Name: Yunmengze Fang
 * Course: CS5004
 * Date: February 18, 2026
 *
 * Assignment: CodingBat Array-2 - either24
 *
 * Given an array of ints, return true if the array contains
 * a 2 next to a 2 or a 4 next to a 4, but not both.
 *
 * @author Yunmengze Fang
 * @since February 18, 2026
 */
public class Array2either24Practice {

    /**
     * Determines whether the array contains adjacent 2s
     * or adjacent 4s, but not both.
     *
     * @param nums the input integer array
     * @return true if exactly one condition is satisfied; false otherwise
     */
    public boolean either24(int[] nums) {
        boolean has22 = false;
        boolean has44 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                has22 = true;
            }

            if (nums[i] == 4 && nums[i + 1] == 4) {
                has44 = true;
            }
        }

        return has22 ^ has44;
    }
}
