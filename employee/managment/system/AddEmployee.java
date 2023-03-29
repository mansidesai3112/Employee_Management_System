package employee.managment.system;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempId;
    JButton add, back;
    
    AddEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel image=new JLabel();
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewImage.jpg"));
        image.setBounds(0,0,1525,800);
        image.setIcon(new ImageIcon(i1.getImage().getScaledInstance(1500,800,Image.SCALE_SMOOTH)));
        add(image);

        
        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(550, 50, 500, 50);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 40));
        image.add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(400, 150, 150, 30);
        labelname.setForeground(Color.WHITE);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(550, 150, 150, 30);
        image.add(tfname);
        
        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(750, 150, 150, 30);
        labelfname.setForeground(Color.WHITE);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(labelfname);
        
        tffname = new JTextField();
        tffname.setBounds(950, 150, 150, 30);
        image.add(tffname);
        
        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(400, 210, 150, 30);
        labeldob.setForeground(Color.WHITE);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(labeldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(550, 210, 150, 30);
        image.add(dcdob);
        
        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(750, 210, 150, 30);
        labelsalary.setForeground(Color.WHITE);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(labelsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(950, 210, 150, 30);
        image.add(tfsalary);
        
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(400, 270, 150, 30);
        labeladdress.setForeground(Color.WHITE);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(labeladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(550, 270, 150, 30);
        image.add(tfaddress);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(750, 270, 150, 30);
        labelphone.setForeground(Color.WHITE);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(950, 270, 150, 30);
        image.add(tfphone);
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(400, 330, 150, 30);
        labelemail.setForeground(Color.WHITE);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(550, 330, 150, 30);
        image.add(tfemail);
        
        JLabel labeleducation = new JLabel("Higest Education");
        labeleducation.setBounds(750, 330, 150, 30);
        labeleducation.setForeground(Color.WHITE);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(labeleducation);
        
        String courses[] = {"BBA", "BCA", "BA", "BSC", "B.COM", "BTech", "MBA", "MCA", "MA", "MTech", "MSC", "PHD"};
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(950, 330, 150, 30);
        image.add(cbeducation);
        
        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(400, 390, 150, 30);
        labeldesignation.setForeground(Color.WHITE);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(labeldesignation);
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(550, 390, 150, 30);
        image.add(tfdesignation);
        
        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(750, 390, 150, 30);
        labelaadhar.setForeground(Color.WHITE);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(labelaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(950, 390, 150, 30);
        image.add(tfaadhar);
        
        JLabel labelempId = new JLabel("Employee id");
        labelempId.setBounds(400, 450, 150, 30);
        labelempId.setForeground(Color.WHITE);
        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(labelempId);
        
        lblempId = new JLabel("" + number);
        lblempId.setBounds(550, 450, 150, 30);
        lblempId.setForeground(Color.WHITE);
        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(lblempId);
        
        add = new JButton("Add Details");
        add.setBounds(550, 550, 200, 40);
        add.addActionListener(this);
        add.setBackground(Color.WHITE);
        add.setFont(new Font("Raleway",Font.BOLD,18));
        add.setForeground(Color.BLACK);
        image.add(add);
        
        back = new JButton("Back");
        back.setBounds(780, 550, 200, 40);
        back.addActionListener(this);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Raleway",Font.BOLD,18));
        image.add(back);
        
       setSize(1525,850);
       // setLocation(300, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empId = lblempId.getText();
            
            try {
                Conn conn = new Conn();
                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) 
    {
        new AddEmployee();
    }
}