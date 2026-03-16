/**
 * Counts words that end in {@code y} or {@code z}, ignoring case.
 *
 * <p>A character counts only when it is the last letter of a word, which means the
 * next character is either absent or not alphabetic.
 *
 * @author Kecheng Hu
 * @since 03/11/2026
 * @version CS5004 Object-Oriented Design
 */
public class CountYZ {
    /**
     * Creates a word-ending counter.
     */
    public CountYZ() {
    }

    /**
     * Counts how many words in the input string end with {@code y} or {@code z}.
     *
     * @param str the input text to inspect
     * @return the number of words whose final letter is {@code y} or {@code z}
     */
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
