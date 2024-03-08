package LESSON.lesson1.assignment;

public class prac {
  public static void main(String[] args) {
    //Demonstrate passing arguements to the main method
    System.out.println("\n\n Number of arguments:" + args.length);
    System.out.println("Arguments passed:\n");

    for(String arg: args){
      System.out.println(arg);
    }

    int integerNumber = 10;
    double doubleNumber = 3.14;
    boolean boolValue = true;
    char charValue = 'A';
    String stringVaue ="Hello, World";

    System.err.println("Understanding Data Type --->/n");
    System.err.println("Integer Number :" + integerNumber );
    System.err.println("Double Number :" + doubleNumber );
    System.err.println("Boolean Number :" + boolValue );   
    System.err.println("Character Number :" + charValue );
    System.err.println("String Number :" + stringVaue );





  }
}
