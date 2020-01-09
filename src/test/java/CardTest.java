import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;

    @Before
    public void before() {
        card = new Card(SuitType.CLUBS);
    }

    @Test
    public void hasSuit() {
        assertEquals(SuitType.CLUBS, card.getSuit());
    }


}
