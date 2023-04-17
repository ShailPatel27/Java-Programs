package JFrames;
import javax.swing.*;

public class p2 extends JFrame 
{
    p2()
    {
        JLabel hello = new JLabel("Hello World");
        getContentPane().add(hello, "Center");
        setSize(500, 500);
        setTitle("JFrame Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new p2();
    }
}
