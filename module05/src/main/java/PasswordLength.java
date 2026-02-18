/**
 *Write a method that returns whether a String is a valid password length.
 * A valid password must be at least 8 characters.
 * @author Yikang Liu(Richard)
 * @since 02/11/2026
 * @version CS5004 OOD
 */

public class PasswordLength {
    /**
     * Checks if the password length is valid (at least 8 characters).
     *
     * @param password password string to validate
     * @return {@code true} when password is non-null and length is at least 8
     */
    public static boolean isValidPasswordLength(String password) {
        // Handle null input
        if (password == null) {
            return false;
        }

        // Validation logic
        return password.length() >= 8;
    }
}
