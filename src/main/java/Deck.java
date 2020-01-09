import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int getCardCount() {
        return this.cards.size();
    }

    public void populateDeck() {
        for (SuitType suit : SuitType.values()) {
            for (CardValueType cardValue : CardValueType.values()) {
                Card newCard = new Card(suit, cardValue);
                this.cards.add(newCard);
            }
        }
    }

}
