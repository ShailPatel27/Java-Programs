package Lab;
import java.sql.*;

public class pr11 
{
    public static void main(String[] args)
    {
        Connection conn = null;

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to Database");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsocet", "root", "");

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