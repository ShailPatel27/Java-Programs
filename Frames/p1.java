package Frames;
import java.awt.*;
import java.applet.*;

public class p1 extends Applet
{
    p1()
    {
        Frame fm = new Frame();
        Label lb = new Label("Hello World");
        fm.add(lb);
        fm.setSize(300, 300);
        fm.setTitle("Lbl");
        fm.setVisible(true);
    }

    public static void main(String[] args)
    {
        new p1();
    }
}