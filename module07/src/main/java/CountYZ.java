/**
 * CodingBat: String-3 > countYZ
 * Given a string, count the number of words ending in 'y' or 'z'
 * -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
 * We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
 * (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
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
