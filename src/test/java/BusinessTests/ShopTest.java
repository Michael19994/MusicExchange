package BusinessTests;

import Business.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before() {
        shop = new Shop("MusicShop");
    }

    @Test
    public void hasName() {
        assertEquals("MusicShop", shop.getName());
    }

    @Test
    public void canAddItemsToStock() {
        shop.addSellingItems(shop);
        assertEquals(1, shop.shopCount());
    }

    @Test
    public void canRemoveItemsToStock() {
        shop.addSellingItems(shop);
        shop.removeSellingItems(shop);
        assertEquals(0, shop.shopCount());
    }
}
