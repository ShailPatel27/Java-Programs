package JFrames;
import javax.swing.*;
import java.awt.*;

public class p3 extends JFrame 
{
    public p3(String title)
    {
        super(title);
        setLayout(new GridLayout(3, 1));

        JLabel l1 = new JLabel("Plain Small Label");
        add(l1);

        JLabel l2 = new JLabel("Fancy Big Label");
        Font f = new Font("Serif", Font.BOLD | Font.ITALIC, 32);
        l2.setFont(f);
        l2.setHorizontalAlignment(JLabel.RIGHT);
        add(l2);
    }

    public static void main(String[] args) 
    {
        p3 test = new p3("JLabel Demo");
        test.setSize(400, 400);
        test.setVisible(true);
    }
}