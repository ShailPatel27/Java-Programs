package Frames;
import java.awt.*;
import java.awt.event.*;

public class p6 extends Frame implements ActionListener
{
    Label l1, l2;
    TextField tb1, tb2, ans;
    Button b1;

    p6()
    {
        l1 = new Label("Base: ");
        l2 = new Label("Height: ");
        tb1 = new TextField(5);
        tb2 = new TextField(5);
        ans = new TextField(5);
        b1 = new Button("Answer");

        add(l1);
        add(tb1);
        add(l2);
        add(tb2);
        add(b1);
        add(ans);

        b1.addActionListener(this);

        setSize(500, 500);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new p6();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        int h = Integer.parseInt(tb1.getText() + "");
        int b = Integer.parseInt(tb2.getText() + "");
        ans.setText(((h*b)/2) + "");
    }
}
