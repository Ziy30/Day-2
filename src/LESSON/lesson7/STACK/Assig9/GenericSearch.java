package LESSON.lesson7.STACK.Assig9;

import java.util.Arrays;

public class GenericSearch<T extends Comparable<T>> {

    // Linear search method
    public int linearSearch(T[] array, T key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(key) == 0) {
                return i; // Return the index if key is found
            }
        }
        return -1; // Return -1 if key is not found
    }

    // Binary search method
    public int binarySearch(T[] array, T key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = array[mid].compareTo(key);

            if (cmp == 0) {
                return mid; // Return the index if key is found
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Return -1 if key is not found
    }

    // Main method for testing
    public static void main(String[] args) {
        // Testing with Integer array
        Integer[] intArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        GenericSearch<Integer> intSearch = new GenericSearch<>();
        int intKey = 23;
        System.out.println("Integer array: " + Arrays.toString(intArray));
        System.out.println("Linear search result for key " + intKey + ": " + intSearch.linearSearch(intArray, intKey));
        System.out.println("Binary search result for key " + intKey + ": " + intSearch.binarySearch(intArray, intKey));

        // Testing with String array
        String[] stringArray = {"apple", "banana", "grape", "orange", "pineapple", "watermelon"};
        GenericSearch<String> stringSearch = new GenericSearch<>();
        String stringKey = "orange";
        System.out.println("\nString array: " + Arrays.toString(stringArray));
        System.out.println("Linear search result for key " + stringKey + ": " + stringSearch.linearSearch(stringArray, stringKey));
        System.out.println("Binary search result for key " + stringKey + ": " + stringSearch.binarySearch(stringArray, stringKey));
    }
}
