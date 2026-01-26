/**
 * CodingBat Array-1: firstLast6
 * @author Yanshi Liu
 * * @date 2026-01-25
 * @course CS5004 (Object-Oriented Programming)
 */
public class FirstLast6_Yanshi_Liu {

    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length -1] == 6;
    }

    // main method for testing
    public static void main(String[] args) {
        int[] test1 = {1, 2, 6};
        int[] test2 = {6, 1, 2, 3};
        int[] test3 = {13, 6, 1, 2, 3};

        System.out.println(firstLast6(test1)); // true
        System.out.println(firstLast6(test2)); // true
        System.out.println(firstLast6(test3)); // false
    }
}
//javac FirstLast6_Yanshi_Liu.java
//java FirstLast6_Yanshi_Liu