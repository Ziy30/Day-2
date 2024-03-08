package LESSON.lesson7.STACK.Assig7;

import java.util.HashMap;
import java.util.Map;

public class GenericMap<K, V> {
    private Map<K, V> map;

    // Constructor
    public GenericMap() {
        map = new HashMap<>();
    }

    // Method to add a key-value pair to the map
    public void add(K key, V value) {
        map.put(key, value);
    }

    // Method to retrieve the value associated with a key
    public V get(K key) {
        return map.get(key);
    }

    // Method to check if a key exists in the map
    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    // Method to remove a key-value pair from the map
    public void remove(K key) {
        map.remove(key);
    }

    public static void main(String[] args) {
        // Testing the GenericMap class with Integer keys and String values
        GenericMap<Integer, String> integerStringMap = new GenericMap<>();
        integerStringMap.add(1, "One");
        integerStringMap.add(2, "Two");
        integerStringMap.add(3, "Three");

        // Retrieve values
        System.out.println("Value for key 2: " + integerStringMap.get(2));
        System.out.println("Value for key 4: " + integerStringMap.get(4));

        // Check if keys exist
        System.out.println("Key 3 exists: " + integerStringMap.containsKey(3));
        System.out.println("Key 5 exists: " + integerStringMap.containsKey(5));

        // Remove key-value pair
        integerStringMap.remove(2);
        System.out.println("After removing key 2: " + integerStringMap.containsKey(2));
    }
}