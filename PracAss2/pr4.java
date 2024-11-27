package PracAss2;

import java.awt.event.*;
import javax.swing.*;

public class pr4 implements ActionListener 
{
    JFrame frame;
    JPanel panel;
    JLabel celsiusLabel, fahrenheitLabel;
    JTextField celsiusField, fahrenheitField;
    JButton celsiusToFahrenheitButton, fahrenheitToCelsiusButton;
    
    public pr4() 
    {
        frame = new JFrame("SwingTemperatureConverter pr4 Shail");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        celsiusLabel = new JLabel("Celsius:");
        celsiusField = new JTextField(10); 
        fahrenheitLabel = new JLabel("Fahrenheit:");
        fahrenheitField = new JTextField(10);
        celsiusToFahrenheitButton = new JButton("Convert to Fahrenheit");
        celsiusToFahrenheitButton.addActionListener(this);
        fahrenheitToCelsiusButton = new JButton("Convert to Celsius");
        fahrenheitToCelsiusButton.addActionListener(this);
        panel.add(celsiusLabel);
        panel.add(celsiusField);
        panel.add(celsiusToFahrenheitButton);
        panel.add(fahrenheitLabel);
        panel.add(fahrenheitField);
        panel.add(fahrenheitToCelsiusButton);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == celsiusToFahrenheitButton) 
        {
            double celsius = Double.parseDouble(celsiusField.getText());
            double fahrenheit = celsius * 9 / 5 + 32;
            fahrenheitField.setText(String.format("%.2f", fahrenheit));
        }
        else if (e.getSource() == fahrenheitToCelsiusButton) 
        {
            double fahrenheit = Double.parseDouble(fahrenheitField.getText());
            double celsius = (fahrenheit - 32) * 5 / 9;
            celsiusField.setText(String.format("%.2f", celsius));
        }
    }    
    public static void main(String[] args)
    {
        new pr4();
    }
}