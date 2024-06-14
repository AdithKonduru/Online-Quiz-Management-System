package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login3.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 720, 500);
        add(image);
        
        JLabel heading = new JLabel("Brainy Bingo");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Colonna MT", Font.ITALIC, 40));
        heading.setForeground(new Color(128, 0, 128));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        heading.setForeground(new Color(128, 0, 128));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        heading.setForeground(new Color(128, 0, 128));
        rules.setForeground(Color.DARK_GRAY);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        heading.setForeground(new Color(128, 0, 128));
        back.setForeground(Color.DARK_GRAY);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
