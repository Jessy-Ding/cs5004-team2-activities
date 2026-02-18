import java.util.Map;
import java.util.HashMap;

/**
 * Name: Hongkun Yi
 * Course: CS5004
 * Date: February 17, 2026
 *
 * CodingBat - Map-2 - word0
 *
 * Given an array of strings, return a Map<String, Integer> containing a key
 * for every different string in the array, always with the value 0.
 * For example the string "hello" makes the pair "hello":0.
 */
public class Word0Practice {

    /**
     * Returns a map with a key for each distinct string in the array,
     * where every key maps to the value 0.
     *
     * @param strings input array of strings
     * @return map of distinct strings to 0
     */
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String s : strings) {
            result.put(s, 0);
        }

        return result;
    }
}
