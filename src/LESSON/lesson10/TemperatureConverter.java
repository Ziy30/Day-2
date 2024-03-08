package LESSON.lesson10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public abstract class TemperatureConverter extends JFrame implements ActionListener {
    protected JTextField inputField;
    private JLabel inputLabel, outputLabel, radioButtonLabel;
    public JLabel resultLabel;
    protected JRadioButton celsiusButton;
    protected JRadioButton fahrenheitButton;
    private JButton convertButton, saveButton; // Add saveButton

    // Define class-level fields for temperature conversions
    public double celsiusTemp;
    public double fahrenheitTemp;
    public double kelvinTemp;
    public double rankineTemp;
    public double reaumurTemp;

    public TemperatureConverter() {
        setTitle("Temperature Converter");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Input label and field
        inputLabel = new JLabel("Enter temperature:");
        inputField = new JTextField(10);
        addComponent(panel, inputLabel, gbc, 0, 0, 1, 1);
        addComponent(panel, inputField, gbc, 1, 0, 1, 1);

        // Celsius and Fahrenheit radio buttons
        radioButtonLabel = new JLabel("Select temperature scale:");
        celsiusButton = new JRadioButton("Celsius");
        fahrenheitButton = new JRadioButton("Fahrenheit");
        ButtonGroup group = new ButtonGroup();
        group.add(celsiusButton);
        group.add(fahrenheitButton);
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        radioPanel.add(celsiusButton);
        radioPanel.add(fahrenheitButton);
        addComponent(panel, radioButtonLabel, gbc, 0, 1, 1, 1);
        addComponent(panel, radioPanel, gbc, 1, 1, 1, 1);

        // Output label and space
        outputLabel = new JLabel("Converted temperature:");
        resultLabel = new JLabel("");
        addComponent(panel, outputLabel, gbc, 0, 2, 1, 1);
        addComponent(panel, resultLabel, gbc, 1, 2, 1, 1);

        // Convert and save buttons
        convertButton = new JButton("Convert");
        saveButton = new JButton("Save to Database ");

        convertButton.setPreferredSize(new Dimension(80, 30));
        saveButton.setPreferredSize(new Dimension(80, 30));
        addComponent(panel, convertButton, gbc, 0, 3, 1, 1);
        addComponent(panel, saveButton, gbc, 1, 3, 1, 1); // Add the saveButton

        // Add action listeners
        convertButton.addActionListener(this);
        saveButton.addActionListener(this); // Add action listener for saveButton

        add(panel);
        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    private void addComponent(Container container, Component component, GridBagConstraints gbc, int gridx, int gridy,
            int gridwidth, int gridheight) {
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridwidth;
        gbc.gridheight = gridheight;
        container.add(component, gbc);
    }

    // Override this method in subclasses
    public void convertTemperature() {
        try {
            double inputTemp = Double.parseDouble(inputField.getText());
            double celsiusTemp = 0, fahrenheitTemp = 0;

            if (celsiusButton.isSelected()) {
                celsiusTemp = inputTemp;
                fahrenheitTemp = (celsiusTemp * 9 / 5) + 32;
            } else if (fahrenheitButton.isSelected()) {
                fahrenheitTemp = inputTemp;
                celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
            }

            double kelvinTemp = celsiusTemp + 273.15;
            double rankineTemp = (celsiusTemp + 273.15) * 9 / 5;
            double reaumurTemp = celsiusTemp * 4 / 5;

            resultLabel.setText("<html>Celsius: " + celsiusTemp + "<br>Fahrenheit: " + fahrenheitTemp +
                    "<br>Kelvin: " + kelvinTemp + "<br>Rankine: " + rankineTemp + "<br>Réaumur: " + reaumurTemp
                    + "</html>");

        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
        }
    }

    // save to txt file
    /*
     * public void saveToFile() {
     * try {
     * FileWriter writer = new FileWriter("temperature.txt");
     * writer.write(resultLabel.getText());
     * writer.close();
     * JOptionPane.showMessageDialog(this, "Data saved to temperature.txt");
     * } catch (IOException e) {
     * JOptionPane.showMessageDialog(this, "Error saving data to file");
     * }
     * }
     */

     public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            if (!celsiusButton.isSelected() && !fahrenheitButton.isSelected()) {
                JOptionPane.showMessageDialog(this, "Please select Celsius or Fahrenheit.", "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
            convertTemperature();
        } else if (e.getSource() == saveButton) {
            saveToDB();
        }
    }

    public void saveToDB() {
        try {
            double inputTemp = Double.parseDouble(inputField.getText()); // Parse input temperature to double

            // Determine the selected temperature scale (Celsius or Fahrenheit)
            String scale;
            if (celsiusButton.isSelected()) {
                scale = "Celsius";
            } else if (fahrenheitButton.isSelected()) {
                scale = "Fahrenheit";
            } else {
                JOptionPane.showMessageDialog(null, "Please select a temperature scale.",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Create Temperature object
            Temp temperature = new Temp(0, inputTemp, scale, celsiusTemp, fahrenheitTemp, kelvinTemp, rankineTemp,
                    reaumurTemp);

            // Insert temperature data into the database using TemperatureService
            TempConvService temperatureService = new TempConvService();
            temperatureService.saveTemperature(temperature);

            // Show success message
            JOptionPane.showMessageDialog(null, "Temperature data added to the database.",
                    "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            // Show error message if input temperature is not a valid number
            JOptionPane.showMessageDialog(null, "Invalid input temperature.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

   
}