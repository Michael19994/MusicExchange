package InstrumentsTest;

import org.junit.Before;
import org.junit.Test;
import Instruments.Guitar;
import Instruments.Piano;
import Instruments.Trumpet;
import Instruments.IPlay;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;


    @Before
    public void before() {
        trumpet = new Trumpet("Brass", "Golden");
    }

    @Test
    public void hasValves() {
        assertEquals(3, trumpet.getValves());
    }
    @Test
    public void hasType() {
        assertEquals("Brass", trumpet.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Golden", trumpet.getColour());
    }

    @Test
    public void canPlay() {
        assertEquals("duh duh", trumpet.play());
    }
}
