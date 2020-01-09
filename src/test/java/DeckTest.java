import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {
    private Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.getCardCount());
    }


    @Test
    public void populateDeckFillsDeck() {
        deck.populateDeck();
        assertEquals(52, deck.getCardCount());
    }

    @Test
    public void canShuffleDeck() {
        deck.populateDeck();
        deck.shuffleDeck();
        Card card1 = deck.getFirstCard();
        deck.shuffleDeck();
        Card card2 = deck.getFirstCard();
        assertTrue(card1 != card2);
    }

}
