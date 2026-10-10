public class PlaylistSetup {
    static class Track {
        String title;

        Track(String title) {
            this.title = title;
        }
    }

    public static void main(String[] args) {
        Track[] playlist = new Track[3];
        System.out.println("Length: " + playlist.length);
        System.out.println("Element 0: " + playlist[0]);
        playlist[1] = new Track("Morning Song");
        System.out.println("Element 1: " + playlist[1].title);
        System.out.println("Element 2 is null: " + (playlist[2] == null));
        playlist[1] = null;
        System.out.println("Element 1 is null: " + (playlist[1] == null));
    }
}
