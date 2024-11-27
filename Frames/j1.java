package Frames;

import java.awt.*;
import java.awt.event.*;

public class j1 extends Frame implements ActionListener
{
    Button b;
    Label l;
    j1()
    {
        l = new Label("");
        b = new Button("Click me");
        
        add(l);
        add(b);
        
        b.addActionListener(this);
        
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public static void main(String[] args)
    {
        new j1();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        l.setText("Hello");
    }
}