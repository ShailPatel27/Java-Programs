package Frames;
import java.awt.*;
import java.awt.event.*;

public class p10 extends Frame implements ActionListener
{
    Label l1;
    Button b1;
    TextField tb1;
    TextArea ans;

    p10()
    {
        l1 = new Label("Enter Number");
        b1 = new Button("Table");
        tb1 = new TextField(5);
        ans = new TextArea(10, 20);

        add(l1);
        add(tb1);
        add(b1);
        add(ans);

        b1.addActionListener(this);

        setSize(800, 800);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new p10();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int num = Integer.parseInt(tb1.getText() + "");
        String j = new String();

        for(int i = 1; i <= 10; i++)
        {
            j += num + " X " + i + " = " + (num*i) + "\n";
        }

        ans.setText(j);
    }
    
}
