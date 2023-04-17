package Frames;
import java.awt.*;
import java.awt.event.*;

public class p7 extends Frame implements ActionListener
{
    Label l1, l2;
    TextField tb1,tb2, ans;
    Button add, sub, mul, div;

    p7()
    {
        l1 = new Label("Number 1: ");
        l2 = new Label("Number 2: ");
        tb1 = new TextField(5);
        tb2 = new TextField(5);
        ans = new TextField(5);
        add = new Button("Addition");
        sub = new Button("Subtraction");
        mul = new Button("Multiplication");
        div = new Button("Division");

        add(l1);
        add(tb1);
        add(l2);
        add(tb2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(ans);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(800, 800);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new p7();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");

        int num1 = Integer.parseInt(tb1.getText() + "");
        int num2 = Integer.parseInt(tb2.getText() + "");

        if(e.getActionCommand() == "Addition")
        {
            ans.setText((num1+num2) + "");
        }
        else if(e.getActionCommand() == "Subtraction")
        {
            ans.setText((num1-num2) + "");
        }
        else if(e.getActionCommand() == "Multiplication")
        {
            ans.setText((num1*num2) + "");
        }
        else if(e.getActionCommand() == "Division")
        {
            ans.setText((num1/num2) + "");
        }

    }
    
}
