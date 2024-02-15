package lesson7.ABSTRACT_INTERFACE.ASSIG5;

public class Bird extends Animal{
    // Constructor
    public Bird(String name, int age) {
        super(name, age);
    }

    // Implementation of makeSound method
    public void makeSound() {
        System.out.println(name + " says: Chirp chirp!");
    }
}
