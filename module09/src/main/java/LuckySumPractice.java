/**
 * Solves the CodingBat {@code luckySum} exercise.
 *
 * <p>The sum stops at the first occurrence of {@code 13}; that value and every value
 * to its right are ignored.
 *
 * @author Yunmengze Fang
 * @since March 11, 2026
 * @version CS5004 Object-Oriented Design
 */

public class LuckySumPractice {
    /**
     * Creates a solver for lucky-sum calculations.
     */
    public LuckySumPractice() {
    }

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
