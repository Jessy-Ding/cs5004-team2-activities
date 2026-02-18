/**
 * Name: Yunmengze Fang
 * Course: CS5004
 * Date: February 16, 2026
 *
 * CodingBat - Array-2 - zeroFront
 *
 * Return an array that contains the exact same numbers as the given array,
 * but rearranged so that all the zeros are grouped at the start of the array.
 * The order of the non-zero numbers does not matter.
 * You may modify and return the given array or make a new array.
 */

public class YunmengzeFang {

    public int[] zeroFront(int[] nums) {

        int[] result = new int[nums.length];
        int index = 0;

        // First pass: place all zeros at the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[index] = 0;
                index++;
            }
        }

        // Second pass: place non-zero numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[index] = nums[i];
                index++;
            }
        }

        return result;
    }
}
