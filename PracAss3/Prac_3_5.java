import java.sql.*;

public class Prac_3_5
{
	public static void main(String args[])
		{
		try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			 	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:/practical", "root", "");
			  	System.out.println("Connection successfull");
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery("select * from emp group by sal order by sal desc limit 1,1");
				while(res.next())
				{
					int EmpId=res.getInt(1);
					String EmpName=res.getString(2);
					String Designation=res.getString(3);
					String DOJ=res.getString(4);
					int sal=res.getInt(5);
					int comm=res.getInt(6);
					int DeptId=res.getInt(7);
					System.out.println("EmpId : "+EmpId+" EmpName : "+EmpName+" Designation : "+Designation+" DOJ : "+DOJ+" sal : "+sal+" comm : "+comm+" DeptId : "+DeptId);
				}
				con.close();
		}
		catch(Exception e)
			{
				System.out.println(e);
			}
		}
}