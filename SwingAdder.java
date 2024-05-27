
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
//import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SwingAdder extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField j1,j2,j3;
    JButton b1,b2;
    static int count=0;
    public SwingAdder()
    {
        setTitle("SwingAdder");
        setLayout(new GridLayout(4,2));
        setSize(400,400);
        setVisible(true);
        l1=new JLabel("FirstNumber");
        add(l1);
        j1=new JTextField(60);
        add(j1);
        l2=new JLabel("SecondNumber");
        add(l2);
        j2=new JTextField(60);
        add(j2);
        l3=new JLabel("Result");
        add(l3);
        j3=new JTextField(60);
        add(j3);
        b1=new JButton("ADD");
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("CLEAR");
        b2.addActionListener(this);
        add(b2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent a)
    {
        int x,y,z;
        if(a.getSource()==b1)
        {
            x=Integer.parseInt(j1.getText());
            y=Integer.parseInt(j2.getText());
            z=x+y;
            j3.setText(z+"");
        }
        else{
            j1.setText("");
            j2.setText("");
            j3.setText("");
        }
    }
    public static void main(String ar[])
    {
        new SwingAdder();
    }
}
