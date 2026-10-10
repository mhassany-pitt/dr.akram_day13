import java.util.Scanner;

class Car {
    String plate;

    Car(String plate) {
        this.plate = plate;
    }
}

public class Main {
    public static int park(Car[] lot, Car car) {
        for (int i = 0; i < lot.length; i++) {
            if (lot[i] == null) {
                lot[i] = car;
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Car[] lot = new Car[n];
        for (int i = 0; i < n; i++) {
            String plate = in.next();
            if (!plate.equals("empty")) {
                lot[i] = new Car(plate);
            }
        }
        Car newCar = new Car(in.next());
        int spot = park(lot, newCar);
        if (spot == -1) {
            System.out.println("Lot is full");
        } else {
            System.out.println("Parked in spot " + spot);
        }
        for (int i = 0; i < lot.length; i++) {
            if (lot[i] == null) {
                System.out.println("empty");
            } else {
                System.out.println(lot[i].plate);
            }
        }
    }
}
