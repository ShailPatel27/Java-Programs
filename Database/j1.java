import java.sql.*;

public class j1
{   
    public static void main(String[] args)
    {    
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to database...");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsocet", "root", "");

            System.out.println("Creating table...");
            Statement stmt = conn.createStatement();
            String sql = "CREATE TABLE `javasql`.`student` ( `sid` INT(2) NOT NULL , `sname` VARCHAR(20) NOT NULL ) ENGINE = InnoDB;";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(stmt != null) 
                {
                    stmt.close();
                }
            }
            catch (SQLException se2){}

            try
            {
                if(conn != null)
                {
                    conn.close();
                }
            }
            catch(SQLException se)
            {
                se.printStackTrace();
            }
        }

        System.out.println("Goodbye");
    }
}
