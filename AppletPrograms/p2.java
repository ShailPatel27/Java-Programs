package AppletPrograms;
import java.awt.*;
import java.applet.*;

/*<applet code = "p2.class" height = "500" width = "500"></applet>*/

public class p2 extends Applet
{
    String msg = "Hello world";

    public void paint(Graphics g)
    {
        g.drawString(msg, 100, 100);
    }
}