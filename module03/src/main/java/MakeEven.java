/**
 * CodeHS : Strings-Make even(level-2)
 * Question description：Given a word or phrase. If the length of that word or phrase is odd,
 * add a space to the end and return it. If it is even, just return it as is.
 * @author Yikang Liu(Richard)
 * @since 01/27/2026
 * course CS5004 (Object-oriented programming)
 */

public class MakeEven {
    public String makeEven(String phrase) {
        if (phrase.length() % 2 != 0) {
            return phrase + " ";
        }
        return phrase;
    }
}
