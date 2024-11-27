package PracAss2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pr2 extends JFrame implements ActionListener, KeyListener
{
    JPanel topPanel;
    JPanel bottomPanel;
    int x = 100;
    
    public pr2() 
    {
        setTitle("Shail pr2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());
        
        topPanel = new JPanel() 
        {
            public void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.drawLine(x, 0, x, getHeight());
            }
        };
        add(topPanel, BorderLayout.CENTER);
        
        bottomPanel = new JPanel();
        JButton leftButton = new JButton("Move Left");
        leftButton.addActionListener(this);
        bottomPanel.add(leftButton);

        JButton rightButton = new JButton("Move Right");
        rightButton.addActionListener(this);
        bottomPanel.add(rightButton);
        add(bottomPanel, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        if (command.equals("Move Left"))
        {
            x -= 10;
        }
        else if (command.equals("Move Right"))
        {
            x += 10;
        }
        topPanel.repaint();
    }
    public static void main(String[] args)
    {
        new pr2();
    }

    @Override
    public void keyTyped(KeyEvent e){}

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            x -= 10;
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            x += 10;
        }

        topPanel.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e){}
}