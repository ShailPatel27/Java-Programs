package Practice;
import java.sql.*;

public class j11 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/dbdemo", "root", "");
            System.out.println("conenction successful");
            Statement s = conn.createStatement();

            PreparedStatement pst = conn.prepareStatement("insert into student values(1, 'Shail')");
            pst.executeUpdate();

            System.out.println("row inserted");

            String sql = "insert into student values(2, 'raj')";
            s.execute(sql);

            System.out.println("row inserted");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
