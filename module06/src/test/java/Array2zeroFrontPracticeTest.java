/**
 * Name: Yunmengze Fang
 * Course: CS5004
 * Date: February 10, 2026
 *
 * Test class for zeroFront method.
 */

import java.util.Arrays;

public class YunmengzeFangTest {

    public static void main(String[] args) {

        YunmengzeFang y = new YunmengzeFang();

        // Test Case 1
        int[] test1 = {1, 0, 0, 1};
        int[] result1 = y.zeroFront(test1);
        System.out.println("Test 1 Input:  " + Arrays.toString(test1));
        System.out.println("Expected:      [0, 0, 1, 1]");
        System.out.println("Actual:        " + Arrays.toString(result1));
        System.out.println();

        // Test Case 2
        int[] test2 = {0, 1, 1, 0, 1};
        int[] result2 = y.zeroFront(test2);
        System.out.println("Test 2 Input:  " + Arrays.toString(test2));
        System.out.println("Expected:      [0, 0, 1, 1, 1]");
        System.out.println("Actual:        " + Arrays.toString(result2));
        System.out.println();

        // Test Case 3
        int[] test3 = {1, 0};
        int[] result3 = y.zeroFront(test3);
        System.out.println("Test 3 Input:  " + Arrays.toString(test3));
        System.out.println("Expected:      [0, 1]");
        System.out.println("Actual:        " + Arrays.toString(result3));
    }
}
