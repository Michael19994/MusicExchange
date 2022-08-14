package BusinessTests;

import Business.GuitarStrings;
import Business.PianoKeys;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoKeysTest {

    PianoKeys pianoKeys;

    @Before
    public void before() {
        pianoKeys = new PianoKeys();
    }

    @Test
    public void hasDescription() {
        assertEquals("Keys", pianoKeys.getDescription());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(3, pianoKeys.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(6, pianoKeys.getSellPrice());
    }

    @Test
    public void hasGuitarStringsCalculateMarkup() {
        assertEquals(3, pianoKeys.calculateMarkup(), 0.1);
    }
}
