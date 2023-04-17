import java.sql.*;

public class Prac_3_3
{
	public static void main(String args[])
		{
		try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			 	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:/practical", "root", "");
			  	System.out.println("Connection successfull");
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery("select DeptId,COUNT(*) from emp group by DeptId");
				while(res.next())
				{
					int DeptId=res.getInt(1);
					int count=res.getInt("COUNT(*)");
					System.out.println(" DeptId : "+DeptId+" count : "+count);
				}
				con.close();
		}
		catch(Exception e)
			{
				System.out.println(e);
			}
		}
}