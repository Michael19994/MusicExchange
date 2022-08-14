package Business;

public class PianoKeys extends SellingItems implements ISell{

    public PianoKeys(String description, int buyPrice, int sellPrice) {
        super(description, buyPrice, sellPrice);
    }

    public PianoKeys() {
        super("Keys", 3, 6);
    }

    @Override
    public double calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
