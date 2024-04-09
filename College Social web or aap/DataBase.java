
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class DataBase {
   public int updateadminister(String pass){
      try {
         Connection connection = getConnection();
         Statement statement = connection.createStatement();
         String insertQuery = "update administerlogin set password = '"+pass+"'";
         return statement.executeUpdate(insertQuery);
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      return 0;

   }

   public ResultSet getAdministerData(String email){
      Connection connection = getConnection();
      Statement statement;
      try {
         statement = connection.createStatement();
         String getDataQuery = "select * from administerlogin where email = '"+email+"'";
         return statement.executeQuery(getDataQuery);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return null;
   }

   public int insertIntoStudentLog(int rollNo,long mobileNo,String password){
      try {
         Connection connection = getConnection();
         Statement statement = connection.createStatement();
         String insertQuery = "insert into student_login values('"+rollNo+"','"+mobileNo+"','"+password+"','"+null+"')";
         return statement.executeUpdate(insertQuery);
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      return 0;
   }

   public int insertIntoStudentLog(int rollNo,String studentEmail,String password){
      try {
         Connection connection = getConnection();
         Statement statement = connection.createStatement();
         String insertQuery = "insert into student_login values('"+rollNo+"','"+0+"','"+password+"','"+studentEmail+"')";
         return statement.executeUpdate(insertQuery);
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      return 0;
   }

   public ResultSet getStudentLogData(int rollNo){
      try {
         Connection connection = getConnection();
         Statement statement = connection.createStatement();
         String getStudentDataQuery = "select * from student_login Where rollno = '"+rollNo+"'";
         return statement.executeQuery(getStudentDataQuery);
      } catch (Exception e) {
         e.printStackTrace();
      }

      return null;
   }

   public ResultSet getStudentData(int studentId){
      try {
         Connection connection = getConnection();
         Statement statement = connection.createStatement();
         String getStudentDataQuery = "select * from student_table Where rollno = '"+studentId+"'";
         return statement.executeQuery(getStudentDataQuery);
      } catch (Exception e) {
         e.printStackTrace();
      }
      return null;
   }

   public ResultSet getAdminData(String adminEmail,String adminPassword ){
      try {
         Connection connection = getConnection();
         Statement statement = connection.createStatement();
         String getDataQuery = "select * from student_admin where email = '"+adminEmail+"'";
         return statement.executeQuery(getDataQuery);
         
      } catch (SQLException e) {
         e.printStackTrace();
      }

      return null;

   }

   public int insertDataIntoStudent(int studentId,String studentName,String studentEmail,String studentPassword,long studentPhone,String studentBranch, int adminId){
      try {
         Connection connection = getConnection();
         Statement statement = connection.createStatement();
         String query = "insert into student_table values ('"+ studentId +"' , '"+ studentName +"' ,'" + studentEmail +"','"+ studentBranch +"','"+studentPhone+"','"+ adminId +"')";
         return statement.executeUpdate(query);

      } catch (Exception e) {
         System.out.println(e);
      }
      return 0;

   }


   public int insertDataIntoAdmin(int id, String name, String email,String password, long phone,String branch){
      try {
         Connection connection = getConnection();
         Statement statement = connection.createStatement();
         String query = "insert into student_admin values ('"+ id +"' , '"+ name +"' ,'" + email+"','"+password+"','"+phone+"','"+ branch+"')";
         return statement.executeUpdate(query);

      } catch (Exception e) {
         System.out.println(e);
      }
      return 0;
   }
   public int updateAdminData(String email,String pass){
      try {
         Connection connection = getConnection();
         Statement statement = connection.createStatement();
         String insertQuery = "update student_admin set password = '"+pass+"' where email = '"+email+"'";
         return statement.executeUpdate(insertQuery);
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      return 0;
   }
    
   public static Connection getConnection() {
      try{
         Driver driver = new Driver();
         DriverManager.registerDriver(driver);
         String url = "jdbc:mysql:///college_social_network";
         String user = "root";
         String password = "merimaa";

         return DriverManager.getConnection(url,user,password);
         }catch(Exception e){
            System.out.println(e);
         }
      return null;
   }
}
