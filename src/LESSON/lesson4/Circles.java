package LESSON.lesson4;

public class Circles {
    private double radius = 0;
    private final double PI = 3.14159;
    
    public Circles(int i) {
        //TODO Auto-generated constructor stub
    }

    public void Circle(double radius) {
        this.radius = radius;
    }
    
    public double calculateArea() {
        return PI * radius * radius;
    }

}
