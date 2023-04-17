import java.sql.*;

public class Prac_3_4
{
	public static void main(String args[])
		{
		try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			 	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practical", "root", "");
			  	System.out.println("Connection successfull");
				PreparedStatement pst=con.prepareStatement("delete from emp where Designation='SALESMAN' AND sal>1500");
				pst.executeUpdate();
				System.out.println("Deleted Successfully");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from emp");
				while(rs.next())
				{
					int EmpId=rs.getInt(1);
					String EmpName=rs.getString(2);
					String Designation=rs.getString(3);
					String DOJ=rs.getString(4);
					int sal=rs.getInt(5);
					int comm=rs.getInt(6);
					int DeptId=rs.getInt(7);
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