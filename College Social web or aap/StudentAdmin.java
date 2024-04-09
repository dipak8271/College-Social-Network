import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class StudentAdmin extends JFrame implements ActionListener{
    private int id;
    private String name;
    private String emailId;
    private String password;
    private long phoneNo;

    public StudentAdmin(){

    }
    public StudentAdmin(int id,String name, String emailId, String password,long phoneNo){
        super();
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.password = password;
        this.phoneNo = phoneNo;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.emailId;
    }
    public String getPassword(){
        return this.password;
    }
    public long getPhone(){
        return this.phoneNo;
    }

    public void adminPage(){
        
        ImageIcon backGroundIcon = new ImageIcon(ClassLoader.getSystemResource("icon/NESCAFE.jpg"));
        Image addBackGroundImage = backGroundIcon.getImage().getScaledInstance(1360, 750,Image.SCALE_DEFAULT);
        ImageIcon backIcon = new ImageIcon(addBackGroundImage);
        JLabel label = new JLabel(backIcon);
        label.setBounds(0,0,1360,750);
        add(label);

        JLabel text = new JLabel("Welcome Back Admin");
        text.setBounds(192, 300, 230, 50);
        text.setFont(new Font("railway",Font.BOLD,22));
        text.setForeground(Color.RED);
        text.setBackground(Color.CYAN);
        text.setOpaque(true);
        label.add(text);

        JLabel text1 = new JLabel("ADMIN LOG-IN PAGE");
        text1.setBounds(192, 355, 230, 50);
        text1.setFont(new Font("railway",Font.BOLD,22));
        text1.setForeground(Color.RED);
        text1.setBackground(Color.CYAN);
        text1.setOpaque(true);
        label.add(text1);

        ImageIcon add = new ImageIcon(ClassLoader.getSystemResource("icon/Add_Icon.jpeg"));
        Image addImage = add.getImage().getScaledInstance(341,384,Image.SCALE_DEFAULT);
        ImageIcon imageIcone = new ImageIcon(addImage);
        JLabel label1 = new JLabel(imageIcone);
        label1.setBounds(685,0,341,384);
        label.add(label1);

        ImageIcon delete = new ImageIcon(ClassLoader.getSystemResource("icon/Delete_Icon.jpg"));
        Image deleteImage = delete.getImage().getScaledInstance(341,384,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(deleteImage);
        JLabel label2 = new JLabel(i3);
        label2.setBounds(1024,0,341,384);
        label.add(label2);

        ImageIcon edit = new ImageIcon(ClassLoader.getSystemResource("icon/Add_Icon.jpeg"));
        Image editImage = edit.getImage().getScaledInstance(341,384,Image.SCALE_DEFAULT);
        ImageIcon editImageIcone = new ImageIcon(editImage);
        JLabel label3 = new JLabel(editImageIcone);
        // label3.setBackground(Color.WHITE);
        label3.setBounds(685,385,341,384);
        label.add(label3);

        ImageIcon add2 = new ImageIcon(ClassLoader.getSystemResource("icon/Edit_Icon.jpeg"));
        Image add2Image = add2.getImage().getScaledInstance(341,384,Image.SCALE_DEFAULT);
        ImageIcon add2ImageIcon = new ImageIcon(add2Image);
        JLabel label4 = new JLabel(add2ImageIcon);
        label4.setBounds(1024,385,341,384);
        label.add(label4);

        JButton clickForAdd = new JButton("Click To Add Student");
        clickForAdd.setBounds(80,275,205,30);
        clickForAdd.setFont(new Font("New Times Roman",Font.ITALIC,18));
        clickForAdd.addActionListener(this);
        label1.add(clickForAdd);

        JButton clickForDelete = new JButton("Click To Delete Student");
        clickForDelete.setBounds(80,275,226,30);
        clickForDelete.setFont(new Font("New Times Roman",Font.ITALIC,18));
        clickForDelete.addActionListener(this);
        label2.add(clickForDelete);

        JButton clickForUpdate = new JButton("Click To Update Details");
        clickForUpdate.setBounds(80,275,226,30);
        clickForUpdate.setFont(new Font("New Times Roman",Font.ITALIC,18));
        clickForUpdate.addActionListener(this);
        label3.add(clickForUpdate);

        JButton clickForEdit = new JButton("Click To Edit Student");
        clickForEdit.setBounds(80,275,205,30);
        clickForEdit.setFont(new Font("New Times Roman",Font.ITALIC,18));
        clickForEdit.addActionListener(this);
        label4.add(clickForEdit);

        JLabel userJLabel = new JLabel("Enter Admin User-Id / Email");
        userJLabel.setBounds(10,425,230,30);
        userJLabel.setFont(new Font("New Times Roman",Font.ITALIC,18));
        userJLabel.setBackground(Color.WHITE);
        userJLabel.setForeground(Color.BLACK);
        userJLabel.setOpaque(true);
        label.add(userJLabel);

        JTextField userIdTextField = new JTextField();
        userIdTextField.setBounds(10,455,673,30);
        label.add(userIdTextField);

        JLabel passwordJLabel = new JLabel("Enter Admin Password");
        passwordJLabel.setBounds(10,525,190,30);
        passwordJLabel.setFont(new Font("New Times Roman",Font.ITALIC,18));
        passwordJLabel.setBackground(Color.WHITE);
        passwordJLabel.setForeground(Color.BLACK);
        passwordJLabel.setOpaque(true);
        label.add(passwordJLabel);

        JPasswordField passwordTextField = new JPasswordField();
        passwordTextField.setBounds(10,555,673,30);
        label.add(passwordTextField);

        JButton logIn = new JButton("Log-In / Sing-Up");
        logIn.setFont(new Font("RailWay",Font.BOLD,20));
        logIn.setBounds(192, 600, 200, 35);
        logIn.addActionListener(this);
        label.add(logIn);

        JButton forget = new JButton("Forget Password");
        forget.setFont(new Font("RailWay",Font.BOLD,20));
        forget.setBounds(192, 650, 200, 35);
        forget.addActionListener(this);
        label.add(forget);

        setLayout(null);
        getContentPane().setVisible(true);
        setSize(1366,750);
        setBackground(Color.BLUE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        
    }


    public static void main(String[] args) {
        StudentAdmin obj = new StudentAdmin();
        obj.adminPage();
    }

}
