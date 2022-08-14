package Instruments;

public class Piano extends Instrument implements IPlay{

    private int keys;
    public Piano(String type, String colour) {
        super(type, colour);
    }

    @Override
    public String play() {
        return "Loud noise";
    }

    public int getKeys() {
        return 88;
    }
}
