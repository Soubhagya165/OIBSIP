package Online.Reservation.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField tname;
    JPasswordField pass;
    JButton login,signup;
    public Login () {
        JLabel name = new JLabel("Username : ");
        name.setBounds(400,200,250,30);
        name.setFont(new Font("Arial",Font.BOLD,30));
        add(name);

        tname = new JTextField();
        tname.setBounds(600,200,500,30);
        tname.setFont(new Font("Algeria",Font.BOLD,25));
        add(tname);

        JLabel password = new JLabel("Password : ");
        password.setBounds(400,260,250,30);
        password.setFont(new Font("Arial",Font.BOLD,30));
        add(password);

        pass = new JPasswordField();
        pass.setBounds(600,260,500,30);
        pass.setFont(new Font("Algeria",Font.BOLD,25));
        add(pass);

        login = new JButton("Login");
        login.setBounds(600,320,150,30);
        login.setFont(new Font("Algeria",Font.BOLD,20));
        login.addActionListener(this);
        add(login);

        signup = new JButton("Sign Up");
        signup.setBounds(800,320,150,30);
        signup.setFont(new Font("Algeria",Font.BOLD,20));
        signup.addActionListener(this);
        add(signup);

        setLayout(null);
        setSize(1540,840);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login) {

        }
        else if(e.getSource() == signup) {

        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
