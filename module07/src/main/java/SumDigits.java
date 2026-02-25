/**
 * CodingBat: Recursion-1 > sumDigits.
 *
 * <p>Given a non-negative integer {@code n}, returns the sum of its digits recursively
 * (without loops). Mod by 10 gets the rightmost digit and division by 10 removes
 * the rightmost digit.</p>
 *
 * <p>Examples:
 * {@code sumDigits(126) = 9}, {@code sumDigits(49) = 13}, {@code sumDigits(12) = 3}</p>
 *
 * @author Kecheng Hu(Caesar)
 * @since 2026-02-18
 * course CS5004 (Object-Oriented Programming)
 */
public class SumDigits {
    /**
     * Recursively computes the digit sum for a non-negative integer.
     *
     * @param n non-negative integer input
     * @return sum of all decimal digits in {@code n}
     */
    public static int sumDigits(int n) {
        //base case
        if (n<10) {
            return n;
        }
        return (n%10) + sumDigits(n/10);
    }
}
