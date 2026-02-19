import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * JUnit test for class countYZ
 * @author Mengyuan Ding
 * @since 2026-02-18
 * course CS5004
 */
public class CountYZTest {
    private CountYZ solver; //global var

    @BeforeEach
    void setUp() {
        solver = new CountYZ(); //build once
    }

    @Test
    void testExamples() {
        assertEquals(2, solver.countYZ("fez day"));
        assertEquals(2, solver.countYZ("day fez"));
        assertEquals(2, solver.countYZ("day fyyyz"));
    }

    @Test
    void testMixedCaseAndPunctuation() {
        assertEquals(3, solver.countYZ("Crazy? daY! fEz."));
    }

    @Test
    void testNotEndingWhenFollowedByLetter() {
        assertEquals(0, solver.countYZ("yellow zebra yza"));
    }

    @Test
    void testSingleWordEndings() {
        assertEquals(1, solver.countYZ("y"));
        assertEquals(1, solver.countYZ("z"));
        assertEquals(2, solver.countYZ("y z"));
    }
}
