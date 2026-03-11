/**
 *
 * Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive).
 * You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x"
 * withoutString("Hello there", "llo") → "He there
 * withoutString("Hello there", "e") → "Hllo thr"
 * withoutString("Hello there", "x") → "Hello there"
 * @author Kecheng Hu(Caesar)
 * @since 03/10/2026
 * @version CS5004 Object-oriented Design
 */
public class WithoutString {
    public static String withoutString(String base,String remove){
        StringBuilder result = new StringBuilder();
        int bLen = base.length();
        int rLen = remove.length();
        int i = 0;
        while (i < bLen) {
            if(i <= bLen - rLen && base.substring(i,i+rLen).equalsIgnoreCase(remove)) {
                i += rLen;
            } else {
                result.append(base.charAt(i));
                i ++;
            }
        }
        return result.toString();
    }
}
