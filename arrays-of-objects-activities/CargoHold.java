public class CargoHold {
    public static void main(String[] args) {
        Crate[] hold = new Crate[5];
        hold[0] = new Crate("rice", 40);
        hold[1] = new Crate("tea", 12);
        hold[3] = new Crate("salt", 25);

        int heavyCount = 0;
        for (int i = 0; i < hold.length; i++) {
            if (hold[i] != null && hold[i].weight > 20) {
                heavyCount++;
                System.out.println("Heavy: " + hold[i].contents);
            }
        }
        System.out.println("Heavy crates: " + heavyCount);
    }
}

class Crate {
    String contents;
    int weight;

    Crate(String contents, int weight) {
        this.contents = contents;
        this.weight = weight;
    }
}
