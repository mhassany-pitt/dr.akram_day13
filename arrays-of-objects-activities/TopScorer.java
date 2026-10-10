public class TopScorer {
    public static Player findTop(Player[] team) {
        Player best = null;
        for (int i = 0; i < team.length; i++) {
            if (team[i] == null) {
                continue;
            }
            if (best == null || team[i].points > best.points) {
                best = team[i];
            }
        }
        return best;
    }

    public static void main(String[] args) {
        Player[] team = new Player[4];
        team[1] = new Player("Ava", 18);
        team[2] = new Player("Jordan", 27);
        Player top = findTop(team);
        System.out.println("Top scorer: " + top.name);

        Player[] emptyTeam = new Player[3];
        Player none = findTop(emptyTeam);
        System.out.println("Empty team result: " + none);
    }
}

class Player {
    String name;
    int points;

    Player(String name, int points) {
        this.name = name;
        this.points = points;
    }
}
