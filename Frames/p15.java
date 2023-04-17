package Frames;
import java.awt.*;
import java.awt.event.*;

public class p15 extends Frame implements ItemListener, ActionListener
{

    Checkbox cb1, cb2, cb3, cb4;
    TextField ans;
    Button b1, reset;
    String s = new String();

    p15()
    {
        cb1 = new Checkbox("Chess");
        cb2 = new Checkbox("Football");
        cb3 = new Checkbox("Basketball");
        cb4 = new Checkbox("Cricket");
        ans = new TextField(50);
        b1 = new Button("Click Me");
        reset = new Button("Reset");

        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        add(b1);
        add(ans);
        add(reset);

        b1.addActionListener(this);
        reset.addActionListener(this);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        cb4.addItemListener(this);

        setSize(500, 500);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new p15();
    }

    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        if(e.getSource()==cb1)
        {
            s += "Chess ";
        }
        if(e.getSource()==cb2)
        {
            s += "Football ";
        }
        if(e.getSource()==cb3)
        {
            s += "Basketball ";
        }
        if(e.getSource()==cb4)
        {
            s += "Cricket ";
        }
    }

    @Override
    public void actionPerformed(ActionEvent b)
    {
        if(b.getSource()==b1)
        {
            ans.setText(s);
        }
        if(b.getSource()==reset)
        {
            s="";
            ans.setText("");
        }
    }
    
}
