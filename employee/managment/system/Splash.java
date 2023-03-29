package employee.managment.system;
/**
 *
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Splash extends JFrame implements ActionListener
{
    Splash()
    {
      //  setSize(1200,1200);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(300,300,1400,80);
        heading.setFont(new Font("raleway",Font.BOLD,60));
        heading.setForeground(Color.WHITE); 
        add(heading);
        
        JLabel l1=new JLabel();
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        l1.setBounds(5,0,1525,800);
        l1.setIcon(new ImageIcon(i1.getImage().getScaledInstance(1500,800,Image.SCALE_SMOOTH)));
        add(l1);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(630,430,300,70);
        clickhere.setBackground(Color.WHITE);
        clickhere.setBorderPainted(true);
        clickhere.setContentAreaFilled(false);
        clickhere.setOpaque(true);
        clickhere.setFont(new Font("Raleway",Font.BOLD,18));
        clickhere.setFocusable(false);
        clickhere.setForeground(Color.BLACK);
        clickhere.addActionListener(this);
        l1.add(clickhere);
        
        setSize(1525,850);
        setResizable(false);
        setLayout(null);
        getContentPane().setBackground(new Color(255, 255, 255));
        setLocationRelativeTo(null);
        setVisible(true);
//        while(true)
//        {
//            heading.setVisible(true);
//            try
//            {
//             //   Thread.sleep(100);
//            }
//            catch(Exception e)
//            {
//                
//            }    
//            heading.setVisible(true);
//        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(true);
        new Login();
    }
    public static void main(String args[])
    {
        new Splash();
    }
}
