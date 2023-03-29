package employee.managment.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener{
    
    JTextField tfeducation, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation;
    JLabel lblempId;
    JButton add, back;
    String empId;
    
    UpdateEmployee(String empId) {
        this.empId = empId;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel image=new JLabel();
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewImage.jpg"));
        image.setBounds(0,0,1525,800);
        image.setIcon(new ImageIcon(i1.getImage().getScaledInstance(1500,800,Image.SCALE_SMOOTH)));
        add(image);
        
        JLabel heading = new JLabel("Update Employee Detail");
        heading.setBounds(550, 50, 500, 50);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 40));
        image.add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(400, 150, 150, 30);
        labelname.setForeground(Color.WHITE);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(labelname);
        
        JLabel lblname = new JLabel();
        lblname.setBounds(550, 150, 150, 30);
        image.add(lblname);
        
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
        
        JLabel lbldob = new JLabel();
        lbldob.setBounds(550, 210, 150, 30);
        image.add(lbldob);
        
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
        
        tfeducation = new JTextField();
        tfeducation.setBounds(950, 330, 150, 30);
        image.add(tfeducation);
        
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
        
        JLabel lblaadhar = new JLabel();
        lblaadhar.setBounds(950, 390, 150, 30);
        image.add(lblaadhar);
        
        JLabel labelempId = new JLabel("Employee id");
        labelempId.setBounds(400, 450, 150, 30);
        labelempId.setForeground(Color.WHITE);
        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(labelempId);
        
        lblempId = new JLabel();
        lblempId.setBounds(550, 450, 150, 30);
        lblempId.setFont(new Font("serif", Font.PLAIN, 20));
        image.add(lblempId);
        
        try {
            Conn c = new Conn();
            String query = "select * from employee where empId = '"+empId+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                lblname.setText(rs.getString("name"));
                tffname.setText(rs.getString("fname"));
                lbldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfsalary.setText(rs.getString("salary"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfeducation.setText(rs.getString("education"));
                lblaadhar.setText(rs.getString("aadhar"));
                lblempId.setText(rs.getString("empId"));
                tfdesignation.setText(rs.getString("designation"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        add = new JButton("Update Details");
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
        //setLocation(300, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String fname = tffname.getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();
            String designation = tfdesignation.getText();
            
            try {
                Conn conn = new Conn();
                String query = "update employee set fname = '"+fname+"', salary = '"+salary+"', address = '"+address+"', phone = '"+phone+"', email =  '"+email+"', education = '"+education+"', designation = '"+designation+"' where empId = '"+empId+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
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

    public static void main(String[] args) {
        new UpdateEmployee("");
    }
}