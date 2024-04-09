import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame implements ActionListener {
    JButton pic, adminLogin, adMinisterLogin, studentLogin, studentEntery;
    int adminId = 0;
    String adminBranch = null;

    public void adminHome(int id ,String adminName ,String branch){
        adminId = id;
        adminBranch = branch;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/clg.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1400,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0,0,1400,800);
        add(label);

        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.png"));
        Image icon2 = icon1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon icon3 = new ImageIcon(icon2);
        JLabel label1 = new JLabel(icon3);
        label1.setBounds(0,20,260,260);
        label.add(label1);
        JLabel text1 = new JLabel(" Welcome to our college! We're thrilled to have you join our community.");
        text1.setBounds(270,30,830,50);
        text1.setFont(new Font("railway",Font.BOLD,24));
        text1.setBackground(Color.WHITE);
        text1.setForeground(Color.BLUE);
        text1.setOpaque(true);
        label.add(text1);

        JLabel adminNameLabel = new JLabel();
        adminNameLabel.setFont(new Font("railway",Font.BOLD,24));
        adminNameLabel.setBackground(Color.BLUE);
        adminNameLabel.setForeground(Color.WHITE);
        adminNameLabel.setOpaque(true);
        label.add(adminNameLabel);
        adminNameLabel.setText("Welcome Back "+adminName);
        Dimension size = adminNameLabel.getPreferredSize();
        adminNameLabel.setBounds(270,100,size.width,50);

        JLabel adminId = new JLabel();
        adminId.setBounds(850,100,200,50);
        adminId.setFont(new Font("railway",Font.BOLD,24));
        adminId.setBackground(Color.BLUE);
        adminId.setForeground(Color.WHITE);
        adminId.setOpaque(true);
        label.add(adminId);
        adminId.setText("Admin Id "+id);

        JLabel text = new JLabel("Profile pic");
        text.setBounds(1170,30,120,30);
        text.setFont(new Font("railway",Font.LAYOUT_NO_LIMIT_CONTEXT,24));
        text.setBackground(Color.YELLOW);
        text.setForeground(Color.RED);
        text.setOpaque(true);
        label.add(text);

        pic = new JButton("Upload Your pic");
        pic.setFont(new Font("Railway",Font.BOLD,13));
        pic.setBounds(1140,80,200,250);
        pic.setBackground(Color.BLUE);
        pic.setOpaque(true);
        label.add(pic);

        adminLogin = new JButton("Faculty Log-in");
        adminLogin.setFont(new Font("Railway",Font.BOLD,18));
        adminLogin.setBounds(280,160,180,40);
        adminLogin.setBackground(Color.WHITE);
        adminLogin.setForeground(Color.BLUE);
        adminLogin.addActionListener(this);
        // adminLogin.addMouseListener((MouseListener) this);
        label.add(adminLogin);

        studentEntery = new JButton("Student Entery");
        studentEntery.setFont(new Font("Railway",Font.BOLD,18));
        studentEntery.setBounds(470,160,180,40);
        studentEntery.setBackground(Color.WHITE);
        studentEntery.setForeground(Color.BLUE);
        studentEntery.addActionListener(this);
        label.add(studentEntery);


        JButton forget = new JButton("Forget Password");
        forget.setFont(new Font("RailWay",Font.BOLD,20));
        forget.setBounds(660, 160, 200, 35);
        forget.addActionListener(this);
        label.add(forget);

        ImageIcon add = new ImageIcon(ClassLoader.getSystemResource("icon/Add_Icon.jpeg"));
        Image addImage = add.getImage().getScaledInstance(241,284,Image.SCALE_DEFAULT);
        ImageIcon imageIcone = new ImageIcon(addImage);
        JLabel label3 = new JLabel(imageIcone);
        label3.setBounds(170,180,380,360);
        label.add(label3);

        ImageIcon delete = new ImageIcon(ClassLoader.getSystemResource("icon/Delete_Icon.jpg"));
        Image deleteImage = delete.getImage().getScaledInstance(241,284,Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(deleteImage);
        JLabel label2 = new JLabel(i4);
        label2.setBounds(450,180,380,360);
        label.add(label2);

        ImageIcon add2 = new ImageIcon(ClassLoader.getSystemResource("icon/Edit_Icon.jpeg"));
        Image add2Image = add2.getImage().getScaledInstance(241,284,Image.SCALE_DEFAULT);
        ImageIcon add2ImageIcon = new ImageIcon(add2Image);
        JLabel label4 = new JLabel(add2ImageIcon);
        label4.setBounds(730,180,380,360);
        label.add(label4);

        JButton clickForAdd = new JButton("Click To Add Student");
        clickForAdd.setBounds(80,275,205,30);
        clickForAdd.setFont(new Font("New Times Roman",Font.ITALIC,18));
        clickForAdd.addActionListener(this);
        label3.add(clickForAdd);

        JButton clickForDelete = new JButton("Click To Delete Student");
        clickForDelete.setBounds(80,275,226,30);
        clickForDelete.setFont(new Font("New Times Roman",Font.ITALIC,18));
        clickForDelete.addActionListener(this);
        label2.add(clickForDelete);

        JButton clickForUpdate = new JButton("Click To Update Details");
        clickForUpdate.setBounds(80,275,226,30);
        clickForUpdate.setFont(new Font("New Times Roman",Font.ITALIC,18));
        clickForUpdate.addActionListener(this);
        label4.add(clickForUpdate);


        

        setLayout(null);
        getContentPane().setVisible(true);
        setSize(1375,800);
        setVisible(true);

    }

    public void mainHome(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/clg.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1400,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0,0,1400,800);
        add(label);

        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.png"));
        Image icon2 = icon1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon icon3 = new ImageIcon(icon2);
        JLabel label1 = new JLabel(icon3);
        label1.setBounds(0,20,260,260);
        label.add(label1);
        JLabel text1 = new JLabel(" Welcome to our college! We're thrilled to have you join our community.");
        text1.setBounds(270,30,830,50);
        text1.setFont(new Font("railway",Font.BOLD,24));
        text1.setBackground(Color.WHITE);
        text1.setForeground(Color.BLUE);
        text1.setOpaque(true);
        label.add(text1);

        pic = new JButton("Upload Your pic");
        pic.setFont(new Font("Railway", Font.BOLD, 13));
        pic.setBounds(1140, 80, 200, 250);
        pic.setBackground(Color.BLUE);
        pic.setOpaque(true);
        pic.addActionListener(this);
        label.add(pic);

        JButton friend = new JButton("Friend");
        friend.setBounds(400,100,120,50);
        friend.setFont(new Font("railway",Font.BOLD,24));
        friend.setBackground(Color.BLUE);
        friend.setForeground(Color.WHITE);
        friend.setOpaque(true);
        label.add(friend);

        JButton setting = new JButton("Setting");
        setting.setBounds(540,100,130,50);
        setting.setFont(new Font("railway",Font.BOLD,24));
        setting.setBackground(Color.BLUE);
        setting.setForeground(Color.WHITE);
        setting.setOpaque(true);
        label.add(setting);

        JButton group = new JButton("Your Group");
        group.setBounds(700,100,180,50);
        group.setFont(new Font("railway",Font.BOLD,24));
        group.setBackground(Color.BLUE);
        group.setForeground(Color.WHITE);
        group.setOpaque(true);
        label.add(group);

        JButton event = new JButton("Events");
        event.setBounds(900,100,130,50);
        event.setFont(new Font("railway",Font.BOLD,24));
        event.setBackground(Color.BLUE);
        event.setForeground(Color.WHITE);
        event.setOpaque(true);
        label.add(event);
        JLabel text = new JLabel("Profile pic");
        text.setBounds(1170,30,120,30);
        text.setFont(new Font("railway",Font.LAYOUT_NO_LIMIT_CONTEXT,24));
        text.setBackground(Color.YELLOW);
        text.setForeground(Color.RED);
        text.setOpaque(true);
        label.add(text);

        pic = new JButton("Upload Your pic");
        pic.setFont(new Font("Railway",Font.BOLD,13));
        pic.setBounds(1140,80,200,250);
        pic.setBackground(Color.BLUE);
        pic.setOpaque(true);
        label.add(pic);

        adMinisterLogin = new JButton("Admin Login");
        adMinisterLogin.setFont(new Font("Railway",Font.BOLD,18));
        adMinisterLogin.setBounds(10,300,200,40);
        adMinisterLogin.setBackground(Color.BLUE);
        adMinisterLogin.setOpaque(true);
        adMinisterLogin.addActionListener(this);
        label.add(adMinisterLogin);

        adminLogin = new JButton("Faculty Login");
        adminLogin.setFont(new Font("Railway",Font.BOLD,18));
        Dimension size = adminLogin.getPreferredSize();
        adminLogin.setBounds(30,360,size.width,40);
        adminLogin.setBackground(Color.BLUE);
        adminLogin.addActionListener(this);
        label.add(adminLogin);

        studentLogin = new JButton("Student Login");
        studentLogin.setFont(new Font("Railway",Font.BOLD,18));
        studentLogin.setBounds(10,420,200,40);
        studentLogin.setBackground(Color.BLUE);
        studentLogin.setOpaque(true);
        studentLogin.addActionListener(this);
        label.add(studentLogin);

        

        setLayout(null);
        getContentPane().setVisible(true);
        setSize(1375,800);
        setVisible(true);
    }

    int studentRollNo = 0;

    public void studentHome(int rollNo,String name,String email,String branch,long phoneNo,int adminId){
        studentRollNo = rollNo;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/clg.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1400,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0,0,1400,800);
        add(label);

        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.png"));
        Image icon2 = icon1.getImage().getScaledInstance(190,190,Image.SCALE_DEFAULT);
        ImageIcon icon3 = new ImageIcon(icon2);
        JLabel label1 = new JLabel(icon3);
        label1.setBounds(0,20,200,200);
        label.add(label1);
        JLabel text1 = new JLabel(" Welcome to our college! We're thrilled to have you join our community.");
        text1.setBounds(270,30,830,50);
        text1.setFont(new Font("railway",Font.BOLD,24));
        text1.setBackground(Color.WHITE);
        text1.setForeground(Color.BLUE);
        text1.setOpaque(true);
        label.add(text1);

        pic = new JButton("Upload Your pic");
        pic.setFont(new Font("Railway", Font.BOLD, 13));
        pic.setBounds(1140, 80, 200, 250);
        pic.setBackground(Color.BLUE);
        pic.setOpaque(true);
        pic.addActionListener(this);
        label.add(pic);

        JButton friend = new JButton("Friends");
        friend.setBounds(270,100,130,40);
        friend.setFont(new Font("railway",Font.BOLD,24));
        friend.setBackground(Color.BLUE);
        friend.setForeground(Color.WHITE);
        friend.setOpaque(true);
        label.add(friend);

        JButton setting = new JButton("Profile Setting");
        setting.setBounds(420,100,210,40);
        setting.setFont(new Font("railway",Font.BOLD,24));
        setting.setBackground(Color.BLUE);
        setting.setForeground(Color.WHITE);
        setting.setOpaque(true);
        label.add(setting);

        JButton group = new JButton("Your Group");
        group.setBounds(640,100,180,40);
        group.setFont(new Font("railway",Font.BOLD,24));
        group.setBackground(Color.BLUE);
        group.setForeground(Color.WHITE);
        group.setOpaque(true);
        label.add(group);

        JButton event = new JButton("Events");
        event.setBounds(830,100,130,40);
        event.setFont(new Font("railway",Font.BOLD,24));
        event.setBackground(Color.BLUE);
        event.setForeground(Color.WHITE);
        event.setOpaque(true);
        label.add(event);


        JLabel studenRollNo = new JLabel();
        studenRollNo.setText("Roll No " +rollNo);
        studenRollNo.setFont(new Font("railway",Font.CENTER_BASELINE,22));
        studenRollNo.setForeground(Color.BLACK);
        studenRollNo.setBackground(Color.WHITE);
        // studenRollNo.setOpaque(true);
        Dimension size = studenRollNo.getPreferredSize();
        studenRollNo.setBounds(200, 180, size.width, size.height);
        label.add(studenRollNo);

        JLabel studenName = new JLabel();
        studenName.setText("" +name);
        studenName.setFont(new Font("railway",Font.CENTER_BASELINE,22));
        studenName.setForeground(Color.BLACK);
        studenName.setBackground(Color.WHITE);
        // studenName.setOpaque(true);
        Dimension size1 = studenName.getPreferredSize();
        studenName.setBounds(200, 220, size1.width, size1.height);
        label.add(studenName);

        JLabel studenEmail = new JLabel();
        studenEmail.setText("" +email);
        studenEmail.setFont(new Font("railway",Font.CENTER_BASELINE,22));
        studenEmail.setForeground(Color.BLACK);
        studenEmail.setBackground(Color.WHITE);
        // studenEmail.setOpaque(true);
        Dimension size2 = studenEmail.getPreferredSize();
        studenEmail.setBounds(200, 260, size2.width, size2.height);
        label.add(studenEmail);

        JLabel studenBranch = new JLabel();
        studenBranch.setText("Your Branch " +branch);
        studenBranch.setFont(new Font("railway",Font.CENTER_BASELINE,22));
        studenBranch.setForeground(Color.BLACK);
        // studenBranch.setBackground(Color.WHITE);
        // studenBranch.setOpaque(true);
        Dimension size3 = studenBranch.getPreferredSize();
        studenBranch.setBounds(200, 300, size3.width, size3.height);
        label.add(studenBranch);

        JLabel studenNumber = new JLabel();
        studenNumber.setText("Your No " +phoneNo);
        studenNumber.setFont(new Font("railway",Font.CENTER_BASELINE,22));
        studenNumber.setForeground(Color.BLACK);
        Dimension size4 = studenNumber.getPreferredSize();
        studenNumber.setBounds(200, 340, size4.width, size4.height);
        label.add(studenNumber);

        setLayout(null);
        getContentPane().setVisible(true);
        setSize(1375,800);
        setVisible(true);

    }



   
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == pic) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                // uploadImageToDatabase(selectedFile);
                System.out.println(selectedFile);
            }
        }
        if(ae.getSource() == adminLogin){
            // setVisible(false);
            new Login().facultyLogin();
        }
        if(ae.getSource()== studentLogin){
            setVisible(false);
            new Login().studentLogin();
        }
        if(ae.getSource() == adMinisterLogin){
            // setVisible(false);
            new Login().administerLogin();
        }
        if(ae.getSource() == studentEntery){

            new Entery().studentEntery(adminId,adminBranch);
        }
    }
    // public static void main(String[] args) {
    //     Home obj = new Home();
    //     // obj.adminHome(1234,"Dipendra Kumar","CSE");
    //     obj.studentHome(1211,"Dipendra Kumar","kumardipendra@gmail.com","CSE",8271890987l,1234);
    //     // obj.mainHome();
    // }
}
