import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventHandling extends JFrame
{ 
    JTextField t1;
    JLabel l;
    JButton button;
    EventHandling()
    {
        t1 = new JTextField(20);
        l=new JLabel();
        button = new JButton("Click Here");
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                t1.setText("Welcome to INDIA");
            }
        });
        addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent e)
            {
                l.setText("Mouse Pressed at ("+e.getX()+","+e.getY()+") co-ordinates");
            }
        });
        add(t1);
        add(button);
        add(l);
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String av[])
    {
        new EventHandling();
    }
}