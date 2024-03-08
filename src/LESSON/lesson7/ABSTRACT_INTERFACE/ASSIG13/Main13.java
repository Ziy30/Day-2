package LESSON.lesson7.ABSTRACT_INTERFACE.ASSIG13;

public class Main13 {
    public static void main(String[] args) {
        // Create instances of TemperatureSensor and PressureSensor
        Sensor temperatureSensor = new TemperatureSensor();
        Sensor pressureSensor = new PressureSensor();

        // Measure and calibrate temperature sensor
        temperatureSensor.measure();
        temperatureSensor.calibrate();

        // Measure and calibrate pressure sensor
        pressureSensor.measure();
        pressureSensor.calibrate();
    }
}
