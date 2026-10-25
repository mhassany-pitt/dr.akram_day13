import java.io.*;
import java.util.*;

public class Main {
    // Test setup: creates grades.txt. Don't change.
    static {
        try {
            java.nio.file.Files.copy(System.in,
                java.nio.file.Paths.get("grades.txt"),
                java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new FileInputStream("grades.txt"));
        while (input.hasNext()) {
            String name = input.next();
            int sum = input.nextInt() + input.nextInt() + input.nextInt();
            System.out.printf("%s: %.1f\n", name, sum / 3.0);
        }
    }
}
