package Practice;

import java.awt.*;
import java.awt.event.*;

import javafx.scene.shape.Circle;

public class j5 extends Frame implements KeyListener {

    int paddley = 100;
    double paddlex2;

    j5()
    {
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        addKeyListener(this);
    }

    public static void main(String[] args) {
        new j5();
    }

    public void paint(Graphics g)
    {
        // Rectangle r = getBounds();
        // paddlex2 = (r.getWidth()) - 50;
        // int x = Integer.parseInt(paddlex2);

        g.drawRect(10, paddley, 15, 200);
        g.fillRect(10, paddley, 20, 200);

        // g.drawRect(paddlex2, paddley, 15, 200);
        g.drawRect(450, paddley, 15, 200);
        g.fillRect(450, paddley, 20, 200);
        
        g.fillOval(250, 250, 20, 20);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
       
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_S)
        {
            if(paddley < 350)
            {
                paddley += 30;
                repaint();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_W)
        {
            if(paddley > 0)
            {
                paddley -= 30;
                repaint();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        
    }
}
