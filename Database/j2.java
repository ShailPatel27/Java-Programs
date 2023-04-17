import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class j2
{

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL ="jdbc:mysql://localhost/javasql";

    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args){

        Connection conn = null;
        Statement stmt = null;

        try{
            Class.forName("com.sql.jdbc.Driver");

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating table...");
            stmt = conn.createStatement();

            String sql = "CREATE TABLE STUDINFO(rollno int,name varchar(50));";

            stmt.executeUpdate(sql);
            System.out.println("Table created successfully...");
        }
        catch(SQLException se){
            System.out.println("Erroor");
        }
        catch(Exception e){
            System.out.println("Erroor");
        }
        finally{
            try{
                if(stmt!=null)
                stmt.close();
            }
            catch(SQLException se2){

            }
            try{
                if(conn!=null)
                conn.close();
            }
            catch(SQLException se){
                System.out.println("Erroor" + se.toString());
            }
        }
        System.out.println("Goodbye!!");
    }
}
