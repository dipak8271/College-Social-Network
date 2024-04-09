import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Entery extends JFrame implements ActionListener{
    JButton adminSubmit, adminCancel , studentSubmit, studentCancel;
    JTextField adminIdText, adminNameText, adminEmailText, adminPhoneText, adminBranchText, studentIdText, studentNameText, studentEmailText, studentPhoneText;
    JPasswordField adminPasswordText, studentPasswordText;


    String adminBranch = null;
    int adminId = 0;
    public void studentEntery(int id, String branch){
        adminBranch = branch;
        adminId = id;

        JLabel text = new JLabel("Wel-Come To BBSBE College");
        text.setFont(new Font("railway",Font.BOLD,24));
        text.setBackground(Color.BLACK);
        text.setForeground(Color.ORANGE);
        text.setBounds(135,0,450,100);
        add(text);

        JLabel text1 = new JLabel("Student Registration Page");
        text1.setFont(new Font("railway",Font.BOLD,24));
        text1.setBackground(Color.BLACK);
        // text1.setForeground(Color.ORANGE);
        text1.setBounds(160,50,450,100);
        add(text1);

        JLabel adminId = new JLabel("Enter Student Id");
        adminId.setFont(new Font("Railway",Font.BOLD,22));
        adminId.setBounds(20,180,200,30);
        adminId.setForeground(Color.CYAN);
        add(adminId);
        studentIdText = new JTextField();
        studentIdText.setFont(new Font("Railway",Font.BOLD,16));
        studentIdText.setBounds(300,180,300,30);
        add(studentIdText);

        JLabel adminName = new JLabel("Enter Student Name");
        adminName.setFont(new Font("Railway",Font.BOLD,22));
        adminName.setBounds(20,230,230,30);
        adminName.setForeground(Color.CYAN);
        add(adminName);
        studentNameText = new JTextField();
        studentNameText.setFont(new Font("Railway",Font.BOLD,16));
        studentNameText.setBounds(300,230,300,30);
        add(studentNameText);

        JLabel adminEmail = new JLabel("Enter Student Email");
        adminEmail.setFont(new Font("Railway",Font.BOLD,22));
        adminEmail.setBounds(20,280,230,30);
        adminEmail.setForeground(Color.CYAN);
        add(adminEmail);
        studentEmailText = new JTextField();
        studentEmailText.setFont(new Font("Railway",Font.BOLD,16));
        studentEmailText.setBounds(300,280,300,30);
        add(studentEmailText);

        JLabel adminPassword = new JLabel("Enter Student PassWord");
        adminPassword.setFont(new Font("Railway",Font.BOLD,22));
        adminPassword.setBounds(20,330,270,30);
        adminPassword.setForeground(Color.CYAN);
        add(adminPassword);
        studentPasswordText = new JPasswordField();
        studentPasswordText.setFont(new Font("Railway",Font.BOLD,16));
        studentPasswordText.setBounds(300,330,300,30);
        add(studentPasswordText);

        JLabel adminPhoneNo = new JLabel("Enter Student Phone");
        adminPhoneNo.setFont(new Font("Railway",Font.BOLD,22));
        adminPhoneNo.setBounds(20,380,230,30);
        adminPhoneNo.setForeground(Color.CYAN);
        add(adminPhoneNo);
        studentPhoneText = new JTextField();
        studentPhoneText.setFont(new Font("Railway",Font.BOLD,16));
        studentPhoneText.setBounds(300,380,300,30);
        add(studentPhoneText);

        JLabel adminBranch = new JLabel("Student Branch");
        adminBranch.setFont(new Font("Railway",Font.BOLD,22));
        adminBranch.setBounds(20,430,230,30);
        adminBranch.setForeground(Color.CYAN);
        add(adminBranch);
        // adminBranch.setText(branch);
        JLabel adminBranchText = new JLabel();
        adminBranchText.setFont(new Font("Railway",Font.BOLD,22));
        adminBranchText.setBounds(300,430,300,30);
        add(adminBranchText);
        adminBranchText.setText(branch);

        studentSubmit = new JButton(" Submit ");
        studentSubmit.setBounds(320,500,220,50);
        studentSubmit.setFont(new Font("Railway",Font.BOLD,26));
        studentSubmit.setBackground(Color.CYAN);
        studentSubmit.setForeground(Color.MAGENTA);
        studentSubmit.addActionListener(this);
        add(studentSubmit);

        studentCancel = new JButton(" Cancel ");
        studentCancel.setBounds(50,500,220,40);
        studentCancel.setFont(new Font("Railway",Font.BOLD,22));
        studentCancel.setBackground(Color.WHITE);
        studentCancel.addActionListener(this);
        add(studentCancel);

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(640,680);
        setVisible(true);
        setLocation(300,10);
    }

    public void adminEntery(){
        JLabel text = new JLabel("Wel-Come To BBSBE College");
        text.setFont(new Font("railway",Font.BOLD,24));
        text.setBackground(Color.BLACK);
        text.setForeground(Color.ORANGE);
        text.setBounds(135,0,450,100);
        add(text);

        JLabel text1 = new JLabel("Admin Registration Page");
        text1.setFont(new Font("railway",Font.BOLD,24));
        text1.setBackground(Color.BLACK);
        // text1.setForeground(Color.ORANGE);
        text1.setBounds(160,50,450,100);
        add(text1);

        JLabel adminId = new JLabel("Enter Admin Id");
        adminId.setFont(new Font("Railway",Font.BOLD,22));
        adminId.setBounds(20,180,200,30);
        adminId.setForeground(Color.CYAN);
        add(adminId);
        adminIdText = new JTextField();
        adminIdText.setFont(new Font("Railway",Font.BOLD,22));
        adminIdText.setBounds(280,180,300,30);
        add(adminIdText);

        JLabel adminName = new JLabel("Enter Admin Name");
        adminName.setFont(new Font("Railway",Font.BOLD,22));
        adminName.setBounds(20,230,200,30);
        adminName.setForeground(Color.CYAN);
        add(adminName);
        adminNameText = new JTextField();
        adminNameText.setFont(new Font("Railway",Font.BOLD,22));
        adminNameText.setBounds(280,230,300,30);
        add(adminNameText);

        JLabel adminEmail = new JLabel("Enter Admin Email");
        adminEmail.setFont(new Font("Railway",Font.BOLD,22));
        adminEmail.setBounds(20,280,200,30);
        adminEmail.setForeground(Color.CYAN);
        add(adminEmail);
        adminEmailText = new JTextField();
        adminEmailText.setFont(new Font("Railway",Font.BOLD,22));
        adminEmailText.setBounds(280,280,300,30);
        add(adminEmailText);

        JLabel adminPassword = new JLabel("Enter Admin PassWord");
        adminPassword.setFont(new Font("Railway",Font.BOLD,22));
        adminPassword.setBounds(20,330,250,30);
        adminPassword.setForeground(Color.CYAN);
        add(adminPassword);
        adminPasswordText = new JPasswordField();
        adminPasswordText.setFont(new Font("Railway",Font.BOLD,22));
        adminPasswordText.setBounds(280,330,300,30);
        add(adminPasswordText);

        JLabel adminPhoneNo = new JLabel("Enter Admin Phone");
        adminPhoneNo.setFont(new Font("Railway",Font.BOLD,22));
        adminPhoneNo.setBounds(20,380,230,30);
        adminPhoneNo.setForeground(Color.CYAN);
        add(adminPhoneNo);
        adminPhoneText = new JTextField();
        adminPhoneText.setFont(new Font("Railway",Font.BOLD,22));
        adminPhoneText.setBounds(280,380,300,30);
        add(adminPhoneText);

        JLabel adminBranch = new JLabel("Enter Admin Branch");
        adminBranch.setFont(new Font("Railway",Font.BOLD,22));
        adminBranch.setBounds(20,430,230,30);
        adminBranch.setForeground(Color.CYAN);
        add(adminBranch);
        adminBranchText = new JTextField();
        adminBranchText.setFont(new Font("Railway",Font.BOLD,22));
        adminBranchText.setBounds(280,430,300,30);
        add(adminBranchText);

        adminSubmit = new JButton(" Submit ");
        adminSubmit.setBounds(320,500,220,50);
        adminSubmit.setFont(new Font("Railway",Font.BOLD,26));
        adminSubmit.setBackground(Color.CYAN);
        adminSubmit.setForeground(Color.MAGENTA);
        adminSubmit.addActionListener(this);
        add(adminSubmit);

        adminCancel = new JButton(" Cancel ");
        adminCancel.setBounds(50,500,220,40);
        adminCancel.setFont(new Font("Railway",Font.BOLD,22));
        adminCancel.setBackground(Color.WHITE);
        adminCancel.addActionListener(this);
        add(adminCancel);

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(640,680);
        setVisible(true);
        setLocation(300,10);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == adminSubmit) {
            String id = adminIdText.getText();
            String name = adminNameText.getText();
            String email = adminEmailText.getText();
            String password = adminPasswordText.getText();
            String phone = adminPhoneText.getText();
            String branch = adminBranchText.getText();
            int cId;
            long cPhone;
            try {
                cId = Integer.parseInt(id);
                cPhone = Long.parseLong(phone);
                // System.out.println(cId);
                // System.out.println(cPhone);
                DataBase obj = new DataBase();
                if (obj.insertDataIntoAdmin(cId, name, email, password, cPhone, branch) == 1) {
                    JOptionPane.showMessageDialog(null, "Data Inserted SuccesFully");
                    setVisible(false);
                
                }
                else if(obj.insertDataIntoAdmin(cId, name, email, password, cPhone, branch) == 0){
                    JOptionPane.showMessageDialog(null, "Data Not Innsert\nSomthing Went Wrong");
                    adminIdText.setText("");
                    adminNameText.setText("");
                    adminEmailText.setText("");
                    adminPasswordText.setText("");
                    adminPhoneText.setText("");
                    adminBranchText.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Something Went Wrong");
                    adminIdText.setText("");
                    adminNameText.setText("");
                    adminEmailText.setText("");
                    adminPasswordText.setText("");
                    adminPhoneText.setText("");
                    adminBranchText.setText("");
                }
                setVisible(false);
                
                
            } catch (NumberFormatException exp) {
                System.out.println(exp);
                JOptionPane.showMessageDialog(null,"Enter Valid Id \nEnter Valid Phone Number");
                adminIdText.setText("");
                adminPhoneText.setText("");

            }
            setVisible(false);
        }
        else if(ae.getSource() == studentSubmit){
            String id = studentIdText.getText();
            String name = studentNameText.getText();
            String email = studentEmailText.getText();
            String password = studentPasswordText.getText();
            String phone = studentPhoneText.getText();
            int cId = 0;
            long cPhone = 0;
            try {
                cId = Integer.parseInt(id);
                cPhone = Long.parseLong(phone);
                System.out.println("---------------------------------------------------");
                System.out.println("id --> "+cId);
                System.out.println("Name --> "+name);
                System.out.println("Email -->"+email);
                System.out.println("Pass --> "+password);
                System.out.println("Phone --> "+cPhone);
                System.out.println("Admin Id --> "+adminId);
                System.out.println("Admin Branch --> "+adminBranch);
                if(new DataBase().insertDataIntoStudent(cId, name, email, password, cPhone, adminBranch, adminId) == 1){
                    JOptionPane.showMessageDialog(null, "Data Insert Succesfully\nStudent Added");
                    setVisible(false);
                }
                else if(new DataBase().insertDataIntoStudent(cId,name,email,password,cPhone,adminBranch,adminId) == 0){
                    JOptionPane.showMessageDialog(null, "Data Not insert\nSomething Went Wrong");
                    studentIdText.setText("");
                    studentNameText.setText("");
                    studentEmailText.setText("");
                    studentPasswordText.setText("");
                    studentPhoneText.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Something Went Wrong");
                    studentIdText.setText("");
                    studentNameText.setText("");
                    studentEmailText.setText("");
                    studentPasswordText.setText("");
                    studentPhoneText.setText("");
                }

                
            } catch (NumberFormatException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Enter Valid Id \nEnter Valid Phone Number");
                studentIdText.setText("");
                studentPhoneText.setText("");
            }
            

        }

        else if(ae.getSource() == adminCancel){
            adminIdText.setText("");
            adminNameText.setText("");
            adminEmailText.setText("");
            adminPasswordText.setText("");
            adminPhoneText.setText("");
            adminBranchText.setText("");
            setVisible(false);
            // new Home().mainHome();
        }
        else if(ae.getSource() == studentCancel ){
            studentIdText.setText("");
            studentNameText.setText("");
            studentEmailText.setText("");
            studentPasswordText.setText("");
            studentPhoneText.setText("");
        }
        
    }
    // public static void main(String[] args) {
    //     Entery obj = new Entery();
    //     obj.studentEntery(1234,"CSE");
    //     // obj.adminEntery();
    // }

    
}