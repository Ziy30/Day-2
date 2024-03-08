package EXAM.Q24;
static{
    System.ou
}
public class Test {
    public static void convert(String s) throws IllegalArgumentException, RuntimeException, Exception {
        if (s.length() == 0) {
            throw new RuntimeException("LENGTH SHOULD BE GREATER THAN 0");

        }
    }

    public static void main(String[] args) {
        try {
            convert("");
        } catch (IllegalArgumentException | RuntimeException | Exception e) {
            // Line 14 ( correct answer is catch(RuntimeException e))
            System.err.println(e.getMessage());
        } // Line 16
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
 * Throwable is the root class of the exception hierarchy and it contains some
 * useful constructors:
 * 
 * 
 * 
 * 1. public Throwable() {...} : No-argument constructor
 * 
 * 2. public Throwable(String message) {...} : Pass the detail message
 * 
 * 3. public Throwable(String message, Throwable cause) {...} : Pass the detail
 * message and the cause
 * 
 * 4. public Throwable(Throwable cause) {...} : Pass the cause
 * 
 * 
 * 
 * Exception and RuntimeException classes also provide similar constructors.
 * 
 * 
 * 
 * Throwable class also contains methods, which are inherited by all the
 * subclasses (Exception, RuntimeException etc.)
 * 
 * 1. public String getMessage() {...} : Returns the detail message (E.g. detail
 * message set by 2nd and 3rd constructor)
 * 
 * 2. public String toString() {} :
 * 
 * Returns a short description of this throwable. The result is the
 * concatenation of:
 * 
 * the name of the class of this object
 * 
 * ": " (a colon and a space)
 * 
 * the result of invoking this object's getLocalizedMessage() method
 * 
 * 
 * 
 * If getLocalizedMessage() returns null, then just the class name is returned.
 * 
 * 
 * 
 * 
 * 
 * In multi-catch statement, classes with multi-level hierarchical relationship
 * can't be used.
 * 
 * RuntimeException is subclass of Exception, IllegalArgumentException is
 * indirect subclass of Exception and IllegalArgumentException is subclass of
 * RuntimeException, hence these pairs can't be used in multi-catch statement.
 * 
 * 
 * 
 * Only one option is left to replace Line 14 with 'catch(RuntimeException e)
 * {'.
 * 
 * 
 * 
 * Commenting out Line 14, Line 15 and Line 16 will resolve the compilation
 * error but it will print the whole stack trace rather than just printing the
 * message.
 */