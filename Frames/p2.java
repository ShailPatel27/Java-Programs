package Frames;
import java.awt.*;

public class p2 extends Frame
{
    public p2()
    {
        Button b1 = new Button("hi hello");
        add(b1);
        setSize(250, 300);
        setTitle("Btn");
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new p2();
    }
}
