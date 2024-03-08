package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG3;

public class Car implements Vehicle{

    private double speed;

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
        speed = 0;
    }

    @Override
    public void accelerate(double speed) {
        this.speed += speed;
        System.out.println("Car accelerated to " + this.speed + " km/h");
    }

    @Override
    public void brake(double speed) {
        this.speed -= speed;
        if (this.speed < 0) {
            this.speed = 0;
        }
        System.out.println("Car slowed down to " + this.speed + " km/h");
    }

    
}
