import java.awt.*;
import java.applet.*;

/*<applet code="p3.class" height="200" width="200">
* <param name=name value="Shail">
* <param name=age value="18">
* <param name=sem value="6">
* <param name=year value="3">
</applet>
*/

public class p3 extends Applet
{
    public void paint(Graphics g)
    {
        String name = getParameter("name");
        String age = getParameter("age");
        String sem = getParameter("sem");
        String yr = getParameter("year");

        g.drawString("Name : " + name, 20, 20);
        g.drawString("Age : " + age, 20, 40);
        g.drawString("Semester: " + sem, 20, 60);
        g.drawString("Year : " + yr, 20, 80);
    }
}
