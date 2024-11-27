package Practice;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class j6 extends Frame implements ItemListener{
    Checkbox c1,c2,c3;
    Canvas c = new Canvas();
    j6()
    {
        CheckboxGroup cbj = new CheckboxGroup();
        c1 = new Checkbox("Red", cbj, true);
        c2 = new Checkbox("Green", cbj, true);
        c3 = new Checkbox("Blue", cbj, true);

        c.setSize(100, 100);

        add(c);
        add(c1);
        add(c2);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
    }

    public static void main(String args[])
    {
        new j6();
    }

    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        if(e.getSource() == c1)
        {
            c.setBackground(Color.RED);
        }
        if(e.getSource() == c2)
        {
            c.setBackground(Color.GREEN);
        }
        if(e.getSource() == c3)
        {
            c.setBackground(Color.BLUE);
        }
    }
}
