/**
 * @author: Yunmengze Fang
 * Course: CS5004
 * @since: February 10, 2026
 *
 * Test class for zeroFront method.
 */

import java.util.Arrays;

public class Array2zeroFrontPracticeTest {

    public static void main(String[] args) {

        Array2zeroFrontPractice y = new Array2zeroFrontPractice();

        int[] test1 = {1, 0, 0, 1};
        System.out.println("Test 1 Input:  " + Arrays.toString(test1));
        System.out.println("Expected:      [0, 0, 1, 1]");
        System.out.println("Actual:        " + Arrays.toString(y.zeroFront(test1)));
        System.out.println();

        int[] test2 = {0, 1, 1, 0, 1};
        System.out.println("Test 2 Input:  " + Arrays.toString(test2));
        System.out.println("Expected:      [0, 0, 1, 1, 1]");
        System.out.println("Actual:        " + Arrays.toString(y.zeroFront(test2)));
        System.out.println();

        int[] test3 = {1, 0};
        System.out.println("Test 3 Input:  " + Arrays.toString(test3));
        System.out.println("Expected:      [0, 1]");
        System.out.println("Actual:        " + Arrays.toString(y.zeroFront(test3)));
    }
}
