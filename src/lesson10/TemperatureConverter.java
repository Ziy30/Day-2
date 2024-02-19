package lesson10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public abstract class TemperatureConverter extends JFrame implements ActionListener{
    protected JTextField inputField;
    private JLabel inputLabel, outputLabel, radioButtonLabel;
    public JLabel resultLabel;
    protected JRadioButton celsiusButton;
    protected JRadioButton fahrenheitButton;
    private JButton convertButton, saveButton;

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
        saveButton = new JButton("Save");
        convertButton.setPreferredSize(new Dimension(80, 30));
        saveButton.setPreferredSize(new Dimension(80, 30));
        addComponent(panel, convertButton, gbc, 0, 3, 1, 1);
        addComponent(panel, saveButton, gbc, 1, 3, 1, 1);

        // Add action listeners
        convertButton.addActionListener(this);
        saveButton.addActionListener(this);

        add(panel);
        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    private void addComponent(Container container, Component component, GridBagConstraints gbc, int gridx, int gridy, int gridwidth, int gridheight) {
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridwidth;
        gbc.gridheight = gridheight;
        container.add(component, gbc);
    }
    protected void saveToFile() {
        try {
            FileWriter writer = new FileWriter("temperature.txt");
            writer.write(resultLabel.getText());
            writer.close();
            JOptionPane.showMessageDialog(this, "Data saved to temperature.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving data to file");
        }
    }
     public void actionPerformed(ActionEvent e) {
       
        if (e.getSource() == convertButton) {
            if (!celsiusButton.isSelected() && !fahrenheitButton.isSelected()) {
                JOptionPane.showMessageDialog(this, "Please select Celsius or Fahrenheit.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            convertTemperature();
        } else if (e.getSource() == saveButton) {
            saveToFile();
        }
    }

    protected abstract void convertTemperature();

   
}
