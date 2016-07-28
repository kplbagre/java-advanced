import java.sql.*;

public class Bank
{
	public static void main(String aregs[]) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con= DriverManager.getConnection("jdbc:odbc:kpl");
		
		//String dql="CREATE TABLE TAKA( int id NOT NULL)";
	
		int count=1;
		while(count<10)
		{
		String sql="INSERT INTO Bank VALUES(5)";
		count++;
		
		
		Statement stmnt= con.createStatement();
		
		//int n= stmnt.executeUpdate(dql);
		int n= stmnt.executeUpdate(sql);
		}

		con.close();
	}
}