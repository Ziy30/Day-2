package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG7;

public class Circle implements SortableShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing area method for Circle
    public double area() {
        return Math.PI * radius * radius;
    }
}

