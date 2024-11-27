import java.applet.*;
import java.awt.*;

/*<applet code = "p1.class" width = "200" height = "200"></applet>*/

public class p1 extends Applet
{
	String msg = "The currently executing method";
	public void init()
	{
		msg += " init() ";
	}
	public void start()
	{
		msg += " start() ";
	}
	public void stop()
	{
		msg += " stop() ";
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
		showStatus("Test applet");
	}
}
