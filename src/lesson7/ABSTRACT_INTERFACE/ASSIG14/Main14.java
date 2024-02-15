package lesson7.ABSTRACT_INTERFACE.ASSIG14;

public class Main14 {
    public static void main(String[] args) {
        // Test OnlineShoppingCart
        ShoppingCart onlineCart = new OnlineShoppingCart();
        onlineCart.addItem(new Item("Shirt", 25.0));
        onlineCart.addItem(new Item("Pants", 35.0));
        System.out.println("Total cost of items in online cart: $" + onlineCart.calculateTotal());

        // Test InStoreShoppingCart
        ShoppingCart inStoreCart = new InStoreShoppingCart();
        inStoreCart.addItem(new Item("Shoes", 50.0));
        inStoreCart.addItem(new Item("Hat", 15.0));
        inStoreCart.removeItem(new Item("Hat", 15.0));
        System.out.println("Total cost of items in in-store cart: $" + inStoreCart.calculateTotal());
    }
}
