import java.sql.*;
import java.util.Scanner;

public class j5
{
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/dbsocet";

    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args){

        Connection conn = null;

        Scanner sc = new Scanner(System.in);
        int id;
        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Inserting records into table...");

            PreparedStatement pst=conn.prepareStatement("delete from studinfo where id=?");

            System.out.print("Enter id to delete: ");
            id = sc.nextInt();

            pst.setInt(1, id);
            pst.executeUpdate();

            System.out.println("Records deleted successfully...");
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
