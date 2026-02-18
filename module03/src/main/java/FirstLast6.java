/**
 * CodingBat Array-1: firstLast6
 * @author Yanshi Liu
 * @since 2026-01-25
 * course CS5004 (Object-Oriented Programming)
 */
public class FirstLast6 {

    /**
     * Returns whether the first or last element in the array is 6.
     *
     * @param nums input integer array
     * @return {@code true} if the first or last element is 6; otherwise {@code false}
     */
    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length -1] == 6;
    }

    /**
     * Runs simple manual examples for quick verification.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] test1 = {1, 2, 6};
        int[] test2 = {6, 1, 2, 3};
        int[] test3 = {13, 6, 1, 2, 3};

        System.out.println(firstLast6(test1)); // true
        System.out.println(firstLast6(test2)); // true
        System.out.println(firstLast6(test3)); // false
    }
}
//javac FirstLast6.java
//java FirstLast6
