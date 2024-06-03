import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.Container.*;

public class Index1 extends JFrame
{
	
	JButton bt1,bt2;
	MyActionListener fm = new MyActionListener(this);
	Index1()
	{
		super("Home Page");
		setLayout(null);
		setBounds(0,0,800,622);
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\ARSHDEEP SINGH\\OneDrive\\Desktop\\6.png")));
		

		
		bt1=new JButton("CREATE");
		bt2=new JButton("LOGIN");
		
		
		Font f=new Font("TIMES",Font.BOLD,20);
		Font f1=new Font("TIMES",Font.BOLD,20);
		
	
		bt1.setFont(f1);
		bt2.setFont(f1);
		
		
		add(bt1);
		add(bt2);
	
		
		bt1.setBounds(20,150,200,70);
		bt2.setBounds(20,250,200,70);
		bt1.addActionListener(fm);
		bt2.addActionListener(fm);
		
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
		Index1 fm2 = new Index1();
		fm2.setVisible(true);
	}	
}	
	