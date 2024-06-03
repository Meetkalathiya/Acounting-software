import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.Container.*;

public class Index5 extends JFrame{

JLabel l0,l1,l2,l3,l4,l5;
		
		MyActionListener fm1 = new MyActionListener(this);
		Index5()
		{
			
			setLayout(null);
			setBounds(100,100,1500,1500);
			setBackground(Color.WHITE);
			setForeground(Color.BLACK);
			
			l0 = new JLabel("SAYYONARA SAILS");
			
			l1 = new JLabel("It was launched in the year 1897.");
			
			l2 = new JLabel("The owner name is sayonara syndicate");
			
			l3 = new JLabel("It is becoming a global company");
			
			l4 = new JLabel("This private limited company is in trading business from last 14 years");
		
			l5 = new JLabel("The boat maiking is the best in the world");
			
			
			
			
			
			
			
			
			
			
			
			
			
			Font f1 = new Font("TIMES",Font.BOLD,20);
			
			Font f2 = new Font("TIMES",Font.BOLD,30);
			l1.setFont(f1);
			
			l2.setFont(f1);
			
			l3.setFont(f1);
			
			l4.setFont(f1);
		
			l5.setFont(f1);
			
			l0.setFont(f2);
			
			
			add(l0);
			
			add(l1);
			
			add(l2);
			
			add(l3);
			
			add(l4);
			
			add(l5);
			
			
			l0.setBounds(0,0,600,100);
			
			l1.setBounds(100,100,500,50);
			
			l2.setBounds(100,150,500,50);
			
			l3.setBounds(100,200,500,50);
			
			l4.setBounds(100,250,500,50);
			
			l5.setBounds(100,300,500,50);
			
			
			
			
			
			
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
		Index5 fm7 = new Index5();
	 	fm7.setVisible(true);
	 }	
}	