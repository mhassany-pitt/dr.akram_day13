public class ClickCounters {
    public static void main(String[] args) {
        Counter[] counters = new Counter[3];
        Counter shared = new Counter(10);
        counters[0] = shared;
        counters[1] = new Counter(4);
        counters[2] = shared;

        for (int i = 0; i < 2; i++) {
            counters[0].click();
        }
        counters[1].click();

        System.out.println("counters[0]: " + counters[0].count);
        System.out.println("counters[1]: " + counters[1].count);
        System.out.println("counters[2]: " + counters[2].count);
    }
}

class Counter {
    int count;

    Counter(int start) {
        this.count = start;
    }

    void click() {
        this.count++;
    }
}
