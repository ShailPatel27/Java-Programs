package PracAss2;

import javax.swing.*;
import java.awt.event.*;

public class pr5 extends JFrame implements ActionListener
{
	JTextField tf;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,clr,ent;
	pr5()
	{	
		setLayout(null);
		tf=new JTextField("CLOSE",100);
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
		
		ent=new JButton("ENTER");
		ent.setBounds(160,190,80,50);
		add(ent);
		ent.addActionListener(this);

        setLayout(null);
        setVisible(true);
        setTitle("pr5 Shail");
        setSize(300, 300);
	}

    public static void main(String[] args)
    {
        new pr5();    
    }

	int psw=0,srt=0;
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==clr)
		{
			psw=0;
			tf.setText("CLOSE");
			srt=0;
		}
		else if(e.getSource()==ent)
		{
			if(psw==1234)
			{
				tf.setText("OPEN");
				psw=0;
				srt=0;
			}
			else
			{
				tf.setText("WRONG PIN");
				psw=0;
				srt=0;
			}
		}
		else
		{
			if(srt==0)
			{
				tf.setText("");
				srt=1;
			}
			String temp0;
			int temp1;
			temp0=e.getActionCommand();
			temp1=Integer.valueOf(temp0);
			psw=10*psw+temp1;
			
			String temp;
			temp=tf.getText();
			tf.setText(temp+"*");
		}
	}
}
