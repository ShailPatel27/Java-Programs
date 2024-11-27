package Practice;
import java.awt.*;
import java.awt.event.*;

public class j7 extends Frame implements ItemListener{
    Checkbox c1, c2, c3;
    Canvas c = new Canvas();
    j7()
    {
        c.setSize(100, 100);

        c1 = new Checkbox("Red");
        c2 = new Checkbox("Green");
        c3 = new Checkbox("Blue");

        add(c);
        add(c1);
        add(c2);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setSize(500, 500);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String args[])
    {
        new j7();
    }

    int r = 0, g = 0, b = 0;
    public void itemStateChanged(ItemEvent e)
    {

        if(c1.getState() == true)
        {
            r = 255;
            CanvasColor();
        }
        else if(c1.getState() == false)
        {
            r = 0;
            CanvasColor();
        }

        if(c2.getState() == true)
        {
            g = 255;
            CanvasColor();
        }
        else if(c2.getState() == false)
        {
            g = 0;
            CanvasColor();
        }

        if(c3.getState() == true)
        {
            b = 255;
            CanvasColor();
        }
        else if(c3.getState() == false)
        {
            b = 0;
            CanvasColor();
        }
    }

    public void CanvasColor()
    {
        c.setBackground(new Color(r,g,b));
    }
}
