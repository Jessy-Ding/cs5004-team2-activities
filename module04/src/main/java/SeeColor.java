/**
 * CodingBat: String-1 > seeColor
 * Given a string, if the string begins with "red" or "blue" return that color string, otherwise
 * return the empty string.
 *
 * @author Yanshi Liu
 * @since 2026-02-04
 * course CS5004 (Object-Oriented Programming)
 */

public class SeeColor {

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        SeeColor sc = new SeeColor();
        System.out.println(sc.seeColor("redxx"));
        System.out.println(sc.seeColor("xxred"));
        System.out.println(sc.seeColor("blueTimes"));
    }
}

//javac SeeColor.java
//java SeeColor
