public class GameTokens {
    static class Token {
        int score;

        Token(int score) {
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Token[] players = new Token[3];
        Token shared = new Token(5);
        for (int i = 0; i < players.length; i++) {
            players[i] = shared;
        }
        players[0].score += 2;
        System.out.println("Player 1: " + players[1].score);
        players[2] = new Token(20);
        players[2].score++;
        System.out.println("Shared: " + shared.score);
        System.out.println("Player 2: " + players[2].score);
        System.out.println("Players 0 and 1 share: " + (players[0] == players[1]));
        System.out.println("Players 0 and 2 share: " + (players[0] == players[2]));
    }
}
