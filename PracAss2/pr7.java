package PracAss2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;

public class pr7 extends JFrame implements FocusListener, ActionListener
{
    JLabel sLabel, uLabel, eLabel;
    JTextField sField, uField, eField;
    JButton cancel, generate;
    Double scurr, ucurr, ecurr;
    
    pr7()
    {
        Font font = new Font("Segoe UI Semibold", Font.BOLD, 12);

        setTitle("pr7 Shail");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 150);
        setLayout(new FlowLayout());
        setVisible(true);
        
        sLabel = new JLabel("Singapore dollars:");
        uLabel = new JLabel("US dollars:");
        eLabel = new JLabel("Euros:");

        sField = new JTextField(10);
        uField = new JTextField(10);
        eField = new JTextField(10);

        generate = new JButton("Generate");
        cancel = new JButton("Cancel");

        add(sLabel);
        add(sField);
        add(uLabel);
        add(uField);
        add(eLabel);
        add(eField);
        add(generate);
        add(cancel);

        sField.setFont(font);
        uField.setFont(font);
        eField.setFont(font);

        sField.addFocusListener(this);
        uField.addFocusListener(this);
        eField.addFocusListener(this);
        generate.addActionListener(this);
        cancel.addActionListener(this);
    }

    public static void main(String[] args) 
    {
        new pr7();
    }

    @Override
    public void focusGained(FocusEvent e) 
    {
       if(e.getSource() == sField)
       {
            uField.setEditable(false);
            eField.setEditable(false);
       }
       else if(e.getSource() == uField)
       {
            sField.setEditable(false);
            eField.setEditable(false);
       }
       else
       {
            uField.setEditable(false);
            sField.setEditable(false);
       }
    }
    @Override
    public void focusLost(FocusEvent e){}

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == cancel)
        {
            sField.setEditable(true);
            uField.setEditable(true);
            eField.setEditable(true);

            sField.setText("");
            uField.setText("");
            eField.setText("");
        }
        else if(e.getSource() == generate)
        {

            if(sField.isEditable() == true)
            {
                scurr = Double.parseDouble(sField.getText());

                uField.setText((scurr*0.75) + "");
                eField.setText((scurr*0.65) + "");
            }
            if(uField.isEditable() == true)
            {
                ucurr = Double.parseDouble(uField.getText());

                sField.setText((ucurr*1.41) + "");
                eField.setText((ucurr*0.92) + "");
            }
            if(eField.isEditable() == true)
            {
                ecurr = Double.parseDouble(eField.getText());

                uField.setText((ecurr*1.11) + "");
                sField.setText((ecurr*1.47) + "");
            }
        }
    }
}