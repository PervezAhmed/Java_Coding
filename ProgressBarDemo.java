import javax.swing.JFrame;
import javax.swing.JProgressBar;
/*import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;*/
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProgressBarDemo extends JFrame implements ActionListener
{
    JProgressBar p;
    JButton b;
    public ProgressBarDemo()
    {
        p=new JProgressBar();
        p.setMinimum(0);
        p.setMaximum(100);
        p.setValue(0);
        //p.setForeground(color,red);
        p.setStringPainted(true);
        b=new JButton("Click Here");
        b.addActionListener(this);
        //b.setBackground(color,blue);
        setLayout(new FlowLayout());
        add(p);
        add(b);
        setVisible(true);
        setSize(400,400);
        setTitle("ProgressBarDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent a)
    {
        if(p.getValue()==p.getMaximum())
            System.exit(0);
        p.setValue(p.getValue()+10);
    }
    public static void main(String ar[])
    {
        new ProgressBarDemo();
    }
}
