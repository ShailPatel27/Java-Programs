package Lab;

import java.awt.*;
import java.applet.*;

/*<applet code = "j1.class" height = "500" width = "500"></applet>*/

public class j1 extends Applet implements Runnable 
{
    String text = "Sample Banner";
    Thread t;

    public void init()
    {
        setBackground(Color.white);
    }

    public void start()
    {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() 
    {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
        while(true)
        {
            try 
            {
                repaint();
                Thread.sleep(1000);
                text = text.substring(1) + text.charAt(0);
            }
            catch (Exception e) 
            {
                // TODO: handle exception
            }
        }
    }

    public void paint(Graphics g)
    {
        // g.setFont(new Font("TimesRoman", Font.BOLD, 15));
        g.drawString(text, 200, 200);
    }
}
