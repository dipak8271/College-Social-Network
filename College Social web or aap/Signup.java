import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Signup extends JFrame implements ActionListener{
    JTextField emailtextfield ,rollnofield;
    JPasswordField studentPassword, conformPassword;
    JButton submit,cencel;

    // public boolean studentLoginCheck(int enteredRollNo,)
    
    public void studentSignup(){
        setTitle("Wel-Come to BBSBEC");
        setLayout(null);

        JLabel text1 = new JLabel("Student Registration Page");
        text1.setBounds(140,20,350,50);
        text1.setFont(new Font("caliberi",Font.BOLD,24));
        text1.setForeground(Color.GREEN);
        add(text1);

        JLabel email = new JLabel("Email Address / Mobile Number");
        email.setBounds(80,70,430,30);
        email.setFont(new Font("caliberi",Font.BOLD,24));
        add(email);
        emailtextfield = new JTextField();
        emailtextfield.setBounds(10,110,540,30);
        add(emailtextfield);

        JLabel rollno = new JLabel("Roll No");
        rollno.setBounds(10,150,200,30);
        rollno.setFont(new Font("calibari",Font.BOLD,24));
        add(rollno);
        rollnofield = new JTextField();
        rollnofield.setBounds(260,150,290,30);
        add(rollnofield);

        JLabel fathername = new JLabel("PassWord");
        fathername.setBounds(10,200,200,30);
        fathername.setFont(new Font("railway",Font.BOLD,24));
        add(fathername);
        studentPassword = new JPasswordField();
        studentPassword.setBounds(260,200,290,30);
        add(studentPassword);

        JLabel conformPasswordField = new JLabel("Conform Password");
        conformPasswordField.setBounds(10,250,230,30);
        conformPasswordField.setFont(new Font("calibari",Font.BOLD,24));
        add(conformPasswordField);
        conformPassword = new JPasswordField();
        conformPassword.setBounds(260,250,290,30);
        add(conformPassword);
        
        cencel = new JButton("Cencel");
        cencel.setBounds(20,300,200,30);
        cencel.setBackground(Color.BLACK);
        cencel.setForeground(Color.GREEN);
        cencel.addActionListener(this);
        add(cencel);
        submit = new JButton("Submit");
        submit.setBounds(230,300,200,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.GREEN);
        submit.addActionListener(this);
        add(submit);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(580,400);
        setLocation(400,150);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String studentEmail =  emailtextfield.getText();
            String rollNo = rollnofield.getText();
            String enteredPass = studentPassword.getText();
            String enteredCpassword = conformPassword.getText();
            int cRollNo =  0;
            System.out.println(studentEmail);
            System.out.println(rollNo);
            System.out.println(enteredPass);
            System.out.println(enteredCpassword);
            if(enteredPass.equals(enteredCpassword)){
                try {
                    cRollNo = Integer.parseInt(rollNo);
                    System.out.println("Int RollNo "+cRollNo);
                    DataBase obj = new DataBase();
                    ResultSet resultSet = obj.getStudentData(cRollNo);
                    int id = 0;
                    while (resultSet.next()) {
                        id = resultSet.getInt("rollno"); 
                    }
                    System.out.println("Data Base Id " +id);

                    if(id != 0 && obj.insertIntoStudentLog(id,studentEmail,enteredCpassword) == 1){

                        JOptionPane.showMessageDialog(null, "Data Inserted");
                        setVisible(false);
                        new Login().studentLogin();
                    }
                    
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Enter Valid Roll No");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
             
        }
        if (ae.getSource() == cencel) {
            setVisible(false);
        }

    }
    // public static void main(String[] args) {
    //     Signup obj = new Signup();
    //     obj.studentSignup();
    // }
    
}
