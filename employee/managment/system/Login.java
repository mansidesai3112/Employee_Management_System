package employee.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener
{
    JTextField tfusername,tfpassword;
    Login()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Raleway",Font.BOLD,20));
        lblusername.setBounds(70,90,100,30);
        add(lblusername);
        
        tfusername = new JTextField(); 
        tfusername.setBounds(230,90,150,30);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("Raleway",Font.BOLD,20));
        lblpassword.setBounds(70,150,100,30);
        add(lblpassword);
        
        tfpassword = new JTextField(); 
        tfpassword.setBounds(230,150,150,30);
        add(tfpassword);
        
        JButton login = new JButton("Login");
        login.setBounds(230,220,150,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500,30,200,200);
        add(image);
        
        setSize(800,400);
        setResizable(false);
        setLayout(null);
        getContentPane().setBackground(new Color(255, 255, 255));
        setLocationRelativeTo(null);
        setResizable(false);
        setLocation(350,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            Conn c = new Conn();
            String query = "select * from login where username = '"+username+"' and password='"+password+"'";
            ResultSet rs = c.s.executeQuery(query);
            if(rs.next())
            {
                setVisible(false);
                new Home();
                
            }else
            {
                JOptionPane.showMessageDialog(null, "Invalid Username and Password");
                setVisible(false);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        new Login();
    }

}
