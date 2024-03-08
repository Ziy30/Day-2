package EXAMQUIZ.Quiz1.Q10;


class X {
    void greet() {
        System.out.println("Good Morning!");
    }
}

class Y extends X {
    void greet() {
        System.out.println("Good Afternoon!");
    }
}

class Z extends Y {
    void greet() {
        System.out.println("Good Night!");
    }
}

public class Test {
    public static void main(String[] args) {
    X x = new Y();
    x.greet();


 }

}