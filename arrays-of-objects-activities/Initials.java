public class Initials {
    public static void main(String[] args) {
        String[] bank = new String[4];
        bank[0] = "apple";
        int slot = 2;
        bank[slot] = "kiwi";

        String initials = "";
        int stored = 0;
        for (int i = 0; i < bank.length; i++) {
            if (bank[i] != null) {
                initials += bank[i].toUpperCase().charAt(0);
                stored++;
            } else {
                initials += "_";
            }
        }

        System.out.println(initials);
        System.out.println("Words stored: " + stored);
    }
}
