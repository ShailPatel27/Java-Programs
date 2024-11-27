package Practice;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class j8 extends JFrame implements ActionListener {
    Button b;
    TextField tb;
    Label l;
    j8()
    {
        b = new Button("Click me");
        tb = new TextField(100);
        l = new Label();

        add(tb);
        add(b);
        add(l);

        b.addActionListener(this);

        setSize(500, 500);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String args[])
    {
        new j8();
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = tb.getText();

        l.setText(s);
    }
}
