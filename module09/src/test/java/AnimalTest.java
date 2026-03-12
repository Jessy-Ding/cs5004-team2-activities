import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * JUnit test for class Animal.
 *
 * @author Mengyuan Ding
 * @since 2026-03-11
 * course CS5004
 */
public class AnimalTest {

    /**
     * Verifies that a bird instance prints the expected sequence of actions.
     */
    @Test
    void birdCanWalkFlyAndSing() {
        Bird bird = new Bird();

        String output = captureOutput(() -> {
            bird.walk();
            bird.fly();
            bird.sing();
        });

        assertEquals("""
                I am walking
                I am flying
                I am singing
                """, output);
    }

    /**
     * Verifies that the main method prints the required output.
     */
    @Test
    void mainPrintsExpectedLines() {
        String output = captureOutput(() -> Solution.main(new String[]{}));

        assertEquals("""
                I am walking
                I am flying
                I am singing
                """, output);
    }

    /**
     * Captures text written to standard output while the provided action runs.
     *
     * @param action code that writes to {@code System.out}
     * @return captured output normalized to Unix line endings
     */
    private String captureOutput(Runnable action) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(outputStream));
            action.run();
        } finally {
            System.setOut(originalOut);
        }

        return outputStream.toString().replace("\r\n", "\n");
    }
}
