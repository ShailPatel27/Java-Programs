package Frames;
import java.awt.*;
import java.awt.event.*;

public class p5 extends Frame implements ActionListener
{
    Label l1, l2;
    TextField txtno, txtans;
    Button b1;
    p5()
    {
        l1 = new Label("Number");
        l2 = new Label("Answer");

        b1 = new Button("Click Me");

        txtno = new TextField(5);
        txtans = new TextField(5);

        add(l1);
        add(txtno);
        add(b1);
        add(l2);
        add(txtans);

        b1.addActionListener(this);

        setSize(300, 300);
        setTitle("Btn & Lbl");
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
    new p5();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");

        int no = Integer.parseInt(txtno.getText()+"");
        txtans.setText((no*no)+"");
    }
}
