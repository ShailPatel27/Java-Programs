package Practice;
import java.sql.*;

public class j12 {
public static void main(String[] args) {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/dbdemo", "root", "");

        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("select * from student");

        while(rs.next())
        {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
        
    } catch (Exception e) {
        // TODO: handle exception
    }
}    
}
