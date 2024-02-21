package EXAM.Q22;

public class Test {
    public static void main(String[] args) {

        GetSetGo[] arr = new GetSetGo[5];//Line n2
        for (GetSetGo obj : arr) {
             obj.count++;//Line n3
        }
        System.out.println(GetSetGo.count);//Line n4
    }
}
