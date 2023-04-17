import java.sql.*;

public class j6
{
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/dbsocet";

    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args){

        Connection conn = null;
        Statement stmt = null;
        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            
            conn=DriverManager.getConnection(DB_URL, USER, PASS);

            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery("select * from studinfo");

            while(rs.next())
            {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            System.out.println("Records displayed successfully...");
        }
        catch(SQLException se)
        {
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
