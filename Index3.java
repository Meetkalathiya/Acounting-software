import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.Container.*;

public class Index3 extends JFrame
{
	
		JButton b1,b2,b3;
		MyActionListener fm1 = new MyActionListener(this);
		Index3()
		{
			super("LOGIN PAGE");
			setLayout(null);
			
			setBounds(0,0,800,300);
			setBackground(Color.GRAY);
			setForeground(Color.BLACK);
			
			
			b1 = new JButton("Accounts");
			b2 = new JButton("Entries");
			b3 = new JButton("Logout");
			
			
			Font f1 = new Font("Arial",Font.BOLD,20);
			Font f2 = new Font("Arial",Font.BOLD,12);
			
			b1.setFont(f1);
			b2.setFont(f1);
			b3.setFont(f2);
			
			add(b1);
			add(b2);
			add(b3);
			
	
			b1.setBounds(100,100,250,50);
			b2.setBounds(450,100,250,50);
			b3.setBounds(250,200,250,25);
			
			
			b1.addActionListener(fm1);
			b2.addActionListener(fm1);
			b3.addActionListener(fm1);
			
			
			
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
		Index3 fm3 = new Index3();
		fm3.setVisible(true);
	}	
}	