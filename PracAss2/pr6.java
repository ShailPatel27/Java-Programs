package PracAss2;

import javax.swing.*;
import java.awt.event.*;

public class pr6 extends JFrame implements ActionListener
{
	JTextField tf;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,clr,ent;
	pr6()
	{
		
		setLayout(null);
		tf=new JTextField("",100);
		tf.setBounds(0,0,240,40);
		tf.setEditable(false);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		add(tf);
		
		b1=new JButton("1");
		b1.setBounds(0,40,80,50);
		add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("2");
		b2.setBounds(80,40,80,50);
		add(b2);
		b2.addActionListener(this);

		b3=new JButton("3");
		b3.setBounds(160,40,80,50);
		add(b3);
		b3.addActionListener(this);		
	
		b4=new JButton("4");
		b4.setBounds(0,90,80,50);
		add(b4);
		b4.addActionListener(this);
		
		b5=new JButton("5");
		b5.setBounds(80,90,80,50);
		add(b5);
		b5.addActionListener(this);
		
		b6=new JButton("6");
		b6.setBounds(160,90,80,50);
		add(b6);
		b6.addActionListener(this);
		
		b7=new JButton("7");
		b7.setBounds(0,140,80,50);
		add(b7);
		b7.addActionListener(this);
		
		b8=new JButton("8");
		b8.setBounds(80,140,80,50);
		add(b8);
		b8.addActionListener(this);
		
		b9=new JButton("9");
		b9.setBounds(160,140,80,50);
		add(b9);
		b9.addActionListener(this);
		
		clr=new JButton("CLEAR");
		clr.setBounds(0,190,80,50);
		add(clr);
		clr.addActionListener(this);
		
		b0=new JButton("0");
		b0.setBounds(80,190,80,50);
		add(b0);
		b0.addActionListener(this);
		
		ent=new JButton("CALL");
		ent.setBounds(160,190,80,50);
		add(ent);
		ent.addActionListener(this);

        setLayout(null);
        setVisible(true);
        setTitle("pr6 Shail");
        setSize(300, 300);
	}

    public static void main(String[] args)
    {
        new pr6();    
    }

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==clr)
		{
			tf.setText("");
		}
		else if(e.getSource()==ent)
		{
			if(ent.getText() == "CALL")
			{
				ent.setText("HANG UP");
			}
			else
			{
				ent.setText("CALL");
                tf.setText("");
			}
		}
		else
		{	
			String temp0;
			temp0=e.getActionCommand();
			
			String temp;
			temp=tf.getText();
			tf.setText(temp + temp0);
		}
	}
}