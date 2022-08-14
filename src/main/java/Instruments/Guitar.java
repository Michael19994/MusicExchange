package Instruments;

public class Guitar extends Instrument implements IPlay{
    private int strings;

    public Guitar(String type, String colour) {
        super(type, colour);
    }


    @Override
    public String play() {
        return "ping";
    }

    public int getStrings() {
        return 6;
    }

}
