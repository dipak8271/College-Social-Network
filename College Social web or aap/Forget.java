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

public class Forget extends JFrame implements ActionListener{

    private String administerEmail = "kumardipendra8271900@gmail.com";

    JTextField administerEmailText, administerPasswordText, conformpassword;
    JButton submit, clear, adminsubmit, adminclear;
    public void administerForgetpass(){
        setTitle("Wel-Come To BBSBE College");
        setLayout(null);

        JLabel text = new JLabel("Wel-Come To BBSBE College");
        text.setFont(new Font("railway",Font.BOLD,24));
        text.setBackground(Color.BLACK);
        text.setForeground(Color.ORANGE);
        text.setBounds(20,0,450,100);
        add(text);

        JLabel mobileNo = new JLabel("Enter Administer Email Id");
        mobileNo.setBounds(35,100,350,30);
        mobileNo.setFont(new Font("calibri",Font.BOLD,28));
        add(mobileNo);
        administerEmailText = new JTextField();
        administerEmailText.setBounds(10,125,360,30);
        add(administerEmailText);

        JLabel passwordField = new JLabel("Enter New Password");
        passwordField.setBounds(55,180,300,30);
        passwordField.setFont(new Font("calibri",Font.BOLD,28));
        add(passwordField);
        administerPasswordText = new JPasswordField();
        administerPasswordText.setBounds(10,205,360,30);
        add(administerPasswordText);

        JLabel conformpasswordField = new JLabel("Enter New Conform Password");
        conformpasswordField.setBounds(15,270,350,30);
        conformpasswordField.setFont(new Font("calibri",Font.BOLD,28));
        add(conformpasswordField);
        conformpassword = new JPasswordField();
        conformpassword.setBounds(10,295,360,30);
        add(conformpassword);

        submit = new JButton("Submit");
        submit.setBounds(35,350,150,38);
        submit.setFont(new Font("railway",Font.BOLD,20));
        submit.addActionListener(this);
        add(submit);

        clear = new JButton("Clear");
        clear.setBounds(200,350,150,38);
        clear.setFont(new Font("railway",Font.BOLD,20));
        clear.addActionListener(this);
        add(clear);

        getContentPane().setBackground(Color.WHITE);
        setSize(400,500);
        setVisible(true);
        setLocation(300,5);
    }

    public void adminForgetpass(){
        setTitle("Wel-Come To BBSBE College");
        setLayout(null);

        JLabel text = new JLabel("Wel-Come To BBSBE College");
        text.setFont(new Font("railway",Font.BOLD,24));
        text.setBackground(Color.BLACK);
        text.setForeground(Color.ORANGE);
        text.setBounds(20,0,450,100);
        add(text);

        JLabel mobileNo = new JLabel("Enter Administer Email Id");
        mobileNo.setBounds(35,100,350,30);
        mobileNo.setFont(new Font("calibri",Font.BOLD,28));
        add(mobileNo);
        administerEmailText = new JTextField();
        administerEmailText.setBounds(10,125,360,30);
        add(administerEmailText);

        JLabel passwordField = new JLabel("Enter New Password");
        passwordField.setBounds(55,180,300,30);
        passwordField.setFont(new Font("calibri",Font.BOLD,28));
        add(passwordField);
        administerPasswordText = new JPasswordField();
        administerPasswordText.setBounds(10,205,360,30);
        add(administerPasswordText);

        JLabel conformpasswordField = new JLabel("Enter New Conform Password");
        conformpasswordField.setBounds(15,270,350,30);
        conformpasswordField.setFont(new Font("calibri",Font.BOLD,28));
        add(conformpasswordField);
        conformpassword = new JPasswordField();
        conformpassword.setBounds(10,295,360,30);
        add(conformpassword);

        adminsubmit = new JButton("Submit");
        adminsubmit.setBounds(35,350,150,38);
        adminsubmit.setFont(new Font("railway",Font.BOLD,20));
        adminsubmit.addActionListener(this);
        add(adminsubmit);

        adminclear = new JButton("Clear");
        adminclear.setBounds(200,350,150,38);
        adminclear.setFont(new Font("railway",Font.BOLD,20));
        adminclear.addActionListener(this);
        add(adminclear);

        getContentPane().setBackground(Color.WHITE);
        setSize(400,500);
        setVisible(true);
        setLocation(300,5);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == submit){
            String email = administerEmailText.getText();
            String pass = administerPasswordText.getText();
            String cpass = conformpassword.getText();
            if(pass.equals(cpass)){
                if(email.equals(administerEmail)){
                    new Login().administerpassForget(email, cpass);
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Email Address Wrong Contact To Devloper");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Do Not Match Password");
                administerPasswordText.setText("");
                conformpassword.setText("");
            }
        }
        if(ae.getSource() == clear){
            administerEmailText.setText("");
            administerPasswordText.setText("");
            conformpassword.setText("");
        }
        if(ae.getSource() == adminsubmit){
            String email = administerEmailText.getText();
            String pass = administerPasswordText.getText();
            String cpass = conformpassword.getText();
            if(pass.equals(cpass)){
                int a = new DataBase().updateAdminData(email, cpass);
                if(a == 1){
                    JOptionPane.showMessageDialog(null,"Faculty Password Successfully Changed");
                    setVisible(false);
                }
            }
        }

    }
    public static void main(String[] args) {
        // Forget obj = new Forget();
        // obj.administerForgetpass();
        
    } 
}
