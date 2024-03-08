package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG14;

public interface ShoppingCart {
    void addItem(Item item);        // Adds an item to the cart

    void removeItem(Item item);     // Removes an item from the cart

    double calculateTotal();  
}
