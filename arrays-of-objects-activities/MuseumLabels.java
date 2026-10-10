public class MuseumLabels {
    public static void main(String[] args) {
        String[] labels = new String[4];
        labels[0] = "Vase";
        labels[2] = "Map";
        int totalLetters = 0;
        for (int i = 0; i < labels.length; i++) {
            if (labels[i] != null) {
                totalLetters += labels[i].length();
                System.out.println(i + ": " + labels[i].toUpperCase());
            } else {
                System.out.println(i + ": no label");
            }
        }
        System.out.println("Letters: " + totalLetters);
    }
}
