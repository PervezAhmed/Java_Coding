import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
//import java.awt.FlowLayout;

public class FrameDemo extends JFrame
{
    JLabel u,p;
    JTextField j1,j2;
    JButton b1,b2;
    public FrameDemo()
    {
        setTitle("FrameDemo");
        setVisible(true);
        setSize(400,400);
        setLayout(null);
        u=new JLabel("Email-id");
        u.setBounds(50,50,100,30);
        add(u);
        j1=new JTextField();
        j1.setBounds(150,50,100,30);
        add(j1);
        p=new JLabel("Password");
        p.setBounds(50,100,100,30);
        add(p);
        j2=new JTextField();
        j2.setBounds(150,100,100,30);
        add(j2);
        b1=new JButton("Login");
        b1.setBounds(50,150,100,30);
        add(b1);
        b2=new JButton("Clear");
        b2.setBounds(150,150,100,30);
        add(b2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String ar[])
    {
        new FrameDemo();
    }
}
