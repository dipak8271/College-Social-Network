import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
    

    private String administerEmail = "vishalkumar84140@gmail.com";
    private String administerPassword = "vishal1234";
    private JTextField rollNoField, mobile, administerEmailText;
    private JButton studentSingup, studentForgetpass, studentLogin , log,forgetpass;
    private JPasswordField password, administerPasswordText;
    
    public void administerpassForget(String email, String pass){
        DataBase obj = new DataBase();
        ResultSet resultSet = obj.getAdministerData(email);
        String dbemail = "";
        try {
            while (resultSet.next()) {
                dbemail = resultSet.getString("email"); 
                // dbpassword = resultSet.getString("password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(email.equals(dbemail)){
            int a = obj.updateadminister(pass);
            if(a == 1){
                JOptionPane.showMessageDialog(null, "Password Changed successfully");
            }
            else{
                    JOptionPane.showMessageDialog(null,"Entered Detials Are Not Matched");
                }
        }
    }

    public boolean administerLoginCheck(String administerEmail,String administerPassword){
        if (this.administerEmail.equals(administerEmail) && this.administerPassword.equals(administerPassword)) {
            // System.out.println("Hello");
            return true;
        }
        ResultSet resultSet = new DataBase().getAdministerData(administerEmail);
        String dbemail = "";
        String dbpass ="";
        try {
            while (resultSet.next()) {
                dbemail = resultSet.getString("email");
                dbpass = resultSet.getString("password");  
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(administerEmail.equals(dbemail) && administerPassword.equals(dbpass)){
            return true;
        }
        return false;
    }
// Student Mobile Login Check for Student
    public boolean studentLoginCheck(int enteredRollNo,long enteredPhoneNo, int dbRollNo, long dbPhoneNo,String logPassword, String enteredpass){
        if(enteredRollNo == dbRollNo && logPassword.equals(enteredpass) && (enteredPhoneNo == dbPhoneNo) ){
            return true;
        }
        return false;
    }
// Student Email Login Check for Student
    public boolean studentLoginCheck(int enteredRollNo, int dbRollNo,String logPassword, String enteredpass,String email,String dbEmail){
        if(enteredRollNo == dbRollNo && logPassword.equals(enteredpass) && email.equals(dbEmail) ){
            return true;
        }
        return false;
    }
// Phone Number Login Check for faculty

    public boolean facultyNumberLoginCheck(long number, String password, long dbNumber,String dbPassword){
        if (number==dbNumber && password.equals(dbPassword)) {
            return true;
        }
        return false;
    }

    public boolean adminEmailLoginCheck(String enteredEmail,String enteredPassword, String dbEmail, String dbPassword){
        if(enteredEmail.equals(dbEmail) && enteredPassword.equals(dbPassword)){
            return true;
        }
        return false;
    }


    public void administerLogin(){
        setTitle("Wel-Come To BBSBE College");
        setLayout(null);

        JLabel text = new JLabel("Wel-Come To BBSBE College");
        text.setFont(new Font("railway",Font.BOLD,24));
        text.setBackground(Color.BLACK);
        text.setForeground(Color.ORANGE);
        text.setBounds(20,0,450,100);
        add(text);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Logo_bbsbec_txt.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(120,50,150,150);
        add(label);
        
        JLabel mobileNo = new JLabel("Enter Administer Email Id");
        mobileNo.setBounds(35,180,350,30);
        mobileNo.setFont(new Font("calibri",Font.BOLD,28));
        add(mobileNo);
        administerEmailText = new JTextField();
        administerEmailText.setBounds(10,220,360,30);
        add(administerEmailText);

        JLabel passwordField = new JLabel("Enter Your Password");
        passwordField.setBounds(50,260,300,30);
        passwordField.setFont(new Font("railway",Font.BOLD,28));
        add(passwordField);
        administerPasswordText = new JPasswordField();
        administerPasswordText.setBounds(10,300,360,30);
        add(administerPasswordText);

        log = new JButton("Login");
        log.setBounds(35,350,300,38);
        log.setFont(new Font("railway",Font.BOLD,20));
        log.addActionListener(this);
        add(log);

        forgetpass = new JButton("Forget Password");
        forgetpass.setBounds(35,400,300,38);
        forgetpass.setFont(new Font("railway",Font.BOLD,20));
        forgetpass.addActionListener(this);
        add(forgetpass);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(400,500);
        setVisible(true);
        setLocation(300,5);

    }

    public void studentLogin(){
        setTitle("Wel-Come To BBSBECC");
        setLayout(null);

        JLabel text = new JLabel("Wel-Come To BBSBE College");
        text.setFont(new Font("railway",Font.BOLD,24));
        text.setBackground(Color.BLACK);
        text.setForeground(Color.ORANGE);
        text.setBounds(20,0,450,100);
        add(text);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Logo_bbsbec_txt.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(120,50,150,150);
        add(label);
        
        JLabel mobileno = new JLabel("Enter Mobile No / Email Id");
        mobileno.setFont(new Font("calibri",Font.BOLD,28));
        Dimension size = mobileno.getPreferredSize();
        mobileno.setBounds(20,220,size.width,30);
        add(mobileno);

        mobile = new JTextField();
        mobile.setBounds(20,250,340,30);
        add(mobile);

        JLabel rollno = new JLabel("Roll No ");
        rollno.setBounds(20,300,100,30);
        rollno.setFont(new Font("caliberi",Font.BOLD,26));
        add(rollno);

        rollNoField = new JTextField();
        rollNoField.setBounds(160,300,200,30);
        add(rollNoField);

        JLabel passwordField = new JLabel("Password");
        passwordField.setBounds(20,350,150,30);
        passwordField.setFont(new Font("railway",Font.BOLD,28));
        add(passwordField);

        password = new JPasswordField();
        password.setBounds(160,350,200,30);
        add(password);

        studentLogin = new JButton("Login");
        studentLogin.setBounds(35,400,300,38);
        studentLogin.setFont(new Font("railway",Font.BOLD,20));
        studentLogin.addActionListener(this);
        add(studentLogin);

        studentForgetpass = new JButton("Forget password");
        studentForgetpass.setBounds(10,450,195,38);
        studentForgetpass.setFont(new Font("caliberi",Font.BOLD,20));
        studentForgetpass.setBackground(Color.WHITE);
        studentForgetpass.setForeground(Color.BLACK);
        add(studentForgetpass);
        
        studentSingup = new JButton("Sign up");
        studentSingup.setBounds(210,450,160,38);
        studentSingup.setFont(new Font("railway",Font.BOLD,20));
        studentSingup.addActionListener(this);
        add(studentSingup);

        getContentPane().setBackground(Color.WHITE);
        setSize(400,550);
        setVisible(true);
        setLocation(300,5);

    }

    JTextField adminMobile;
    JPasswordField adminPassword;
    JButton adminforgetpass, adminLog;

    public void facultyLogin(){
        setTitle("Wel-Come To BBSBECC");
        setLayout(null);

        JLabel text = new JLabel("Wel-Come To BBSBE College");
        text.setFont(new Font("railway",Font.BOLD,24));
        text.setBackground(Color.BLACK);
        text.setForeground(Color.ORANGE);
        text.setBounds(20,0,450,100);
        add(text);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Logo_bbsbec_txt.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(120,50,150,150);
        add(label);
        
        JLabel mobileNo = new JLabel("Mobile No / Email Id");
        mobileNo.setBounds(65,180,250,30);
        mobileNo.setFont(new Font("calibri",Font.BOLD,28));
        add(mobileNo);

        adminMobile = new JTextField();
        adminMobile.setBounds(10,220,360,30);
        add(adminMobile);

        JLabel passwordField = new JLabel("Password");
        passwordField.setBounds(120,260,200,30);
        passwordField.setFont(new Font("railway",Font.BOLD,28));
        add(passwordField);

        adminPassword = new JPasswordField();
        adminPassword.setBounds(10,300,360,30);
        add(adminPassword);

        adminLog = new JButton("Login");
        adminLog.setBounds(35,350,300,38);
        adminLog.setFont(new Font("railway",Font.BOLD,20));
        adminLog.addActionListener(this);
        add(adminLog);

        adminforgetpass = new JButton("Forget password");
        adminforgetpass.setBounds(35,400,300,38);
        adminforgetpass.setFont(new Font("caliberi",Font.BOLD,20));
        adminforgetpass.setBackground(Color.WHITE);
        adminforgetpass.setForeground(Color.BLACK);
        adminforgetpass.addActionListener(this);
        add(adminforgetpass);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(400,500);
        setVisible(true);
        setLocation(300,5);

    }


    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == studentLogin){
            String enteredRollNo = rollNoField.getText();
            String enteredMobileNo = mobile.getText();
            String studentPassword = password.getText();
            int enteredIntRollNo;
            long enteredLongMobileNo = 0;
            
            try {
                enteredIntRollNo = Integer.parseInt(enteredRollNo);
                enteredLongMobileNo = Long.parseLong(enteredMobileNo);

                // System.out.println(crollNo);
                // System.out.println(cmobile);
                // System.out.println(studentPassword);
                ResultSet resultSet = new DataBase().getStudentData(enteredIntRollNo);
                ResultSet resultSet1 = new DataBase().getStudentLogData(enteredIntRollNo);

                String name = null,email = null,branch = null,logEmail = null , logPassword = null;
                int dbrollNo = 0, adminId = 0;
                long number = 0;
                while (resultSet.next() && resultSet1.next()) {
                    dbrollNo = resultSet.getInt("rollno");
                    name = resultSet.getString("name");
                    email = resultSet.getString("email");
                    branch = resultSet.getString("branch");
                    number = resultSet.getLong("phonenumber");
                    adminId = resultSet.getInt("adminid");
                    // logRollNo = resultSet1.getInt("rollno");
                    // logMobile = resultSet1.getLong("mobileNo");
                    logPassword = resultSet1.getString("studentpassword");
                    logEmail = resultSet1.getString("studentemail");
                     
                }

                if(enteredLongMobileNo != 0 && studentLoginCheck(enteredIntRollNo, enteredLongMobileNo , dbrollNo, number,logPassword,studentPassword)){
                    setVisible(false);
                    new Home().studentHome(dbrollNo,name,email,branch,number,adminId);

                }
                else if(enteredLongMobileNo == 0 && studentLoginCheck(enteredIntRollNo,  dbrollNo,logPassword,studentPassword, logEmail, enteredMobileNo)){
                    setVisible(false);
                    new Home().studentHome(dbrollNo,name,email,branch,number,adminId);

                }
                else{
                    JOptionPane.showMessageDialog(null, "Enter Correct Details");
                    rollNoField.setText("");
                    mobile.setText("");
                    password.setText("");

                }

            } catch (NumberFormatException exp) {
                JOptionPane.showMessageDialog(null,"Enter Valid Details Or \nContact The Admin");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            setVisible(false);
            new Signup().setVisible(true);
        }
        
        if (ae.getSource() == studentSingup) {
            setVisible(false);
            Signup object = new Signup();
            object.studentSignup();
        }
        if(ae.getSource() == log){
            String email = administerEmailText.getText();
            String password = administerPasswordText.getText();
            
            if(administerLoginCheck(email, password)){
                System.out.println("----------- Login --------");
                setVisible(false);
                Entery obj = new Entery();
                obj.adminEntery();
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect Details !!!");
                administerEmailText.setText("");
                administerPasswordText.setText("");
            }
            
        }
        if(ae.getSource() == forgetpass){
            setVisible(false);
            new Forget().administerForgetpass();
        }
        if(ae.getSource() == adminLog){
            String enteredEmail = adminMobile.getText();
            String enteredPassword = adminPassword.getText();
            // long adminNumber = 0;
            // try {
            //     adminNumber = Long.parseLong(enteredEmail);
            // } catch (NumberFormatException e) {
            //     System.out.println(e);
            // }
            try {
                DataBase obj = new DataBase();
                ResultSet resultSet = obj.getAdminData(enteredEmail,enteredPassword);
                String dbEmail = null , dbPassword = null, name = null, branch =null;
                int id = 0;long phone = 0;
                while (resultSet.next()) {
                    id = resultSet.getInt("id");
                    name = resultSet.getString("name");
                    dbEmail = resultSet.getString("email");
                    dbPassword =resultSet.getString("password");
                    phone = resultSet.getLong("phone");
                    branch = resultSet.getString("branch");
                    System.out.println("id --> " +id);
                    System.out.println("name --> " +name);
                    System.out.println("email --> " +dbEmail);
                    System.out.println("password --> " +dbPassword);
                    System.out.println("phone --> " +phone);
                    System.out.println("branch --> " +branch);  
                }
                if(new Login().adminEmailLoginCheck(enteredEmail,enteredPassword,dbEmail,dbPassword)){
                    setVisible(false);
                    new Home().adminHome(id,name,branch);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Entered Email / Password is Wrong \nContect To Admin / Faculty");
                }
                
                // if(adminNumber != 0) {
                //     if(new Login().adminEmailLoginCheck(enteredEmail,enteredPassword,dbEmail,dbPassword)){
                //         setVisible(false);
                //         new Home().adminHome(id,name,branch);
                //     }
                //     else{
                //         JOptionPane.showMessageDialog(null, "Entered Email / Password is Wrong \nContect To Admin / Faculty");
                //     }
                // }
                // else {
                //     if (new Login().facultyNumberLoginCheck(adminNumber,enteredPassword,phone,dbPassword)){
                //         setVisible(false);
                //         new Home().adminHome(id, name, branch);    
                //     }
                // }
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
        if(ae.getSource() == adminforgetpass){
            setVisible(false);
            new Forget().adminForgetpass();
        }

    }

    // public static void main(String[] args) {
    // Login obj = new Login();
    // obj.adminLogin();
    // // obj.studentLogin();
    // // obj.administerLogin();
    // }
}