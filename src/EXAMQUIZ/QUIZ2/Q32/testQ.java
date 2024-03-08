package QUIZ2.Q32;

public class testQ {

    private static void add(double d1, double d2){
        System.out.println("double version "+ (d1+d2));
    }

    private static void add(Double d1, Double d2){
        System.out.println("Double version "+ (d1+d2));
    }

    @SuppressWarnings("removal")
    public static void main(String[] args){
        
        add(new Double(10.0), new Double(10));
    

    }
        

}
