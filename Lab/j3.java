package Lab;
import java.applet.*;
import java.awt.*;
import java.util.Calendar;

/*<applet code = "j3.class" height = "500" width = "500"></applet>*/

public class j3 extends Applet implements Runnable
{

    Thread t = null;
    int hours = 0, minutes = 0, seconds = 0;
    String timeString = "";

    public void init()
    {
        setBackground(Color.green);
    }

    public void start()
    {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() 
    {
        try 
        {
            while(true)
            {
                Calendar cal = Calendar.getInstance();
                hours = cal.get(Calendar.HOUR_OF_DAY);
                if(hours>12)
                {
                    hours = 12;
                }
                minutes = cal.get(Calendar.MINUTE);
                seconds = cal.get(Calendar.SECOND);

                repaint();
                t.sleep(1000);
            }
        } 
        catch (Exception e) {}
    }   

    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.drawString(timeString, 50, 50);
    }
    
}