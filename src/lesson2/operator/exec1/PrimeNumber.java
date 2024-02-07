package lesson2.operator.exec1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int start,end ;
        Scanner Obj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter start of Prime Number:");
        start = Obj.nextInt();
        System.out.println("Enter end of Prime Number:");
        end = Obj.nextInt();
        
        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

       
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    
    }
}
