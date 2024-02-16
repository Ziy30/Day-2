package lesson7.STACK.Assig8;

import java.util.Arrays;

public class GenericSorter <T extends Comparable<T>> {
     // Method to sort the array using quicksort
     public void sort(T[] array) {
        if (array == null || array.length <= 1) {
            return; // Nothing to sort
        }
        quickSort(array, 0, array.length - 1);
    }

    // Quicksort algorithm implementation
    private void quickSort(T[] array, int low, int high) {
        if (low < high) {
            // Partition the array
            int pivotIndex = partition(array, low, high);

            // Recursively sort the sub-arrays
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Partition the array
    private int partition(T[] array, int low, int high) {
        T pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    // Helper method to swap elements in the array
    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Testing with Integer array
        Integer[] intArray = {5, 2, 9, 1, 6};
        GenericSorter<Integer> intSorter = new GenericSorter<>();
        intSorter.sort(intArray);
        System.out.println("Sorted Integer array: " + Arrays.toString(intArray));

        // Testing with String array
        String[] stringArray = {"banana", "apple", "grape", "orange"};
        GenericSorter<String> stringSorter = new GenericSorter<>();
        stringSorter.sort(stringArray);
        System.out.println("Sorted String array: " + Arrays.toString(stringArray));
    }
}
