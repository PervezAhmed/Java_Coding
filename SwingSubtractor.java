import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingSubtractor extends JFrame
{   
    JTextField t1,t2,t3;
    JLabel l1,l2,l3;
    JButton b1,b2;
    SwingSubtractor()
    {
        setTitle("Swing Subtractor");
        setSize(800,800);
        setLayout(new GridLayout(4,2));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1=new JLabel("First Number");
        l2=new JLabel("Second Number");
        l3=new JLabel("Result");
        t1=new JTextField(20);
        t2=new JTextField(20);
        t3=new JTextField(20);
        b1=new JButton("Subtract");
        b2=new JButton("Clear");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        ActionListener a= new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if(ae.getSource()==b1){
                    int num1=Integer.parseInt(t1.getText());
                    int num2=Integer.parseInt(t2.getText());
                    t3.setText(""+(num1-num2));
                }
                else if(ae.getSource()==b2)
                {
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                }
            }
        };
        b1.addActionListener(a);
        b2.addActionListener(a);              
    }
    public static void main(String arg[])
    {
        new SwingSubtractor();
    }    
}
