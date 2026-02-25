/**
 * CodingBat: Array-2 > either24.
 *
 * <p>Returns whether an array contains adjacent {@code 2}s or adjacent {@code 4}s,
 * but not both conditions at the same time.</p>
 *
 * @author Yunmengze Fang
 * @since 2026-02-18
 * course CS5004 (Object-Oriented Programming)
 */

public class Array2either24Practice {
    /**
     * Checks for adjacent {@code 2}s and adjacent {@code 4}s, then returns true only when
     * exactly one pattern is present.
     *
     * @param nums input integer array
     * @return {@code true} if the array has {@code 22} xor {@code 44}; otherwise {@code false}
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

        // return true if exactly one of them is true
        return has22 ^ has44;
    }
}
