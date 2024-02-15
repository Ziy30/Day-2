package lesson7.ABSTRACT_INTERFACE.ASSIG5;

public class Cat extends Animal {
     // Constructor
     public Cat(String name, int age) {
        super(name, age);
    }

    // Implementation of makeSound method
    public void makeSound() {
        System.out.println(name + " says: Meow meow!");
    }
}
