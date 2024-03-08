package LESSON.lesson4;

import LESSON.lesson4.MathUtils;

public class MathMain {
    public static void main(String[] args) {

        
         System.out.println("10+5 ="+ MathUtils.add(10, 1));
         System.out.println("8-15 ="+ MathUtils.subtract(8, 15));

       
        if (MathUtils.IsEven(2)==true)
         System.out.println("the number is an even number");
        else
         System.out.println("the number is not an even number");
    }
}
