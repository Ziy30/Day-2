package lesson7.STACK.Assig10;

public class Algorithm<T> {

    // Method to perform a specific algorithmic operation on the input
    public void execute(T input) {
        // Perform the algorithmic operation based on the type of input
        // This method can be overridden by subclasses to provide specific implementations
        System.out.println("Executing algorithm on input: " + input.toString());
    }

    // Example of a sorting algorithm
    public void sort(T[] array) {
        // Sorting logic goes here
        System.out.println("Sorting array: " + array.toString());
    }

    // Example of a searching algorithm
    public boolean search(T[] array, T key) {
        // Searching logic goes here
        System.out.println("Searching for key " + key.toString() + " in array: " + array.toString());
        return false;
    }

    // Example of a graph traversal algorithm
    public void traverseGraph(T graph) {
        // Graph traversal logic goes here
        System.out.println("Traversing the graph: " + graph.toString());
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example usage of the Algorithm class
        Algorithm<Integer> intAlgorithm = new Algorithm<>();
        Integer[] intArray = {5, 2, 8, 1, 9};
        intAlgorithm.sort(intArray);
        intAlgorithm.execute(10);

        Algorithm<String> stringAlgorithm = new Algorithm<>();
        String[] stringArray = {"apple", "banana", "orange", "grape"};
        stringAlgorithm.search(stringArray, "orange");
        stringAlgorithm.execute("Hello, world!");

        Algorithm<Character> charAlgorithm = new Algorithm<>();
        charAlgorithm.traverseGraph('G');
    }
}
