import java.io.*;
import java.util.*;

public class Main {
    // Test setup: creates inventory.txt. Don't change.
    static {
        try {
            java.nio.file.Files.copy(System.in,
                java.nio.file.Paths.get("inventory.txt"),
                java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new FileInputStream("inventory.txt"));
        int items = 0;
        double total = 0.0;
        while (input.hasNext()) {
            if (input.hasNextInt()) {
                int qty = input.nextInt();
                double price = input.nextDouble();
                total = total + qty * price;
                items++;
            } else {
                input.next();
            }
        }
        System.out.println("Items: " + items);
        System.out.printf("Total value: $%.2f\n", total);
    }
}
