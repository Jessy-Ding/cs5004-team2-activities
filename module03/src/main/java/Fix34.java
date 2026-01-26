
/**
 * CodingBat: Array-3 > fix34
 * <p>
 * This is a class who returns an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4.
 * Do not move the 3's, but every other number may move.
 * The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
 * </p>
 * <pre>{@code
 * fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
 * fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
 * fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
 * }</pre>
 * @author Mengyuan Ding
 * @since 2026-01-25
 * course CS5004 (Object-Oriented Programming)
 */

public class Fix34 {
        public int[] fix34(int[] nums) {
                int fourIndex = 0;

                for (int i = 0; i < nums.length; i++) {
                        if (nums[i] == 3) {

                                // find the next 4 that is NOT already after a 3
                                while (nums[fourIndex] != 4) {
                                        fourIndex++;
                                }

                                // swap nums[i+1] and nums[fourIndex]
                                int temp = nums[i + 1];
                                nums[i + 1] = nums[fourIndex];
                                nums[fourIndex] = temp;

                                fourIndex++; // move one index for next search
                        }
                }

                return nums;
        }
}
