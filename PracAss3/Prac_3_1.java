import java.sql.*;

public class Prac_3_1
{
	public static void main(String args[])
		{
		try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			 	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:/practical", "root", "");
			  	System.out.println("Connection successfull");
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery("select EmpName,sal from emp where sal>=2200");
				while(res.next())
				{
					String EmpName=res.getString(1);
					int sal=res.getInt(2);
					System.out.println(" EmpName : "+EmpName+" sal : "+sal);
				}
				con.close();
		}
		catch(Exception e)
			{
				System.out.println(e);
			}
		}
}