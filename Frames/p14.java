package Frames;
import java.awt.*;
import java.awt.event.*;

public class p14 extends Frame implements ItemListener
{
    Choice c;

    p14()
    {
        c = new Choice();
        c.add("Red");
        c.add("Green");
        c.add("Blue");

        add(c);

        setSize(800, 800);
        setLayout(new FlowLayout());
        setVisible(true);

        c.addItemListener(this);
    }

    public static void main(String[] args) {
        new p14();
    }

    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        if(c.getSelectedItem() == "Red")
        {
            setBackground(Color.red);
        }
        else if(c.getSelectedIndex() == 1)
        {
            setBackground(Color.green);
        }
        else if(c.getSelectedIndex() == 2)
        {
            setBackground(Color.blue);
        }
    }    
    
}
