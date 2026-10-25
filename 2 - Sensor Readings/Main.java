import java.io.*;
import java.util.*;

public class Main {
    // Test setup: creates readings.txt. Don't change.
    static {
        try {
            java.nio.file.Files.copy(System.in,
                java.nio.file.Paths.get("readings.txt"),
                java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new FileInputStream("readings.txt"));
        int valid = 0;
        int errors = 0;
        double highest = 0.0;
        while (input.hasNext()) {
            if (input.hasNextDouble()) {
                double reading = input.nextDouble();
                if (valid == 0 || reading > highest) {
                    highest = reading;
                }
                valid++;
            } else {
                input.next();
                errors++;
            }
        }
        System.out.println("Valid readings: " + valid);
        System.out.println("Errors: " + errors);
        System.out.printf("Highest: %.1f\n", highest);
    }
}
