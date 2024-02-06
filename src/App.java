import lesson1.StringHandler;
import lesson2.IntegerHandler;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(1/0);
        lesson2();
    }

    public static void lesson2(){
        int numberOfVessels = 15;
        int[] dimension = {2,4,7};
        IntegerHandler IntegerHandler = new IntegerHandler(numberOfVessels, dimension);
        int volume = IntegerHandler.getTotalVolume();
        String msg = IntegerHandler.toString();
        System.out.println(msg);
        System.out.println(volume);
     }
 

    public static void lesson1(){
        StringHandler stringHandler = new StringHandler("my class");
        stringHandler.setStr("my new class");
        System.out.println((stringHandler.toString()));
    }


}
