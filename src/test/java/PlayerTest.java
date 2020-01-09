import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    private Player player;
    private Card card;

    @Before
    public void before() {
        player = new Player();
        card = new Card(SuitType.HEARTS, CardValueType.TEN);
    }

    @Test
    public void handStartsEmpty() {
        assertEquals(0, player.handCardCount());
    }

    @Test
    public void canAddCard() {
        player.addCard(card);
        assertEquals(1, player.handCardCount());
    }

    @Test
    public void canGetScore() {
        player.addCard(card);
        assertEquals(10, player.getScore());
    }


}
