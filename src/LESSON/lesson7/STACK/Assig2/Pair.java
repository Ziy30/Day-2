package LESSON.lesson7.STACK.Assig2;

public class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B seconnd) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }
    public B getSecond() {
        return second;
    }

    public void setFirst(A first) {
        this.first = first;
    }
    public void setSecond(B second) {
        this.second = second;
    }


    public static void main(String[] args) {
        // Creating a Pair of Integer and String
        Pair<Integer, String> pair = new Pair<>(10, "Hello");

        // Getting and printing the elements of the pair
        System.out.println("First element: " + pair.getFirst());
        System.out.println("Second element: " + pair.getSecond());

        // Modifying the elements of the pair
        pair.setFirst(20);
        pair.setSecond("World");

        // Getting and printing the modified elements of the pair
        System.out.println("Modified first element: " + pair.getFirst());
        System.out.println("Modified second element: " + pair.getSecond());
    }
}
