package Lab;
import java.applet.*;
import java.awt.*;

/*<applet code = "j2.class" height = "200" width = "200"></applet>*/

public class j2 extends Applet
{
    public void init()
    {
        setBackground(Color.blue);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        g.drawString("Square", 75, 200);

        int x[] = {50, 150, 150, 50};
        int y[] = {50, 50, 150, 150};

        g.drawPolygon(x, y, 4);
        g.setColor(Color.yellow);
        g.fillPolygon(x, y, 4);
        g.setColor(Color.black);
        g.drawString("Pentagon", 225, 200);

        x = new int[] {200, 250, 300, 300, 250, 200};
        y = new int[] {100, 50, 100, 150, 150, 100};

        g.drawPolygon(x, y, 6);
        g.setColor(Color.blue);
        g.fillPolygon(x, y, 6);

        g.setColor(Color.black);
        g.drawString("Circle", 400, 200);
        g.drawOval(350, 50, 125, 125);
        g.setColor(Color.gray);
        g.fillOval(350, 50, 125, 125);
        g.setColor(Color.green);
        g.fillOval(50, 250, 150, 100);

        g.setColor(Color.black);
        g.drawString("Rectangle", 300, 380);

        x = new int[] {250, 450, 450, 250};
        y = new int[] {250, 250, 350, 350};

        g.setColor(Color.black);
        g.drawString("Triangle", 100, 150);

        x = new int[] {50, 50, 200};
        x = new int[] {500, 400, 500};

        g.drawPolygon(x, y, 3);
        g.setColor(Color.lightGray);
        g.fillPolygon(x, y, 3);
    }
}
