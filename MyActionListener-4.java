//set classpath=mail.jar;activation.jar;.;

import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  
  

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
public class MyActionListener implements ActionListener
{
	Login fm1;
	Index1 fm2;
	Index3 fm3;
	Index4 fm4;
	Index5 fm7;
	MyFrame2 fm5;
	MyFrame fm6;
	boolean b=true;
	
	MyActionListener(Login m)
	{
		this.fm1 = m;
	}
	MyActionListener(Index1 m)
	{
		this.fm2 = m;
	}
	MyActionListener(Index5 m)
	{
		this.fm7 = m;
	}
	MyActionListener(Index3 m)
	{
		this.fm3 = m;
	}
	MyActionListener(Index4 m)
	{
		this.fm4 = m;
	}
	MyActionListener(MyFrame2 m)
	{
		this.fm5 = m;
	}
	MyActionListener(MyFrame m)
	{
		this.fm6 = m;
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		/*if(ae.getActionCommand().equals("SAVE"))
		{
			int amount = Integer.parseInt(this.fm6.t1.getText());
			
			FileStore b = new FileStore();
			try
			{
				b.saveObject(amount,type,"Subway.txt");
			}
			catch(Exception ef)
			{
				System.out.println(ef);
			}
			
		}*/
		
		
		


	
		if(ae.getActionCommand().equals("Back"))
		{
			fm2 = new Index1();
			fm2.setVisible(true);
			fm1.setVisible(false);
		}
		if(ae.getActionCommand().equals("LOGIN"))
		{
			fm1 = new Login();
			fm1.setVisible(true);
			fm2.setVisible(false);
		}
		if(ae.getActionCommand().equals("Login"))
		{
			String Student = this.fm1.T_login.getText();
			String password = this.fm1.T_password.getText();
			if(Student.trim().equals("admin")&& password.trim().equals("123"))
			{
				fm3 = new Index3();
			    fm3.setVisible(true);
			    fm1.setVisible(false);
				JOptionPane.showMessageDialog(this.fm3,"Welcome");
			}
			else
			{
				JOptionPane.showMessageDialog(this.fm1,"Invalid");
			}
			
			
		}
		/*if(ae.getActionCommand().equals("Create"))
		{
			fm4 = new Index4();
			fm4.setVisible(true);
			fm1.setVisible(false);
		}*/
		if(ae.getActionCommand().equals("CREATE"))
		{
			fm4 = new Index4();
			fm4.setVisible(true);
			fm1.setVisible(false);
		}
		if(ae.getActionCommand().equals("Logout"))
		{
			fm1 = new Login();
			fm1.setVisible(true);
			fm3.setVisible(false);
		}
		if(ae.getActionCommand().equals("Entries"))
		{
			fm5 = new MyFrame2();
			fm5.setVisible(true);
			fm3.setVisible(false);
		}
		if(ae.getActionCommand().equals("Accounts"))
		{
			fm7 = new Index5();
			fm7.setVisible(true);
			fm3.setVisible(false);
		}	
        if(ae.getActionCommand().equals("Subway"))
		{
			fm6 = new MyFrame();
			fm6.setVisible(true);
			fm5.setVisible(false);
		}	
		if(ae.getActionCommand().equals("ADD"))
		{
		  
			Object[] row =new Object[5];
			
			//////
			
			String am =this.fm6.t6.getText();
			int am1 = Integer.parseInt(am);
			double output = am1*(1.18);
			System.out.println(output);
			
			
			/*String pm = this.fm6.output.getText();
			int am2 = Integer.parseInt(pm);
			double output1 =  am2+am2;
			String ottt = Double.toString(output1);
			System.out.println(output1);*/
			
			{
				DefaultTableModel table = new javax.swing.table.DefaultTableModel();    

				

				table.addRow(new Object[0]);
			

				List<String> numdata = new ArrayList<String>();
				for (int count = 1; count < table.getRowCount(); count++){
					  numdata.add(table.getValueAt(count, 1).toString());
                    }

               System.out.println(numdata); 
            }
			
			
		
			
			//String ot = String.ValueOf(output);
			String ott = Double.toString(output);
			row[0] = this.fm6.t3.getText();
			row[1] = this.fm6.t4.getText();
			row[2] = this.fm6.t5.getText();
			row[3] = this.fm6.t6.getText(); 
			row[4] = ott;
			try
			{
				if(!b)
				{
					FileWriter fw = new FileWriter("subway.txt",true);
					fw.write("DATE :- " +this.fm6.t3.getText()+","+ "ITEM NAME :-"+this.fm6.t4.getText()+","+"TYPE :-"+this.fm6.t5.getText()+","+"PRICE :-"+this.fm6.t6.getText()+" AMOUNT :-"+ott+"\n");
					fw.close();
					
				}
				else
				{
					FileWriter fw = new FileWriter("subway.txt");
					fw.write("DATE :- " +this.fm6.t3.getText()+","+ "ITEM NAME :-"+this.fm6.t4.getText()+","+"TYPE :-"+this.fm6.t5.getText()+","+"PRICE :-"+this.fm6.t6.getText()+" AMOUNT :-"+ott+"\n");
					fw.close();
					b=false;
				}
			}
			catch(IOException io)
			{
				
			}
			//////
			
		  this.fm6.model.addRow(row);
		  
		    this.fm6.t3.setText("");
			this.fm6.t4.setText("");
			this.fm6.t5.setText("");
			this.fm6.t6.setText(""); 
		  
		  
		  
		}
		if(ae.getActionCommand().equals("Send E-mail"))
		{
			System.out.println("Email");

            String host = "smtp.gmail.com";
            final String user="arshdeepsingh.makhija112974@marwadiuniversity.ac.in";//your email address
            final String password="Suxx@559";
            String to="meetkalathiya1301@gmail.com";//change accordingly

            //Get the session object
            Properties props = new Properties();   
            props.put("mail.smtp.host",host);
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.ssl.enable", "true");

            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator()
                    {
                        protected PasswordAuthentication
                        getPasswordAuthentication() {
                            return new PasswordAuthentication(user,password);
                        }
                    });

            
            try
            {

                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(user));
                message.addRecipient(Message.RecipientType.TO,new
                        InternetAddress(to));
                message.setSubject("Data");
                message.setText("This is your Balance Sheet");
                //Using HTML
                //message.setContent("Thanks for Learning <b>JAVA</b>");
                //send the message

                //========================================================================================

                Message mes = new MimeMessage(session);
                MimeMultipart multiparrt = new MimeMultipart();
                MimeBodyPart attachment = new MimeBodyPart();
                attachment.attachFile(new File("C:\\Users\\ARSHDEEP SINGH\\OneDrive\\Desktop\\hello//subway.txt"));
                multiparrt.addBodyPart(attachment);
                message.setContent(multiparrt);
                Transport.send(message);

                //========================================================================================

                Transport.send(message);
                System.out.println("message sent successfully...");

            }
            catch (MessagingException ex)
            {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
		}
		
	
		
			
			
			
			
		
		/*if(ae.getActionCommand().equals("DELETE"))
		{
			int i = this.fm6.table.getSelectedRow();
			if(i>=0)
			{
				this.fm6.model.removeRow(i);
				
			}
			else
			{
				System.out.println("Delete Error");
			}	
		}*/
		
	}
}