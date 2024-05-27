/*import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;*/
import javax.swing.*;
import java.awt.*;

public class GUI2 extends JFrame  //JFrame follows CardLayout by default
{
    JLabel l1;
    JLabel l2;
    JTextField j1;
    JTextField j2;
    JButton b;
    public GUI2()
    {
        this.setTitle("My GUI 2");
        this.setSize(400,400);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        l1=new JLabel("Email");
        j1=new JTextField(20);
        l2=new JLabel("Password");
        j2=new JTextField(20);
        b=new JButton("Login");
        this.add(l1,BorderLayout.NORTH);
        this.add(j1,BorderLayout.SOUTH);
        this.add(l2,BorderLayout.WEST);
        this.add(j2,BorderLayout.EAST);
        this.add(b,BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String av[])
    {
        new GUI2();
    }
}
