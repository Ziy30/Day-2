package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG13;

public class TemperatureSensor implements Sensor {
    @Override
    public void measure() {
        System.out.println("Taking temperature measurement...");
        // Logic to measure temperature
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating temperature sensor...");
        // Logic to calibrate temperature sensor
    }
}
