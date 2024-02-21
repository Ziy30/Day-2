package EXAM.Q6;

public class Test {
    public static void main(String[] args) {
        boolean status = true;
        System.out.println(status = false || status = true | status = false);
        System.out.println(status);}
}

/*
 * System.out.println(status = false || status = true | status = false);
 * 
 * As it contains multiple operators, hence let's group the operators first.
 * 
 * System.out.println(status = false || status = (true | status) = false);
 * //Bitwise inclusive OR | has highest precedence over logical or || and
 * assignment =
 * 
 * For assignment operator to work, left operand must be variable but in above
 * case, `(true | status) = false` causes compilation failure as left operand
 * (true | status) evaluates to a boolean value and not boolean variable.
 */