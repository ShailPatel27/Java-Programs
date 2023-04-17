package Frames;
import java.awt.*;
import java.awt.event.*;

public class p8 extends Frame implements ActionListener
{
    Label l1, l2;
    Button b1;
    TextField tb1, tb2, ans;
    p8()
    {
        l1 = new Label("Number 1");
        l2 = new Label("Number 2");
        b1 = new Button("Answer");
        tb1 = new TextField(5);
        tb2 = new TextField(5);
        ans = new TextField(20);

        add(l1);
        add(tb1);
        add(l2);
        add(tb2);
        add(b1);
        add(ans);

        b1.addActionListener(this);

        setSize(800, 800);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new p8();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int num1 = Integer.parseInt(tb1.getText() + "");   
        int num2 = Integer.parseInt(tb2.getText() + "");   

        if(num1>num2)
        {
            ans.setText("First Number Is Greater");
        }
        else if(num2>num1)
        {
            ans.setText("Second Number Is Greater");
        }
        else
        {
            ans.setText("Both Numbers Are Equal");
        }
    }
    
}
