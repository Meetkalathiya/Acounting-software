import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.Container.*;

public class Index4 extends Frame
{
		Label l1,l2,l3,l4,l5,l7,l8,l9;
		TextField t1,t2,t3,t4,t5,t7,t8,t9;
		Button b1,b2;
		MyActionListener fm1 = new MyActionListener(this);
		Index4()
		{
			super("Accounting System");
			setLayout(null);
			setBounds(100,100,1500,1500);
			setBackground(Color.BLACK);
			setForeground(Color.WHITE);
			
			l1 = new Label("NAME");
			l2 = new Label("JOINING YEAR");
			l3 = new Label("GST NUMBER");
			l4 = new Label("CAPITAL");
			l5 = new Label("FINANCIAL YEAR");
			
			l7 = new Label("Email ID");
			l8 = new Label("Addhar No");
			l9 = new Label("ADDRESS");
			
			t1 = new TextField();
			t2 = new TextField();
			t3 = new TextField();
			t4 = new TextField();
			t5 = new TextField();
			
			t7 = new TextField();
			t8 = new TextField();
			t9 = new TextField();
			
			b1 = new Button("SAVE");
			b2 = new Button("BACK");
			
			Font f1 = new Font("TIMES",Font.BOLD,20);
			l1.setFont(f1);
			l2.setFont(f1);
			l3.setFont(f1);
			l4.setFont(f1);
			l5.setFont(f1);
			
			l7.setFont(f1);
			l8.setFont(f1);
			l9.setFont(f1);
			
			t1.setFont(f1);
			t2.setFont(f1);
			t3.setFont(f1);
			t4.setFont(f1);
			t5.setFont(f1);
			
			t7.setFont(f1);
			t8.setFont(f1);
			t9.setFont(f1);
			
			b1.setFont(f1);
			b2.setFont(f1);
			
			add(l1);
			add(l2);
			add(l3);
			add(l4);
			add(l5);
			
			add(l7);
			add(l8);
			add(l9);
			
			add(t1);
			add(t2);
			add(t3);
			add(t4);
			add(t5);
			
			add(t7);
			add(t8);
			add(t9);
			
			add(b1);
			add(b2);
			
			l1.setBounds(100,100,150,50);
			l2.setBounds(900,100,150,50);
			l3.setBounds(100,180,150,50);
			l4.setBounds(900,180,150,50);
			l5.setBounds(100,260,170,50);
			
			l7.setBounds(100,420,150,50);
			l8.setBounds(100,340,150,50);
			l9.setBounds(900,420,150,50);
			
			t1.setBounds(350,100,250,50);
			t2.setBounds(1100,100,250,50);
			t3.setBounds(350,180,250,50);
			t4.setBounds(1100,180,250,50);
			t5.setBounds(350,260,250,50);
			
			t7.setBounds(350,420,250,50);
			t8.setBounds(350,340,250,50);
			t9.setBounds(1100,420,250,50);
			
			b1.setBounds(900,650,250,50);
			b2.setBounds(400,650,250,50);
			b1.addActionListener(fm1);
			b2.addActionListener(fm1);
			
			
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
		Index4 fm4 = new Index4();
		fm4.setVisible(true);
	}	
}	