/**
 * Course: CS5004
 *
 * CodingBat Logic-2 - luckySum
 *
 * Given 3 int values, a b c, return their sum. However, if one
 * of the values is 13 then it does not count towards the sum and
 * values to its right do not count.
 *
 * @author Yunmengze Fang
 * @since February 25, 2026
 */

public class LuckySumPractice {

    /**
     * Returns the sum of three integers following the luckySum rule.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return the calculated lucky sum
     */
    public int luckySum(int a, int b, int c) {

        if (a == 13) {
            return 0;
        }

        if (b == 13) {
            return a;
        }

        if (c == 13) {
            return a + b;
        }

        return a + b + c;
    }
}
