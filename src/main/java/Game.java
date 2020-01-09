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
//
//    public Player calculateWinner() {
//        Player winner;
//        for (Player player : this.players) {
//            player.
//        }


}

