/**
 *Given a string and an int n, return a string made of the first n characters of the string,
 *followed by the first n-1 characters of the string, and so on.
 *You may assume that n is between 0 and the length of the string,
 *inclusive (i.e. n >= 0 and n <= str.length()).
 * @author Kecheng Hu(Caesar)
 * @since 02/10/2026
 * @version CS5004 object-oriented design
 */
public class RepeatFront {
    public static String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();
        for( int i = n; i > 0; i--) {
            result.append(str, 0, i);
        }
        return result.toString();
    }
}
