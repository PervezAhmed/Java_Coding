import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;

public class GUI3 extends JFrame  //JFrame follows CardLayout by default
{
    JLabel l1;
    JLabel l2,r;
    JTextField j1;
    JTextArea jta;
    JRadioButton b1,b2;
    JCheckBox c1,c2;
    JPasswordField p1;
    JButton b;
    public GUI3()
    {
        String s[]={"INDIA","USA","CANADA","AUSTRALIA","ENGLAND"};
        JComboBox c = new JComboBox(s);
        this.setTitle("My GUI 3");
        this.setSize(400,400);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        l1=new JLabel("Name");
        j1=new JTextField(20);
        b1=new JRadioButton("Male");
        b2=new JRadioButton("Female");
        b=new JButton("Click");
        r=new JLabel("Greetings");
        p1=new JPasswordField(20);
        jta=new JTextArea(2,20);
        c1=new JCheckBox("Cricket");
        c2=new JCheckBox("FootBall");
        ButtonGroup bg=new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        this.add(l1);
        this.add(j1);
        this.add(b1);
        this.add(b2);
        this.add(b);
        this.add(r);
        this.add(c1);
        this.add(c2);
        this.add(c);
        this.add(p1);
        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if(b1.isSelected())
                {
                    r.setText("Hi Mr. "+j1.getText()+"!");
                }
                else
                {
                    r.setText("Hi Mrs. "+j1.getText()+"!");
                }
            }
        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String av[])
    {
        new GUI3();
    }
}
