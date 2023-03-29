package employee.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Home extends JFrame implements ActionListener
{
    JButton view,update,add,remove;
    Home()
    {
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewImage2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1525, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1525,850);
        add(image);
        
        JLabel heading = new JLabel("Employee Managment System");  
        heading.setBounds(880,120,500,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("RALEWAY",Font.BOLD,30));
        image.add(heading);
        
        add = new JButton("Add Employee");
        add.setBounds(900,180,180,40);
        add.setBackground(Color.WHITE);
        add.setBorderPainted(true);
        add.setContentAreaFilled(false);
        add.setOpaque(true);
        add.setFont(new Font("Raleway",Font.PLAIN,18));
        add.setFocusable(false);
        add.setForeground(Color.BLACK);
        add.addActionListener(this);
        image.add(add);
        
        view = new JButton("View Employee");
        view.setBounds(1110,180,180,40);
        view.setBackground(Color.WHITE);
        view.setBorderPainted(true);
        view.setContentAreaFilled(false);
        view.setOpaque(true);
        view.setFont(new Font("Raleway",Font.PLAIN,18));
        view.setFocusable(false);
        view.setForeground(Color.BLACK);
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(900,250,180,40);
        update.setBackground(Color.WHITE);
        update.setBorderPainted(true);
        update.setContentAreaFilled(false);
        update.setOpaque(true);
        update.setFont(new Font("Raleway",Font.PLAIN,18));
        update.setFocusable(false);
        update.setForeground(Color.BLACK);
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(1110,250,180,40);
        remove.setBackground(Color.WHITE);
        remove.setBorderPainted(true);
        remove.setContentAreaFilled(false);
        remove.setOpaque(true);
        remove.setFont(new Font("Raleway",Font.PLAIN,17));
        remove.setFocusable(false);
        remove.setForeground(Color.BLACK);
        remove.addActionListener(this);
        image.add(remove);
        
        setSize(1525,850);
        setResizable(false);
        setLayout(null);
        getContentPane().setBackground(new Color(255, 255, 255));
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args)
    {
        new Home();
    }
}
