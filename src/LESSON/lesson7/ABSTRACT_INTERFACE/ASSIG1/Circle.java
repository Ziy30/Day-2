package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG1;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getParameter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "the Circle radius=" + radius + ", " + super.toString() + "]";
    }

}
