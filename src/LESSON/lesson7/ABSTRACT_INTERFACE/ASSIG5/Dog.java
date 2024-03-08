package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG5;

public class Dog extends Animal {
    // Constructor
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof woof!");
    }

}
