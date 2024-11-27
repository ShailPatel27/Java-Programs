import java.applet.*;
import java.awt.*;

/*<applet code = "p5.class" height = "500" width = "500"></applet>*/

public class p5 extends Applet
{
    public void init()
    {
        setLayout(new GridLayout(3, 2));
        add(new Button("One"));
        add(new Button("Two"));
        add(new Button("Three"));
        add(new Button("Four"));
        add(new Button("Five"));
        // add(new Button("Six"));
    }
}