package lesson10;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TemperatureConverterApp extends TemperatureConverter {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConverterApp();
            }
        });
    }

  


}