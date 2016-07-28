import java.sql.*;

public class preparedStat
{
	public static void main(String aregs[]) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con= DriverManager.getConnection("jdbc:odbc:kpl");
		
		//String dql="CREATE TABLE TAKA( int id NOT NULL)";
	
		int count=1;
		while(count<10)
		{
		String sql="INSERT INTO Bank VALUES(?)";
	
		
		
		PreparedStatement stmnt= con.prepareStatement(sql);

		stmnt.setInt(1,count);
		
		int n= stmnt.executeUpdate();


		count++;
		}

		Statement stmnt= con.createStatement();

		String fetch="Select * from Bank;";

		ResultSet rs= stmnt.executeQuery(fetch);
		//System.out.println(rs);

		boolean doesExist = rs.next();	// True =exist
		int sth=rs.getInt(1);
		System.out.println(sth + " " + doesExist );
		con.close();
	}
}