package EXAM.Q5;

class X {
    void A() {
        System.err.print("A");
    }
}

class Y extends X {
    void A() {
        System.err.print("A-");
    }

    void B() {
        System.out.print("B-");
    }

    void C() {
        System.err.print("C-");
    }
}

public class Test {
    public static void main(String[] args) {
        X obj = new Y();
        obj.A();
        obj.B(); //
        obj.C();

    }
}

/*
 * Class Y correctly extends class X and it overrides method A() and provides
 * two new methods B() and C().
 * 
 * At Line n1, obj is of X type and therefore obj.B(); and obj.C(); cause
 * compilation error as these methods are not defined in class X.
 */
