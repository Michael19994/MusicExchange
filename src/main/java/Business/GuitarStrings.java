package Business;

public class GuitarStrings extends SellingItems implements ISell{

    public GuitarStrings(String description, int buyPrice, int sellPrice) {
        super(description, buyPrice, sellPrice);
    }

    public GuitarStrings() {
        super("Strings for a guitar", 10, 20);
    }

    @Override
    public double calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
