package Practice;
import java.awt.*;
import java.awt.event.*;

public class j1 extends Frame implements KeyListener
{
    j1()
    {
        
        addKeyListener(this);

        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setBackground(Color.white);
    }

    public static void main(String args[])
    {
        new j1();
    }

    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode()== KeyEvent.VK_CONTROL)
        {
            setBackground(Color.black);
        }
        else if(e.getKeyCode()==KeyEvent.VK_SHIFT)
        {
            setBackground(Color.white);
        }
    }

    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
}
