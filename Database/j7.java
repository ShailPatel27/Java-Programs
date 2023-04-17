import java.sql.*;
import java.util.Scanner;

public class j7
{
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/dbsocet";

    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args){

        Connection conn = null;
        Statement stmt = null;

        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        try{

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            
            conn=DriverManager.getConnection(DB_URL, USER, PASS);

            PreparedStatement pst=conn.prepareStatement("UPDATE `studinfo` SET `name` = ? WHERE `studinfo`.`id` = ?");

            System.out.print("Enter id to update from: ");
            id = sc.nextInt();

            System.out.print("Enter name to update: ");
            name = sc.next();

            pst.setString(1, name);
            pst.setInt(2, id);
            pst.execute();

            System.out.println("Records updated successfully...");
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
