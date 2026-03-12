/**
 *
 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
 * but not the 'y' in "yellow" (not case sensitive).
 * We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
 * countYZ("fez day") → 2
 * countYZ("day fez") → 2
 * countYZ("day fyyyz") → 2
 *
 * @author Kecheng Hu
 * @since 03/11/2026
 * @version CS5004 Object-Oriented Design
 */

public class CountYZ {
    public int countYZ(String str) {
        int count = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char currentChar = lowerStr.charAt(i);
            if (currentChar == 'y' || currentChar == 'z') {
                if (i == lowerStr.length() - 1 || !Character.isLetter(lowerStr.charAt(i + 1))) {
                    count++;
                }
            }
        }
        return count;
    }
}
