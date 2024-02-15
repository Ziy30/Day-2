package lesson7.ABSTRACT_INTERFACE.ASSIG13;

public class PressureSensor implements Sensor {
    @Override
    public void measure() {
        System.out.println("Taking pressure measurement...");
        // Logic to measure pressure
    }

    @Override
    public void calibrate() {
        System.out.println("Calibrating pressure sensor...");
        // Logic to calibrate pressure sensor
    }
}
