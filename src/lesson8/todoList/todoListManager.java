/*Todo List Manager: Develop a GUI application for managing a todo
                     list with features like adding tasks, marking 
                     them as completed, and deleting them. */

package lesson8.todoList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class todoListManager extends JFrame implements ActionListener {

    // Declare instances Variables for the input and output
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private JTextField textInput, textOutput;
    private JButton button;
    private JLabel inputbel, outputLabel;

    public todoListManager() {

        // GUI title
        setTitle("TODO List");
        setSize(300,400 );
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Create task list model
        taskListModel = new DefaultListModel<>();

        // Create task list
        taskList = new JList<>(taskListModel);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Create text input to add
        textInput = new JTextField(20);
        textInput.addActionListener(this);

        // create button to add in list
        JButton addButton = new JButton("+");
        addButton.addActionListener(this);

        // Add components to the content pane
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(scrollPane, BorderLayout.CENTER);
        container.add(textInput, BorderLayout.NORTH);
        container.add(addButton, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JTextField) {
            // If the source is the input field, add the task
            String task = textInput.getText().trim();
            if (!task.isEmpty()) {
                taskListModel.addElement(task);
                textInput.setText("");
            }
        } else if (e.getSource() instanceof JButton) {
            // If the source is the add button, add the task
            String task = textInput.getText().trim();
            if (!task.isEmpty()) {
                taskListModel.addElement(task);
                textInput.setText("");
            }
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            todoListManager todoListManager = new todoListManager();
            todoListManager.setVisible(true);
        });
    }

}
