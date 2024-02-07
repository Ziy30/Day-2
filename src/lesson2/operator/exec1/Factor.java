package lesson2.operator.exec1;

public class Factor {
    
    public static long factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Calculate the factorial of a number (e.g., 5)
        int number = 5;
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
 
