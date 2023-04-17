package Frames;
import java.awt.*;
import java.awt.event.*;

public class p13 extends Frame implements ActionListener
{
    Label l1;
    TextField tb1, ans;
    Button b1;

    p13()
    {
        l1 = new Label("Enter Limit: ");
        b1 = new Button("Prime Numbers");
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
        new p13();    
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int n = Integer.parseInt(tb1.getText() + "");
        int flag = 0;
        String s = new String();

        for(int j = 0; j<=n; j++)
        {

            if(j==0 || j==1)
            {
                flag = 1;
            }
            else
            {
                for(int i=2; i<=j/2; i++)
                {
                    if(j%i==0)
                    {
                        flag = 1;
                    }
                }
            }
        
            if(flag==0)
            {
                s+= j + " ";
            }
            else if(flag ==1)
            {
                flag = 0;
            }

        }

        ans.setText(s);
    }
    
}
