package PracAss2;

import java.awt.*;
import java.awt.event.*;

public class pr9 extends Frame implements ActionListener
{
	TextField tf1, tf2;
	Button b1, b2;
	TextArea ta;

	pr9()
	{
		Font font = new Font("Segoe UI Semibold", Font.BOLD, 20);

        setTitle("pr9 Shail");
		setLayout(new FlowLayout());
		setSize(150,350);

		tf1=new TextField(2);
		tf2=new TextField(2);
		ta=new TextArea(10,15);
		b1=new Button("Generate");
		b2=new Button("Clear");

		add(new Label("Character "));
		add(tf1);
		add(new Label("Step "));
		add(tf2);   
		add(ta);
		add(b1);
		add(b2);

		setFont(font);

		
		b1.addActionListener(this);
		b2.addActionListener(this);
		show();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand()=="Generate")
		{
			String t=tf1.getText();
			int n=Integer.valueOf(tf2.getText());

			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					ta.append(t);
				}
				ta.append("\n");
			}
		}
		else if(e.getActionCommand() == "Clear")
		{
			ta.setText("");
			tf1.setText("");
			tf2.setText("");
		}
	}
	public static void main(String args[])
	{
		new pr9();
	}
}