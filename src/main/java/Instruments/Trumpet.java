package Instruments;

public class Trumpet extends Instrument implements IPlay{

    private int valves;

    public Trumpet(String type, String colour) {
        super(type, colour);
    }

    public int getValves() {
        return 3;
    }

    @Override
    public String play() {
        return "duh duh";
    }
}
