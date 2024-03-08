package EXAM.Q13;

/**
 * 13. Given code of Test.java file,Which of the following options, if used to
 * replace /*INSERT^/, will compile successfully and on execution will print
 * EMMA IS RIDING THE HORSE on to the console?
 * Select 4 options.
 */

interface Rideable {
    void ride(String name);

}

class Animal {
}

class Horse extends Animal implements Rideable {
    public void ride(String name) {
        System.out.println(name.toUpperCase() + "IS RIDDING THE HORSE");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal horse = new Horse();
        /*
         * INSERT
         * ((Horse)horse).ride("Emma");
         * ((Rideable)horse).ride("emma");
         * ((Rideable)(Horse)horse).ride("EMMA");
         * ((Horse)(Rideable)horse).ride("emma");
         */
    }
}
/*
 * Let's check all the options one by one:
 * 
 * horse.ride("EMMA"); ✗ Variable 'horse' is of Animal type and ride(String)
 * method is not defined in Animal class, therefore it causes compilation error.
 * 
 * 
 * 
 * (Horse)horse.ride("EMMA"); ✗ horse.ride("EMMA") will be evaluated first as
 * dot (.) operator has higher precedence than cast. horse.ride("EMMA") returns
 * void, hence it cannot be casted to Horse type. This would cause compilation
 * error.
 * 
 * 
 * 
 * ((Horse)horse).ride("Emma"); ✓ Variable 'horse' refers to an instance of
 * Horse type and variable 'horse' is casted to Horse type. Horse class has
 * ride(String) method, hence no compilation error. ride(String) method of Horse
 * class will get invoked at runtime and will print the expected output. As,
 * name.toUpperCase() method is invoked, hence it doesn't matter in what case
 * you pass the name, in the output name will always be displayed in the upper
 * case.
 * 
 * 
 * 
 * (Rideable)horse.ride("emma"); ✗ horse.ride("EMMA") will be evaluated first as
 * dot (.) operator has higher precedence than cast. horse.ride("EMMA") returns
 * void, hence it cannot be casted to Rideable type. This would cause
 * compilation error.
 * 
 * 
 * 
 * ((Rideable)horse).ride("emma"); ✓ Variable 'horse' refers to an instance of
 * Horse type and variable 'horse' is casted to Rideable type (super type of
 * Horse). Rideable interface has ride(String) method, hence no compilation
 * error. ride(String) method of Horse class will get invoked at runtime and
 * will print the expected output.
 * 
 * 
 * 
 * (Rideable)(Horse)horse.ride("EMMA"); ✗ horse.ride("EMMA") will be evaluated
 * first as dot (.) operator has higher precedence than cast. horse.ride("EMMA")
 * returns void, hence it cannot be casted to Horse type. This would cause
 * compilation error.
 * 
 * 
 * 
 * (Horse)(Rideable)horse.ride("EMMA"); ✗ horse.ride("EMMA") will be evaluated
 * first as dot (.) operator has higher precedence than cast. horse.ride("EMMA")
 * returns void, hence it cannot be casted to Rideable type. This would cause
 * compilation error.
 * 
 * 
 * 
 * ((Rideable)(Horse)horse).ride("EMMA"); ✓ Variable 'horse' refers to an
 * instance of Horse type, it is first casted to Horse type and then casted to
 * Rideable type. Rideable interface has ride(String) method, hence no
 * compilation error. ride(String) method of Horse class will get invoked at
 * runtime and will print the expected output.
 * 
 * 
 * 
 * ((Horse)(Rideable)horse).ride("emma"); ✓ Variable 'horse' refers to an
 * instance of Horse type, it is first casted to Rideable type and then casted
 * to Horse type. Horse class has ride(String) method, hence no compilation
 * error. ride(String) method of Horse class will get invoked at runtime and
 * will print the expected output.
 */