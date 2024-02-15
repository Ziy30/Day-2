package lesson7.ABSTRACT_INTERFACE.ASSIG5;

public class Main {
    public static void main(String[] args) {
        // Create instances of Dog, Cat, and Bird
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 5);
        Bird bird = new Bird("Tweetie", 2);

        // Call methods on each animal
        dog.eat();
        dog.sleep();
        dog.makeSound();

        cat.eat();
        cat.sleep();
        cat.makeSound();

        bird.eat();
        bird.sleep();
        bird.makeSound();
    }
}
