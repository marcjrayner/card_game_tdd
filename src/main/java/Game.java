import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;

    public Game() {
        this.players = new ArrayList<Player>();
    }

    public int getPlayerCount() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void dealHands(Deck deck) {
        for (Player player : this.players) {
            player.addCard(deck.getFirstCard());
        }
    }

    public Player calculateWinner() {
        Player winner = this.players.get(0);
        for (int i = 1; i < this.players.size(); i++) {
            if (this.players.get(i).getScore() > winner.getScore()) {
                winner = this.players.get(i);
            }
        }
        return winner;
    }

//    public Player calculateWinner() {
//        ArrayList<Player> sortedPlayers = this.players;
//        sortedPlayers.sort()
//
//
//    }
//
}

