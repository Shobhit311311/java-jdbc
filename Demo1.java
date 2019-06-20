package cg;
import java.sql.*;

public class Demo1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String pass="hr";
		Connection con=DriverManager.getConnection(url,user,pass);
				System.out.println("Connected");
		Statement st=con.createStatement();// used to pass sql queries
		ResultSet rs=st.executeQuery("select * from account");
		while(rs.next())
		{
			int a_id=rs.getInt("aid");
		long mobile=rs.getLong("mobileno");
		String ah=rs.getString(3);
		double bal=rs.getDouble(4);
		System.out.println("Account id "+a_id+"mobile "+mobile+",Name"+ah+",balance"+bal);
		System.out.println("======");
		
		}
		con.close();

	}

}
