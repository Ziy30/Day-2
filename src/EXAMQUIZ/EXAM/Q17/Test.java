package EXAM.Q17;

import java.io.EOFException;
import java.sql.SQLException;

public class Test {
    private static void test() throws SQLException {
        try {
            throw new Exception();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        try {
            test();
        } finally{
            System.out.println("GAME ON");
        }
    }
}
/*
 * Method test() throws Exception (checked) and it declares to throw it, so no
 * issues with method test().
 * 
 * But main(String []) method neither provides catch handler nor throws clause
 * and hence main(String []) method causes compilation error.
 * 
 * Handle or Declare rule should be followed for checked exception if you are
 * not re-throwing it.
 * 
 */
