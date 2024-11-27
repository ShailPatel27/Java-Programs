package Practice;

import java.applet.*;
import java.awt.*;

/*<applet code = "j9.class" height = "500" width = "500">
    <param name = name value = "Shail">
    <param name = age value = "19">
</applet>*/

public class j9 extends Applet
{   
    public void paint(Graphics g)
    {
        String name = getParameter("name");
        String age = getParameter("age");

        g.drawString("Name: "+name, 50, 50);
        g.drawString("Age: "+age, 70, 60);
    }
}