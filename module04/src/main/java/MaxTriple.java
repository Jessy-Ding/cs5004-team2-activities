/**
 * Given an array of ints of odd length, look at the first, last,
 * and middle values in the array and return the largest.
 * The array length will be at least 1.
 * @author Kecheng Hu(Caesar)
 * @since 02/04/2026
 * course CS5004 (Object-Oriented Programming)
 */
public class MaxTriple {
    /**
     * Returns the largest among the first, middle, and last elements.
     *
     * @param nums input array of odd length
     * @return maximum of first, middle, and last values
     */
    public static int maxTriple(int[] nums) {
        if (nums.length < 1) {
            return -1;
        }

        int first = nums[0];
        int middle = nums[nums.length/2];
        int last = nums[nums.length-1];

        int temp = first;
        if (temp < middle) {
            temp = middle;
        }
        if (temp < last) {
            temp = last;
        }
        return temp;
    }
}
