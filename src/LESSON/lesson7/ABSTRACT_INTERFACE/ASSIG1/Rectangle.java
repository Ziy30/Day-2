package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG1;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth() {
        this.width = width;
    }

    public void setLength() {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getParameter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle width=" + width + ", length =" + length + ", " + super.toString() + "]";
    }

}
