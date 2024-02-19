package lesson10;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TemperatureConverterApp extends TemperatureConverter implements FileSaver {

    public void convertTemperature() {
        try {
            double inputTemp = Double.parseDouble(inputField.getText());
            double celsiusTemp = 0, fahrenheitTemp = 0;

            if (celsiusButton.isSelected()) {
                celsiusTemp = inputTemp;
                fahrenheitTemp = (celsiusTemp * 9/5) + 32;
            } else if (fahrenheitButton.isSelected()) {
                fahrenheitTemp = inputTemp;
                celsiusTemp = (fahrenheitTemp - 32) * 5/9;
            }

            double kelvinTemp = celsiusTemp + 273.15;
            double rankineTemp = (celsiusTemp + 273.15) * 9/5;
            double reaumurTemp = celsiusTemp * 4/5;

            resultLabel.setText("<html>Celsius: " + celsiusTemp + "<br>Fahrenheit: " + fahrenheitTemp +
                    "<br>Kelvin: " + kelvinTemp + "<br>Rankine: " + rankineTemp + "<br>Réaumur: " + reaumurTemp + "</html>");

                    
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
        }
    }

    public void saveToFile() {
        try {
            FileWriter writer = new FileWriter("temperature.txt");
            writer.write(resultLabel.getText());
            writer.close();
            JOptionPane.showMessageDialog(this, "Data saved to temperature.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving data to file");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConverterApp();
            }
        });
    }
}