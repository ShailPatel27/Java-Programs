package Practice;
import java.sql.*;

public class j10 {
    public static void main(String[] args)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql:localhost/project");

            if(!conn.isClosed())
            {
                System.out.println("Connection Successfull");
            }
            else
            {
                System.out.println("error");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }    
}
