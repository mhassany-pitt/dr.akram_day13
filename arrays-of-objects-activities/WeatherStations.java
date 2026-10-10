public class WeatherStations {
    static class Station {
        int temperature;

        Station(int temperature) {
            this.temperature = temperature;
        }
    }

    public static void main(String[] args) {
        Station[] stations = new Station[3];
        System.out.println("Before setup: " + (stations[0] == null));
        for (int i = 0; i < stations.length; i++) {
            stations[i] = new Station(10 + i);
        }
        stations[0].temperature += 5;
        for (int i = 0; i < stations.length; i++) {
            System.out.println("Station " + i + ": " + stations[i].temperature);
        }
        System.out.println("Same station: " + (stations[0] == stations[1]));
    }
}
