import java.io.*;
import java.util.*;

public class Main {
    // Test setup: creates steps.txt. Don't change.
    static {
        try {
            java.nio.file.Files.copy(System.in,
                java.nio.file.Paths.get("steps.txt"),
                java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new FileInputStream("steps.txt"));
        int days = 0;
        int total = 0;
        while (input.hasNextInt()) {
            total = total + input.nextInt();
            days++;
        }
        System.out.println("Days: " + days);
        System.out.println("Total: " + total);
        System.out.printf("Average: %.1f\n", (double) total / days);
    }
}