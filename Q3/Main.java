import java.util.Scanner;

class Book {
    String title;
    int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
}

public class Main {
    public static Book findBook(Book[] shelf, String target) {
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i].title.equals(target)) {
                return shelf[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Book[] shelf = new Book[n];
        for (int i = 0; i < n; i++) {
            shelf[i] = new Book(in.next(), in.nextInt());
        }
        String target = in.next();
        Book found = findBook(shelf, target);
        if (found != null) {
            System.out.println("Pages: " + found.pages);
        } else {
            System.out.println("Not found");
        }
    }
}
