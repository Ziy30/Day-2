package lesson4;

import lesson4.MathUtils;

public class MathMain {
    public static void main(String[] args) {

        
         System.out.println("10+5 ="+ MathUtils.add(10, 1));
         System.out.println("8-15 ="+ MathUtils.subtract(8, 15));

       
        if (MathUtils.IsEven(2)==true)
         System.out.println("the number is an even number");
        else
         System.out.println("the number is not an even number");


         String[][] arr = {{"7", "6", "5"}, {"4", "3"}, {"2", "1"}};
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 switch (arr[i][j]) {
                     case "2":
                     case "4":
                     case "6":
                         break;
                     default:
                         continue;
                 }
                 System.out.print(arr[i][j]);
             }
         }
    }
}
