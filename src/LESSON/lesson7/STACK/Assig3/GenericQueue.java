package LESSON.lesson7.STACK.Assig3;

import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue<T> {
    private Queue<T> queue;

    public GenericQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (!isEmpty()) {
            return queue.remove();
        } else {
            throw new IllegalStateException("Queue is empty");
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }


    public static void main(String[] args) {
        // Testing GenericQueue with Integer
        GenericQueue<Integer> integerQueue = new GenericQueue<>();
        integerQueue.enqueue(1);
        integerQueue.enqueue(2);
        integerQueue.enqueue(3);
        System.out.println("Dequeued from integerQueue: " + integerQueue.dequeue());
        System.out.println("Dequeued from integerQueue: " + integerQueue.dequeue());

        // Testing GenericQueue with String
        GenericQueue<String> stringQueue = new GenericQueue<>();
        stringQueue.enqueue("Hello");
        stringQueue.enqueue("World");
        System.out.println("Dequeued from stringQueue: " + stringQueue.dequeue());

        // Testing GenericQueue with Boolean
        GenericQueue<Boolean> booleanQueue = new GenericQueue<>();
        booleanQueue.enqueue(true);
        booleanQueue.enqueue(false);
        System.out.println("Dequeued from booleanQueue: " + booleanQueue.dequeue());
    }
}
