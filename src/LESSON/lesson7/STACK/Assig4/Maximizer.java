package LESSON.lesson7.STACK.Assig4;

import java.util.Comparator;

public class Maximizer <T> {
    private T[] array;

    public Maximizer(T[] array) {
        this.array = array;
    }
    
    public T max (Comparator<T> comparator){
        if (array == null || array.length == 0) {
            return null;
        }

        T maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (comparator.compare(array[i], maxElement) > 0) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        // Example usage
        Integer[] integers = {3, 7, 2, 9, 5};
        Maximizer<Integer> integerMaximizer = new Maximizer<>(integers);
        System.out.println("Maximum integer: " + integerMaximizer.max(Integer::compareTo));

        String[] strings = {"apple", "banana", "orange", "grape"};
        Maximizer<String> stringMaximizer = new Maximizer<>(strings);
        System.out.println("Maximum string: " + stringMaximizer.max(String::compareTo));
    }
    
}
