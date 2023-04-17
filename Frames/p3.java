package Frames;
import java.awt.*;

public class p3 extends Frame 
{
    p3()
    {
        
        Label l1 = new Label("Label");
        Button b1 = new Button("Button");
        
        add(l1);
        add(b1);

        setSize(300, 300);
        setTitle("Btn & Lbl");
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new p3();
    }
}
