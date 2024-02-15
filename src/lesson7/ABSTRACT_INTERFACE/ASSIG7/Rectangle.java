package lesson7.ABSTRACT_INTERFACE.ASSIG7;

public class Rectangle implements SortableShape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementing area method for Rectangle
    public double area() {
        return width * height;
    }

}
