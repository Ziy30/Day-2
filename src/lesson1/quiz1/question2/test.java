package lesson1.quiz1.question2;

public class test {
    static int i1 = 10;
    int i2 = 20;

    int add(){
        return this.i1 + this.i2; // Line n1

    }
    public static void main(String[] args) {
        System.out.println((new test().add())); //Line2
    }

}
