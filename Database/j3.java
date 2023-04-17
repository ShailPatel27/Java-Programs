import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class j3
{
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/dbsocet";

    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args){

        Connection conn = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Inserting records into table...");

            PreparedStatement pst=conn.prepareStatement("insert into studinfo values(?,?)");

            pst.setInt(1, 101);
            pst.setString(2,"Shubham");
            pst.executeUpdate();
            pst.setInt(1, 102);
            pst.setString(2,"Harnil");
            pst.executeUpdate();

            System.out.println("Records inserted successfully...");
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        finally{
            try{
                if(conn!=null)
                conn.close();
            }
            catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!!");
    }
}
