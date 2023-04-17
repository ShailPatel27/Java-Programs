package Frames;
import java.awt.*;
import java.awt.event.*;

public class p12 extends Frame implements ActionListener
{
    Label l1;
    TextField tb1, ans;
    Button b1;

    p12()
    {
        l1 = new Label("Enter Number: ");
        b1 = new Button("Answer");
        tb1 = new TextField(5);
        ans = new TextField(20);

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
        new p12();    
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int n = Integer.parseInt(tb1.getText() + "");
        int flag = 0;

        if(n==0 || n==1)
        {
            ans.setText(n + " is not a prime number");
        }
        else
        {
            for(int i=2; i<=n/2; i++)
            {
                if(n%i==0)
                {
                    ans.setText(n + " is not a prime number");
                    flag = 1;
                }
            }
        }

        if(flag==0)
        {
            ans.setText(n + " is a prime number");
        }
    }
    
}
