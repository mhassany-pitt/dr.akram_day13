public class ParkingLot {
    public static void main(String[] args) {
        Car[] spots = new Car[3];

        for (int i = 0; i < spots.length; i++) {
            spots[i] = new Car("NC-" + (100 + i));
        }

        for (Car c : spots) {
            System.out.println("Parked: " + c.plate);
        }
    }
}

class Car {
    String plate;

    Car(String plate) {
        this.plate = plate;
    }
}
