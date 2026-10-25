import java.io.*;
import java.util.*;

public class Main {
    // Test setup: creates essay.txt. Don't change.
    static {
        try {
            java.nio.file.Files.copy(System.in,
                java.nio.file.Paths.get("essay.txt"),
                java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new FileInputStream("essay.txt"));
        int count = 0;
        String longest = "";
        while (input.hasNext()) {
            String word = input.next();
            count++;
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Words: " + count);
        System.out.println("Longest: " + longest);
    }
}
