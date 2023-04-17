package Frames;
import java.awt.*;
import java.awt.event.*;

public class p17 extends Frame implements KeyListener
{
    int r, b, g = 0;

    p17()
    {
        // setBackground(Color.white);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setVisible(true);

        addKeyListener(this);        
    }

    public static void main(String[] args) {
        new p17();
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {    
    
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
    
        Color c = new Color(r, g, b);

        if(e.getKeyCode() == KeyEvent.VK_R)
        {
            r+=1;
        }
        if(e.getKeyCode() == KeyEvent.VK_G)
        {
            g+=1;   
        }
        if(e.getKeyCode() == KeyEvent.VK_B)
        {
            b+=1;
        }

        setBackground(c);
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        
    }
}
