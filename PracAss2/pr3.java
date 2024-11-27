package PracAss2;

import java.awt.*;
import java.awt.event.*;

public class pr3 extends Frame implements ActionListener,ItemListener,MouseListener,MouseMotionListener,MouseWheelListener,KeyListener
{
	TextArea ta;
	Button b;
	Checkbox cb;
	Checkbox cb1;
	TextField tf;
	int check=0,check1=0;
	pr3()
	{
		setTitle("pr3 Shail");
		setLayout(new FlowLayout());
		setSize(400,400);
		show();
		
		ta=new TextArea(10,40);
		ta.setEditable(false);
		add(ta); 
	
		cb=new Checkbox("On/Off Mouse Listener");
		add(cb);
		
		cb1=new Checkbox("On/Off Mouse Motion Listener");
		add(cb1);
		
		tf=new TextField(10);
		add(tf);
		
		b=new Button("Button");
		add(b);

		cb.addItemListener(this);

		cb1.addItemListener(this);

		tf.addKeyListener(this);

		b.addActionListener(this);

		addMouseListener(this);

		addMouseMotionListener(this);
		
		addMouseWheelListener(this);
		
		//Window Listener
		addWindowListener(new WindowListener(){
			public void windowOpened(WindowEvent e)
			{
				ta.append("Window Listener > window Opened"+"\n");
			}
			public void windowClosing(WindowEvent e)
			{
				ta.append("Window Listener > window Closing"+"\n");
			}
			public void windowClosed(WindowEvent e)
			{
				ta.append("Window Listener > window Closed"+"\n");
			}
			public void windowIconified(WindowEvent e)
			{
				ta.append("Window Listener > window Iconified"+"\n");
			}
			public void windowDeiconified(WindowEvent e)
			{
				ta.append("Window Listener > window Deiconified"+"\n");
			}
			public void windowActivated(WindowEvent e)
			{
				ta.append("Window Listener > window Activated"+"\n");
			}
			public void windowDeactivated(WindowEvent e)
			{
				ta.append("Window Listener > window Deactivated"+"\n");
			}
		});
	}

	//Action Listener
	public void actionPerformed(ActionEvent e)
	{
		ta.append("Action Listener > Action Performed"+"\n");
	}

	//Item Listener
	public void itemStateChanged(ItemEvent e)
	{
		ta.append("Item Listener > Item State Changed"+"\n");
		if(cb.getState()==true)
		{
			check=1;
		}
		else
		{
			check=0;
		}
		if(cb1.getState()==true)
		{
			check1=1;
		}
		else
		{
			check1=0;
		}
	}

	//Mouse Listener
	public void mousePressed(MouseEvent e)
	{
		if(check==1)
		{
			ta.append("Mouse Listener > Mouse Pressed"+"\n");
		}
	}
	public void mouseReleased(MouseEvent e)
	{
		if(check==1)
		{
			ta.append("Mouse Listener > Mouse Released"+"\n");
		}
	}
	public void mouseEntered(MouseEvent e)
	{
		if(check==1)
		{
			ta.append("Mouse Listener > Mouse Entered"+"\n");
		}
	}
	public void mouseExited(MouseEvent e)
	{
		if(check==1)
		{
			ta.append("Mouse Listener > Mouse Exited"+"\n");
		}
	}
	public void mouseClicked(MouseEvent e)
	{
		if(check==1)
		{
			ta.append("Mouse Listener > Mouse Clicked"+"\n");
		}
	}

	//Mouse Motion Listener
	public void mouseMoved(MouseEvent e)
	{
		if(check1==1)
		{
			ta.append("Mouse Motion Listener > Mouse Moved"+"\n");
		}
	}
	public void mouseDragged(MouseEvent e)
	{
		if(check1==1)
		{
			ta.append("Mouse Motion Listener > Mouse Dragged"+"\n");
		}
	}

	//Mouse Wheel Listener
	public void mouseWheelMoved(MouseWheelEvent e)
	{
		ta.append("Mouse Wheel Listener > Mouse Wheel Moved"+"\n");
	}
	
	//Key Listener
	public void keyPressed(KeyEvent e)
	{
		ta.append("Key Listener > Key Pressed"+"\n");
	}
	public void keyReleased(KeyEvent e)
	{
		ta.append("Key Listener > Key Released"+"\n");
	}
	public void keyTyped(KeyEvent e)
	{
		ta.append("Key Listener > Key Typed"+"\n");
	}
	
	public static void main(String args[])
	{
		new pr3();
	}
}
