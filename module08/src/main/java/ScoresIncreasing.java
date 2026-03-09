/**
 * CodingBat: AP-1 > scoresIncreasing
 * Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.
 * <p>
 * {@code
 * scoresIncreasing([1, 3, 4]) → true
 * scoresIncreasing([1, 3, 2]) → false
 * scoresIncreasing([1, 1, 4]) → true
 * }
 * </p>
 *
 * @author Mengyuan Ding
 * @since 2026-03-09
 * course CS5004 (Object-Oriented Programming)
 */
public class ScoresIncreasing {
    /**
     * Check if the integers in the original list are in ascending order.
     *
     * @param `int[] scores` an array of integers
     * @return boolean true for numbers in ascending order, false otherwise.
     */
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
