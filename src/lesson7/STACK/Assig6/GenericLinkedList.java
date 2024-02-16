package lesson7.STACK.Assig6;

public class GenericLinkedList<T> {
    private Node<T> head;
    private int size;

    // Node class to represent elements in the linked list
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor
    public GenericLinkedList() {
        head = null;
        size = 0;
    }

    // Method to add an item to the end of the linked list
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Method to remove the first occurrence of the specified item from the linked list
    public void remove(T item) {
        if (head == null) {
            return;
        }
        if (head.data.equals(item)) {
            head = head.next;
            size--;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(item)) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    // Method to check if the linked list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        // Testing with Integer
        GenericLinkedList<Integer> integerList = new GenericLinkedList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        System.out.println("Integer list: " + !integerList.isEmpty());

        // Removing an item
        integerList.remove(20);
        System.out.println("After removing 20: " + !integerList.isEmpty());

        // Testing with String
        GenericLinkedList<String> stringList = new GenericLinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println("String list: " + !stringList.isEmpty());

        // Testing with Character
        GenericLinkedList<Character> charList = new GenericLinkedList<>();
        charList.add('A');
        charList.add('B');
        charList.add('C');
        System.out.println("Character list: " + !charList.isEmpty());
    }
}
