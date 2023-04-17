package Frames;
import java.awt.event.*;
import java.awt.*;

public class p4 extends Frame implements ActionListener
{
    Label l1;
    Button b1;
    TextField ans;
    TextField num;

    p4()
    {
        l1 = new Label("Enter Number: ");
        b1 = new Button("Answer: ");
        ans = new TextField();

        add(l1);
        add(num);
        add(b1);
        add(ans);

        b1.addActionListener(this);

        setSize(500, 500);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Square");
    }

    public static void main(String[] args)
    {
        new p4();
    }

    @Override
    public void actionPerformed(ActionEvent e)   
    {
        int no = Integer.parseInt(num.getText() + "");
        ans.setText((no*no)+"");
    }
}
