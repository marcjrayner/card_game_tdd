public class Card {
    private SuitType suit;
    private CardValueType cardValue;

    public Card(SuitType suit, CardValueType cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public SuitType getSuit() {
        return this.suit;
    }

    public CardValueType getCardValue() {
        return this.cardValue;
    }
}
