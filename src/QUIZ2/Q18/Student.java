package QUIZ2.Q18;

public class Student {
        String name;
        int age;

        Student(){
            this("James",25); // to call another constructor Student(...)should be change to this(...)
        }

        Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        
}
