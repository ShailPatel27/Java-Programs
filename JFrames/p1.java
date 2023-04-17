package JFrames;
import java.awt.*;
import javax.swing.JApplet;

/*<applet code = "p1.class" height = "400" width = "400"></applet>*/

public class p1 extends JApplet
{
    final int r = 25;

    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        g.fillRect(0, 0, 150, 150);
    }
}
