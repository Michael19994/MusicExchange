package InstrumentsTest;

import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Brass", "Brown");
    }

    @Test
    public void hasKeys() {
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void hasType() {
        assertEquals("Brass", piano.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("Brown", piano.getColour());
    }

    @Test
    public void canPlay() {
        assertEquals("Loud noise", piano.play());
    }
}
