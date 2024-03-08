package LESSON.lesson2.operator.exec1;

import java.util.Scanner;

public class Exercise3 {
     public static void main(String[] args) {
        int i,n, nFact;
        i=1;
        nFact = 1;
        Scanner Obj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter value of n: ");
        n = Obj.nextInt();

        while (i<=n) {
            nFact = nFact*i;
            i++;
        }
     

        System.out.println("n!= "+ nFact);
     }
}
