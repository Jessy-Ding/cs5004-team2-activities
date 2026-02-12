import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test for class PasswordLength
 * @author Yikang Liu
 * @since 2026-02-11
 * course CS5004 ODD
 */
class TestPasswordLength {

    @Test
    void testValidLength() {
        // Boundary case: exactly 8 characters
        assertTrue(PasswordLength.isValidPasswordLength("12345678"));
        // Longer than 8
        assertTrue(PasswordLength.isValidPasswordLength("password123"));
    }

    @Test
    void testInvalidLength() {
        // Too short
        assertFalse(PasswordLength.isValidPasswordLength("1234567"));
        // Empty string
        assertFalse(PasswordLength.isValidPasswordLength(""));
    }

    @Test
    void testNullInput() {
        // Null case
        assertFalse(PasswordLength.isValidPasswordLength(null));
    }
}
