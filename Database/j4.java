import java.sql.*;
import java.util.Scanner;

public class j4
{
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/dbsocet";

    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Connection conn = null;

        int id;
        String name;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Inserting records into table...");

            PreparedStatement pst=conn.prepareStatement("insert into studinfo values(?,?)");

            System.out.print("Enter id: ");
            id = sc.nextInt();

            System.out.print("Enter name: ");
            name = sc.next();

            pst.setInt(1, id);
            pst.setString(2, name);
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
