package lesson11;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    public static void main(String[] args) {
        // Create a shared buffer
        Queue<Integer> buffer = new LinkedList<>();
        int capacity = 5;

        // Create producer and consumer threads
        Thread producer = new Thread(() -> {
            while (true) {
                synchronized (buffer) {
                    try {
                        // Wait if buffer is full
                        while (buffer.size() == capacity) {
                            buffer.wait();
                        }
                        // Produce item and add to buffer
                        int item = (int) (Math.random() * 100);
                        buffer.add(item);
                        System.out.println("Produced: " + item);
                        // Notify consumer thread
                        buffer.notifyAll();
                        // Sleep to simulate production time
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                synchronized (buffer) {
                    try {
                        // Wait if buffer is empty
                        while (buffer.isEmpty()) {
                            buffer.wait();
                        }
                        // Consume item from buffer
                        int consumedItem = buffer.poll();
                        System.out.println("Consumed: " + consumedItem);
                        // Notify producer thread
                        buffer.notifyAll();
                        // Sleep to simulate consumption time
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // Start producer and consumer threads
        producer.start();
        consumer.start();
    }
}
