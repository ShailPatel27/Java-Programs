package Practice;
import java.sql.*;

public class j13 {
public static void main(String[] args) {
    try {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/dbdemo", "root", "");

        PreparedStatement pst = conn.prepareStatement("insert into student values(3, 'om')");
        pst.execute();
        System.out.println("Insert Successfull");

        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("select * from student");

        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }

        PreparedStatement pst1 = conn.prepareStatement("update student set name = 'mohit' where name = 'om'");
        pst1.execute();
        System.out.println("Update successfull");

        PreparedStatement pst2 = conn.prepareStatement("delete from student where name = 'raj'");
        pst2.execute();
        System.out.println("Delete successfull");

    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }
}    
}
