import java.sql.*;

public class Prac_3_2
{
	public static void main(String args[])
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			 	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:/practical", "root", "");
			  	System.out.println("Connection successfull");
				Statement st=con.createStatement();
				ResultSet res=st.executeQuery("select EmpName from emp where EmpName like '__A%'");
				while(res.next())
				{
					String EmpName=res.getString(1);
					System.out.println(" EmpName : "+EmpName);
				}
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}