import java.util.Scanner;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " $" + price;
    }
}

public class Main {
    public static Product[] copyProducts(Product[] products) {
        Product[] copy = new Product[products.length];
        for (int i = 0; i < products.length; i++) {
            copy[i] = new Product(products[i].name, products[i].price);
        }
        return copy;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            products[i] = new Product(in.next(), in.nextInt());
        }
        Product[] sale = copyProducts(products);
        for (int i = 0; i < sale.length; i++) {
            sale[i].price -= 5;
        }
        System.out.println("Regular prices:");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("Sale prices:");
        for (Product p : sale) {
            System.out.println(p);
        }
    }
}
