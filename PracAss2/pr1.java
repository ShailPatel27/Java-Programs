package PracAss2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class pr1 extends JFrame implements ActionListener 
{
    private JPanel colorPanel;
    private JPanel canvasPanel;
    private Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.PINK, Color.LIGHT_GRAY, Color.GRAY, Color.DARK_GRAY, Color.BLACK, Color.WHITE, new Color(128, 0, 128), new Color(255, 165, 0)};
    
    public pr1() 
    {
        setTitle("pr1 Shail");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new GridLayout(1, 2));
        
        colorPanel = new JPanel(new GridLayout(5, 3));
        for (int i = 0; i < colors.length; i++) 
        {
            JButton button = new JButton();
            button.setBackground(colors[i]);
            button.addActionListener(this);
            colorPanel.add(button);
        }
        add(colorPanel);
        
        canvasPanel = new JPanel();
        canvasPanel.setBackground(Color.WHITE);
        add(canvasPanel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        JButton button = (JButton) e.getSource();
        Color color = button.getBackground();
        canvasPanel.setBackground(color);
    }
    
    public static void main(String[] args) 
    {
        new pr1();
    }
}