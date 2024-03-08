package LESSON.lesson2.operator.exec1;

import java.util.Scanner;

public class Exercise2 {
      public static void main(String[] args) {
        int a,b,c,max;

        Scanner Obj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a");
        a = Obj.nextInt();
        System.out.println("Enterb");
        b = Obj.nextInt();
        System.out.println("Enter c");
        c = Obj.nextInt();

        if(a<=b){
            max= a;
        }
        else{
            max=b;
        }

        if (max<=c){
            max=c;
        }

        System.err.println("Maximum: "+ max);

    



      }

}
