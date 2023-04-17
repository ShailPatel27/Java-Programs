package Frames;
import java.awt.*;
import java.awt.event.*;

public class p9 extends Frame implements ActionListener
{
    Label l1, l2;
    Button b1;
    TextField tb1, fac, ans;

    p9()
    {
        l1 = new Label("Limit: ");
        l2 = new Label(" = ");
        b1 = new Button("Factorial: ");
        tb1 = new TextField(5);
        ans = new TextField(10);
        fac = new TextField(50);

        add(l1);
        add(tb1);
        add(b1);
        add(fac);
        add(l2);
        add(ans);

        b1.addActionListener(this);

        setSize(900, 900);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new p9();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int num = Integer.parseInt(tb1.getText() + "");
        int fact = 1;
        String j = new String();

        for(int i = 1; i<=num; i++)
        {
            fact = fact * i;
            if(i<num)
            {
                j +=i + "*";
            }
            else
            {
                j+= i;
            }
        }

        fac.setText(j);
        ans.setText(fact + "");
    }
    
}
