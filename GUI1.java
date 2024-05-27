import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI1 extends JFrame  //JFrame follows CardLayout by default
{
    JLabel l1;
    JLabel l2;
    public GUI1()
    {
        this.setSize(400,400);
        this.setVisible(true);
        this.setTitle("My GUI 1");
        l1=new JLabel("Hi");
        l2=new JLabel("Hello");
        add(l1);
        add(l2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String av[])
    {
        new GUI1();
    }
}
