public class SeatMap {
    public static void main(String[] args) {
        Guest[] seats = new Guest[5];
        int booked = 3;
        for (int i = 0; i < booked; i++) {
            seats[i] = new Guest("G" + i);
        }

        int empty = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == null) {
                empty++;
            }
        }

        System.out.println("First seat: " + seats[0].name);
        System.out.println("Last seat: " + seats[seats.length - 1]);
        System.out.println("Empty seats: " + empty);
    }
}

class Guest {
    String name;

    Guest(String name) {
        this.name = name;
    }
}
