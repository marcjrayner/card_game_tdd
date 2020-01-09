import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    private Game game;
    private Deck deck;
    private Player player1;
    private Player player2;

    @Before
    public void before() {
        game = new Game();
        deck = new Deck();
        player1 = new Player();
        player2 = new Player();
    }

    @Test
    public void playersStartsEmpty() {
        assertEquals(0, game.getPlayerCount());
    }

    @Test
    public void canAddPlayer() {
        game.addPlayer(player1);
        assertEquals(1, game.getPlayerCount());
    }

    @Test
    public void canDealHands() {
        deck.populateDeck();
        deck.shuffleDeck();
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.dealHands(deck);
        assertEquals(1, player1.handCardCount());
        assertEquals(1, player2.handCardCount());
    }

//    @Test
//    public void canDetermineCorrectWinner() {
//        Card card1 = new Card(SuitType.HEARTS, CardValueType.KING);
//        Card card2 = new Card(SuitType.HEARTS, CardValueType.THREE);
//        game.addPlayer(player1);
//        game.addPlayer(player2);
//        player1.addCard(card1);
//        player2.addCard(card2);
//        assertEquals(player1, game.calculateWinner());
//    }
}
