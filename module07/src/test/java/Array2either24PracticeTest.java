/**
 * @author: Yunmengze Fang
 * Course: CS5004
 * @since: February 18, 2026
 *
 * Test class for either24 method.
 */

import java.util.Arrays;

public class Array2either24PracticeTest {

    public static void main(String[] args) {

        Array2either24Practice y = new Array2either24Practice();

        int[] test1 = {1, 2, 2};
        System.out.println("Test 1 Input:  " + Arrays.toString(test1));
        System.out.println("Expected:      true");
        System.out.println("Actual:        " + y.either24(test1));
        System.out.println();

        int[] test2 = {4, 4, 1};
        System.out.println("Test 2 Input:  " + Arrays.toString(test2));
        System.out.println("Expected:      true");
        System.out.println("Actual:        " + y.either24(test2));
        System.out.println();

        int[] test3 = {4, 4, 1, 2, 2};
        System.out.println("Test 3 Input:  " + Arrays.toString(test3));
        System.out.println("Expected:      false");
        System.out.println("Actual:        " + y.either24(test3));
    }
}
