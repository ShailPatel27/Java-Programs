package Lab;
import java.sql.*;

public class pr11 
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");

            if(!conn.isClosed())
            {
                System.out.println("Connection Successful");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}