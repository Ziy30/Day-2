package lesson7.ABSTRACT_INTERFACE.ASSIG7;

public class Triangle implements SortableShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementing area method for Triangle
    public double area() {
        return 0.5 * base * height;
    }
}
