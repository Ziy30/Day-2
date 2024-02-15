package lesson7.ABSTRACT_INTERFACE.ASSIG14;

import java.util.ArrayList;
import java.util.List;

public class InStoreShoppingCart implements ShoppingCart {
    private List<Item> items;

    public InStoreShoppingCart() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public double calculateTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
