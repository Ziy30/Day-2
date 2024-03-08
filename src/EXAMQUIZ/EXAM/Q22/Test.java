package EXAM.Q22;

public class Test {
    public static void main(String[] args) {

        GetSetGo[] arr = new GetSetGo[5];// Line n2
        for (GetSetGo obj : arr) {
            obj.count++;// Line n3
        }
        System.out.println(GetSetGo.count);// Line n4
    }
}
/*
 * Variable 'count' declared inside interface GetSetGo is implicitly public,
 * static and final. Line n1 compiles successfully.
 * 
 * Line n2 creates one dimensional array of 5 elements of GetSetGo type and all
 * 5 elements are initialized to null. Line n2 compiles successfully.
 * 
 * Though correct way to refer static variable is by using the type name, such
 * as GetSetGo.count but it can also be invoked by using GetSetGo reference
 * variable. Hence, obj.count at Line n3 correctly points to the count variable
 * at Line n1. But as variable 'count' is implicitly final, therefore
 * obj.count++ causes compilation error. Line n3 fails to compile.
 * 
 * Line n4 compiles successfully as variable 'count' is implicitly static and
 * GetSetGo.count is the correct syntax to point to 'count' variable of
 * interface GetSetGo.
 */
