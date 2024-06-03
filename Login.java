// package com.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Objects;

public class Login extends JFrame {


    JLabel background;
    JLabel L_login, L_password, back_img;
    JTextField T_login, T_password;
    // JPasswordField T_password;
    JButton B_Login;


    Login()
	{
        super("Seco Software Management");
        JFrame frame = new JFrame();
        MyActionListener ml = new MyActionListener(this);
        setLayout(null);
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\ARSHDEEP SINGH\\OneDrive\\Desktop\\2.jpg")));
        setSize(500, 400);
        setVisible(true);
        //-------------------------------------------------------------------------------------------------



        //--------------------------------------------------------------------------------------------------

        L_login = new JLabel("User name");
        L_password = new JLabel("Password");

        T_login = new JTextField();
        T_password = new JPasswordField();

        B_Login = new JButton("Login");

        add(L_login);
        add(L_password);
        add(T_login);
        add(T_password);
        add(B_Login);
    
        //====================================================

        B_Login.setBackground(Color.WHITE);
        L_password.setForeground(Color.RED);
        L_login.setForeground(Color.RED);

        //=====================================================
        
        L_login.setBounds(100,100,200,30);
        T_login.setBounds(200,100,200,30);
        L_password.setBounds(100,150,200,30);
        T_password.setBounds(200,150,200,30);
        B_Login.setBounds(150,200,200,30);


        B_Login.addActionListener(ml);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) throws Exception{
        new Login();
        Login fm1 = new Login();
        fm1.setVisible(true);

    }

}


