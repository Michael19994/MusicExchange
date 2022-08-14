package BusinessTests;

import Business.GuitarStrings;
import Business.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MusicSheetTest {

    MusicSheet musicSheet;

    @Before
    public void before() {
        musicSheet = new MusicSheet();
    }

    @Test
    public void hasDescription() {
        assertEquals("Lyrics", musicSheet.getDescription());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(1, musicSheet.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(2, musicSheet.getSellPrice());
    }

    @Test
    public void hasMusicSheetCalculateMarkuo() {
        assertEquals(1, musicSheet.calculateMarkup(),0.1);
    }
}
