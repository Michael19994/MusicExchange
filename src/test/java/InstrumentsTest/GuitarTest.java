package InstrumentsTest;
import Instruments.Guitar;
import Instruments.Piano;
import Instruments.Trumpet;
import Instruments.IPlay;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarTest {

    Guitar guitar;


    @Before
    public void before() {
        guitar = new Guitar("Brass", "Bronze");
    }

    @Test
    public void hasStrings() {
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void hasType() {
        assertEquals("Brass", guitar.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Bronze", guitar.getColour());
    }

    @Test
    public void canPlay() {
        assertEquals("ping", guitar.play());
    }
}
