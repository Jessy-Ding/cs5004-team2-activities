import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The ArrayListPractice class provides a solution to handle and process
 * a two-dimensional, ragged collection of integers.
 * <p>
 * The program reads input to populate the data, then processes queries to retrieve elements
 * from specific positions.
 * </p>
 *
 * <p>Input:</p>
 * <ol>
 *   <li>An integer {@code n} (number of rows).</li>
 *   <li>For each row: an integer {@code d} followed by {@code d} integers.</li>
 *   <li>An integer {@code q} (number of queries).</li>
 *   <li>{@code q} queries, each with {@code x y} (1-based row/column indices).</li>
 * </ol>
 *
 * <p>Output:</p>
 * <ul>
 *   <li>The requested integer, or {@code ERROR!} if out of bounds.</li>
 * </ul>
 *
 * @author Mengyuan Ding
 * @since 2026-02-16
 * course CS5004 (Object-Oriented Programming)
 */
public class ArrayListPractice {
    /**
     * Reads input rows and queries, then prints queried values or {@code ERROR!}.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<int[]> data = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            int[] row = new int[d];
            for (int j = 0; j < d; j++) {
                row[j] = sc.nextInt();
            }
            data.add(row);
        }

        int q = sc.nextInt();
        for (int k = 0; k < q; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int rowIndex = x - 1;   // queries are 1-based
            int colIndex = y - 1;

            if (rowIndex < 0 || rowIndex >= data.size()
                    || colIndex < 0 || colIndex >= data.get(rowIndex).length) {
                System.out.println("ERROR!");
            } else {
                System.out.println(data.get(rowIndex)[colIndex]);
            }
        }
    }
}
