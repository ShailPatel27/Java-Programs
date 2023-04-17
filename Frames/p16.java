package Frames;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class p16 extends Frame implements AdjustmentListener
{
    JScrollBar r, g, b,a;
    int red, blue, green;

    p16()
    {
        r = new JScrollBar(1,0,0,0,255);
        g = new JScrollBar(1,0,0,0,255);
        b = new JScrollBar(1,0,0,0,255);

        add(r);
        add(g);
        add(b);

        r.addAdjustmentListener(this);
        g.addAdjustmentListener(this);
        b.addAdjustmentListener(this);

        setSize(500, 500);
        setLayout(new GridLayout(2, 1));
        setVisible(true);
    }

    public static void main(String[] args) {
        new p16();
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) 
    {
        red = (int)(r.getValue());
        green = (int)(g.getValue());
        blue = (int)(b.getValue());
        Color c1 = new Color(red, blue, green);
        setBackground(c1);
  }
    // public void paint(Graphics g) 
    // {
    //     Color c1 = new Color(red, blue, green);
    //     // g.setColor(c1); 
    //     setBackground(c1);
    // }
    
}
