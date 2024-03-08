package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG1;

public abstract class Shape {

    private String color;
    private boolean filled;

    // Constructer
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter
    public String getColor() {
        return color;
    }
    public boolean getFiled() {
        return filled;
    }

    // Setter
    public void setColor() {
        this.color = color;
    }
    public void setFilled() {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getParameter();

    // toString output
    public String toString() {
        return ("Color :" + color + "\nFilled :" + filled);
    }

}
