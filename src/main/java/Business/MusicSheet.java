package Business;

public class MusicSheet extends SellingItems implements ISell{
    public MusicSheet(String description, int buyPrice, int sellPrice) {
        super(description, buyPrice, sellPrice);
    }

    public MusicSheet() {
        super("Lyrics", 1, 2 );
    }

    @Override
    public double calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
