/**
 * Returns greeting text for the CodingBat {@code helloName} exercise.
 *
 * @author Hongkun Yi
 * @since 2026-03-11
 * @version CS5004 Object-Oriented Design
 */
public class HelloName {
    /**
     * Creates a greeting formatter.
     */
    public HelloName() {
    }

    /**
     * Returns a greeting string in the form "Hello [name]!".
     *
     * @param name the name to greet
     * @return a greeting in the format {@code Hello <name>!}
     */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
}
