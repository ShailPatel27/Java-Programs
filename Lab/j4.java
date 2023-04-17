import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/*<applet code = "j3.class" height = "500" width = "500"></applet>*/

public class j4 extends Applet implements KeyListener
{

    public void init()
    {
        setBackground(Color.white);
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        if(e.getKeyCode() == KeyEvent.VK_CONTROL)
        {   
            int r = (int)(Math.random()*100)%255;
            int g = (int)(Math.random()*100)%255;
            int b = (int)(Math.random()*100)%255;

            Color myColor = new Color(r, g, b);
            this.setBackground(myColor);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        
    }
    
}
