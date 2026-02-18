/**
 * For this problem, we'll round a positive int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20.
 * Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10.
 * Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
 * @author Kecheng Hu(Caesar)
 * @since 02/17/2026
 * @version CS5004 Object-Oriented Design
 */
public class RoundSum {
    /**
     * Returns the sum of each input rounded to the nearest multiple of 10.
     *
     * @param a first value
     * @param b second value
     * @param c third value
     * @return sum of rounded values
     */
    public static int roundSum(int a, int b, int c) {
        return roundHelper(a) + roundHelper(b) + roundHelper(c);
    }

    /**
     * Rounds one value to the nearest multiple of 10.
     *
     * @param a value to round
     * @return rounded value
     */
    public static int roundHelper(int a) {
        if (a%10 <5) {
            return (a - a%10);
        } else {
            return (a - a%10 + 10);
        }
    }
}
