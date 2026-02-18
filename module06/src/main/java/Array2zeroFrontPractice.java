/**
 * @author Yunmengze Fang
 * Course: CS5004
 * @since February 10, 2026
 * CodingBat - Array-2 - zeroFront
 * Return an array that contains the exact same numbers as the given array,
 * but rearranged so that all the zeros are grouped at the start of the array.
 * The order of the non-zero numbers does not matter.
 */

public class Array2zeroFrontPractice {

    /**
     * Rearranges values so all zeros appear first.
     *
     * @param nums input integer array
     * @return reordered array containing the same values with zeros at the front
     */
    public int[] zeroFront(int[] nums) {

        int[] result = new int[nums.length];
        int index = 0;

        // First pass: place zeros at the front
        for (int num : nums) {
            if (num == 0) {
                result[index] = 0;
                index++;
            }
        }

        // Second pass: place non-zero values
        for (int num : nums) {
            if (num != 0) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }
}
