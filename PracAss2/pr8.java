package PracAss2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pr8 extends JFrame implements ActionListener 
{
    JLabel fLabel, tLabel, disLabel, weightLabel, amountLabel;
    JTextField fField, tField, disField, weightField, amountField;
    JButton calculate;

    public pr8() 
    {
        setTitle("pr8 Shail");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        disLabel = new JLabel("Distance :");
        weightLabel = new JLabel("Weight :");
        fLabel = new JLabel("From :");
        tLabel = new JLabel("To :");
        amountLabel = new JLabel("Amount :");

        disField = new JTextField(10);
        weightField = new JTextField(10);
        fField = new JTextField(10);
        tField = new JTextField(10);
        amountField = new JTextField(10);
        amountField.setEditable(false);

        calculate = new JButton("Calculate");
        calculate.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(fLabel);
        panel.add(fField);
        panel.add(tLabel);
        panel.add(tField);
        panel.add(disLabel);
        panel.add(disField);
        panel.add(weightLabel);
        panel.add(weightField);
        panel.add(amountLabel);
        panel.add(amountField);
        panel.add(calculate);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
    {
        double distance = Double.parseDouble(disField.getText());
        double weight = Double.parseDouble(weightField.getText());

        double rate = 0.0;
        if (distance >= 500 && weight >= 100) 
        {
            rate = 5.0;
        } 
        else if (distance >= 10 && distance < 100 && weight >= 10) 
        {
            rate = 6.0;
        } 
        else if (distance < 10)
        {
            rate = 7.0;
        } 
        else if (distance < 500 && weight >= 100) 
        {
            rate = 8.0;
        }
        else if (distance < 500 && weight < 100) 
        {
            rate = 5.0;
        }

        double amount = distance * rate;
        amountField.setText(String.format("%.2f", amount));
    }

    public static void main(String[] args) 
    {
        new pr8();
    }
}