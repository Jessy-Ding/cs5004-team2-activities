/**
 * @author Yunmengze Fang
 * Course: CS5004
 * @since February 25, 2026
 *
 * CodingBat - Array-2 - haveThree
 *
 * Given an array of ints, return true if the value 3 appears
 * in the array exactly 3 times, and no 3's are next to each other.
 */

public class Array2haveThreePractice {

    public boolean haveThree(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 3) {
                count++;

                // check if next to another 3
                if (i > 0 && nums[i - 1] == 3) {
                    return false;
                }
            }
        }

        return count == 3;
    }
}
