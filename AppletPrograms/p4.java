import java.applet.*;
import java.awt.*;

/*<applet code = "p4.class" height = "200" width = "200"></applet>*/

public class p4 extends Applet
{
    public void init()
    {
        setLayout(new BorderLayout());
        add(new Button("One"), BorderLayout.NORTH);
        add(new Button("Two"), BorderLayout.SOUTH);
        add(new Button("Three"), BorderLayout.CENTER);
        add(new Button("Four"), BorderLayout.EAST);
        add(new Button("Five"), BorderLayout.WEST);
        add(new Button("Six"), BorderLayout.WEST);
    }
}
