
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
//import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SwingCounter extends JFrame implements ActionListener
{
    JLabel u;
    JTextField j1;
    JButton b1;
    static int count=0;
    public SwingCounter()
    {
        setTitle("SwingCounter");
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 25));
        setSize(400,400);
        setVisible(true);
        u=new JLabel("Counter");
        add(u);
        j1=new JTextField();
        add(j1);
        j1.setText(count+"");
        b1=new JButton("Count");
        b1.addActionListener(this);
        add(b1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==b1)
        {
            count++;
            j1.setText(count+"");
        }
    }
    public static void main(String ar[])
    {
        new SwingCounter();
    }
}
