/**
 * @author Yunmengze Fang
 * Course: CS5004
 * @since February 25, 2026
 *
 * Test class for haveThree method.
 */

import java.util.Arrays;

public class Array2haveThreePracticeTest {

    public static void main(String[] args) {

        Array2haveThreePractice y = new Array2haveThreePractice();

        int[] test1 = {3, 1, 3, 1, 3};
        System.out.println("Test 1 Input:  " + Arrays.toString(test1));
        System.out.println("Expected:      true");
        System.out.println("Actual:        " + y.haveThree(test1));
        System.out.println();

        int[] test2 = {3, 1, 3, 3};
        System.out.println("Test 2 Input:  " + Arrays.toString(test2));
        System.out.println("Expected:      false");
        System.out.println("Actual:        " + y.haveThree(test2));
        System.out.println();

        int[] test3 = {3, 4, 3, 3, 4};
        System.out.println("Test 3 Input:  " + Arrays.toString(test3));
        System.out.println("Expected:      false");
        System.out.println("Actual:        " + y.haveThree(test3));
    }
}
