/**
 * CodingBat: String-3 > countYZ
 * Given a string, count the number of words ending in {@code y} or {@code z}
 * (case-insensitive).
 * A {@code y} or {@code z} is considered to end a word if it is the last character
 * in the string or the next character is not an alphabetic letter.
 * ({@link Character#isLetter(char)} is used for this check.)
 * <p>
 * {@code
 * countYZ("fez day") → 2
 * countYZ("day fez") → 2
 * countYZ("day fyyyz") → 2
 * }
 * </p>
 *
 * @author Mengyuan Ding
 * @since 2026-02-18
 * course CS5004 (Object-Oriented Programming)
 */
public class CountYZ {
    /**
     * Counts word endings in the input string that end with {@code y} or {@code z}.
     *
     * @param str input string to inspect
     * @return number of word endings that are {@code y} or {@code z}
     */
    public int countYZ(String str) {
        int count = 0;
        String lower = str.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char current = lower.charAt(i);
            if (current == 'y' || current == 'z') {
                boolean atEnd = (i == lower.length() - 1);
                boolean nextIsNotLetter = !atEnd && !Character.isLetter(lower.charAt(i + 1));
                if (atEnd || nextIsNotLetter) {
                    count++;
                }
            }
        }

        return count;
    }
}
