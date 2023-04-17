package Frames;
import java.awt.*;
import java.awt.event.*;

public class p11 extends Frame implements ItemListener
{
    Checkbox cb1, cb2, cb3;
    CheckboxGroup cbg;

    p11()
    {
        cbg = new CheckboxGroup();
        cb1 = new Checkbox("Red", cbg, false);
        cb2 = new Checkbox("Green", cbg, false);
        cb3 = new Checkbox("Blue", cbg, false);

        add(cb1);
        add(cb2);
        add(cb3);

        cb1.addItemListener(this); 
        cb2.addItemListener(this); 
        cb3.addItemListener(this); 
        
        setSize(1000, 1000);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new p11();
    }

    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        if(e.getSource() == cb1)
        {
            setBackground(Color.red);
        }
        if(e.getSource() == cb2)
        {
            setBackground(Color.green);
        }
        if(e.getSource() == cb3)
        {
            setBackground(Color.blue);
        }
    }
    
}
