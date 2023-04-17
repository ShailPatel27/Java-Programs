package Lab;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class pr12_2 {
    private JFrame frame;
    private JPanel panel;
    private JTextField tfName;
    private JTextField tfAge;
    private JButton btnInsert;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JTextArea taOutput;

    public pr12_2() {
        // Create the main frame
        frame = new JFrame("CRUD Operations with GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the main panel with GridLayout
        panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Create input fields for name and age
        panel.add(new JLabel("Name:"));
        tfName = new JTextField();
        panel.add(tfName);

        panel.add(new JLabel("Age:"));
        tfAge = new JTextField();
        panel.add(tfAge);

        // Create buttons for insert, update, and delete
        btnInsert = new JButton("Insert");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");

        // Add action listeners to the buttons
        btnInsert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                String age = tfAge.getText();
                String data = "Name: " + name + ", Age: " + age + " (INSERT)";
                taOutput.append(data + "\n");
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                String age = tfAge.getText();
                String data = "Name: " + name + ", Age: " + age + " (UPDATE)";
                taOutput.append(data + "\n");
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = tfName.getText();
                String age = tfAge.getText();
                String data = "Name: " + name + ", Age: " + age + " (DELETE)";
                taOutput.append(data + "\n");
            }
        });

        panel.add(btnInsert);
        panel.add(btnUpdate);
        panel.add(btnDelete);

        // Create output text area
        taOutput = new JTextArea(10, 30);
        panel.add(new JScrollPane(taOutput));

        // Add the panel to the frame
        frame.add(panel);

        // Pack and display the frame
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the program
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new pr12_2();
            }
        });
    }
}