import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame2 extends JFrame
{
	
	JButton acct1,acct2,acct3,acct4,acct5;
	
	MyActionListener ml = new MyActionListener(this);
	MyFrame2()
	{
		super("Accounts");
		setLayout(null);
		setBounds(0,0,940,788);
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\ARSHDEEP SINGH\\OneDrive\\Desktop\\9.png")));
		
		
		
		acct1=new JButton("High-End Construction");
		acct2=new JButton("Sayonara Sails");
		acct3=new JButton("Hanky Franky");
		acct4=new JButton("Pizza Fresca");
		acct5=new JButton("Subway");
		
		add(acct1);	
		add(acct2);
		add(acct3);
		add(acct4);
		add(acct5);
		
		acct1.setBounds(50,50,200,30);
		
		
		acct2.setBounds(50,150,200,30);
		
		acct3.setBounds(50,250,200,30);
		
		acct4.setBounds(50,350,200,30);
		
		acct5.setBounds(50,450,200,30);
		
		
		
		
	
		
		acct1.addActionListener(ml);
		acct2.addActionListener(ml);
	    acct3.addActionListener(ml);
		acct4.addActionListener(ml);
		acct5.addActionListener(ml);
		
		
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
			MyFrame2 mf = new MyFrame2();
			mf.setVisible(true);
	}
}