import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.table.DefaultTableModel;

class MyFrame extends JFrame
{
	JButton b10,b12,b11;
	JTextField t3,t4,t5,t6,t7;
	Font f1,f2;
	DefaultTableModel model;
	JTable table;
	JLabel l1,l2,l3,l4;

	
	
	MyActionListener ml;
	MyFrame()
	{
		table = new JTable(); 
        
        Object[] columns = {"DATE","ITEM","DEBIT/CREDIT","PRICE","AMOUNT"};
		/*try
		{
			FileWriter fw = new FileWriter("columns.txt");
			//fw.write(this.fm6.b3 + " " + " = " + this.fm6.t1 + " ");

			fw.close();
		}
	   catch (IOException ex) {
			ex.printStackTrace();
		}
		
		
		try
		{
			FileWriter fw = new FileWriter("columns.txt",true);
			for(int )
			//fw.write(this.fm6.b3 + " " + " = " + this.fm6.t1 + " ");

			fw.close();
		}
	   catch (IOException ex2) {
			ex2.printStackTrace();
		}*/
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        table.setModel(model);
        
        table.setBackground(Color.WHITE);
        table.setForeground(Color.black);
        Font font = new Font("",1,22);
        table.setFont(font);
        table.setRowHeight(30);
		
		JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        add(pane);
		
		setLayout(null);
		//setContentPane(new JLabel(new ImageIcon("C:\\Users\\ARSHDEEP SINGH\\OneDrive\\Desktop\\10.jpg")));
		setVisible(true);
		setBounds(0,0,940,788);
		ml = new MyActionListener(this);
		
		
		b10 = new JButton("ADD");
		b11 = new JButton("Send E-mail");
		b12 = new JButton("DELETE");
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField(); 
		t7 = new JTextField();		
		l1 = new JLabel("DATE");
		l2 = new JLabel("ITEM");
		l3 = new JLabel("DEBIT/CREDIT");
		l4 = new JLabel("PRICE");
		
		t3.setBounds(150, 220, 100, 25);
		t4.setBounds(150, 265, 100, 25);
		t5.setBounds(150, 310, 100, 25);
		t6.setBounds(150, 355, 100, 25);
		t7.setBounds(600, 500, 100, 25);
		
		l1.setBounds(20, 220, 100, 25);
		l2.setBounds(20, 265, 100, 25);
		l3.setBounds(20, 310, 100, 25);
		l4.setBounds(20, 355, 100, 25);
		
		
		b10.setBounds(50,400,100,25);
		b11.setBounds(550,400,100,25);
		b12.setBounds(350,400,100,25);
		
		
		
		f1 = new Font("Times",Font.BOLD,16);
		f2 = new Font("Times",Font.BOLD,30);
		b10.setFont(f1);
		b11.setFont(f1);
		b12.setFont(f1);
		
		add(b10);
		add(b11);
		add(b12);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		b10.addActionListener(ml);
		b11.addActionListener(ml);
		b12.addActionListener(ml);
		
		/*String s1[] = {"CREDIT","DEBIT"};
		c1 = new JComboBox(s1);
		c1.setBackground(Color.WHITE);*/
		
		
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
			MyFrame mf = new MyFrame();
			mf.setVisible(true);
	}
}