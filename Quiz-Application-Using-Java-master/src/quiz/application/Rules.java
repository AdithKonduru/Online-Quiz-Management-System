package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Brainy Bingo");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(128, 0, 128));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Pay attention to how to join and complete the quiz." + "<br><br>" +
                "2. If you have tech problems, ask for help before the quiz starts." + "<br><br>" +
                "3. No cheating! Follow the rules and do your best on your own." + "<br><br>" +
                "4. Finish the quiz within the time limit. Pace yourself." + "<br><br>" +
                "5. Make sure you understand each question before answering." + "<br><br>" +
                "6. Test your computer or device beforehand to avoid issues." + "<br><br>" +
                "7. Learn from your mistakes. Look at feedback after the quiz." + "<br><br>" +
                "8. Take the quiz in a quiet place without distractions." + "<br><br>" +
                "9. Enjoy the quiz! It's a chance to show what you know." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        heading.setForeground(new Color(128, 0, 128));
        back.setForeground(Color.DARK_GRAY);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        heading.setForeground(new Color(128, 0, 128));
        start.setForeground(Color.DARK_GRAY);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
