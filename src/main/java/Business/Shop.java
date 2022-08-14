package Business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Shop implements Collection<Object> {
    private String name;
    private ArrayList<Shop> itemsForSale;

    public Shop(String name) {
        this.name = name;
        this.itemsForSale = new ArrayList<Shop>();
    }

    public String getName() {
        return name;
    }

    public void addSellingItems(Shop shop) {
        this.itemsForSale.add(shop);
    }

    public ArrayList<Shop> getItemsForSale() {
        return itemsForSale;
    }

    public int shopCount() {
        return this.itemsForSale.size();

    }

    public boolean removeSellingItems(Shop shop) {
        return this.itemsForSale.remove(shop);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
