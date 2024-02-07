package lesson2.operator.exec1;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n ;
        Scanner Obj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter start of fibinacci sequence:");
        n = Obj.nextInt();
        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
        int first = 0, second = 1;
        System.out.println("Fibonacci Sequence of " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
