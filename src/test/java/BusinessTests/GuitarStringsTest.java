package BusinessTests;

import Business.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings();
    }

    @Test
    public void hasDescription() {
        assertEquals("Strings for a guitar", guitarStrings.getDescription());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(10, guitarStrings.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(20, guitarStrings.getSellPrice());
    }

    @Test
    public void hasGuitarStringsCalculateMarkup() {
        assertEquals(10, guitarStrings.calculateMarkup(),0.1);
    }
}
