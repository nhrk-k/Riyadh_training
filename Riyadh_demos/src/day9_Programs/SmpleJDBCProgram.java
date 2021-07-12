package day9_Programs;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SmpleJDBCProgram 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Connection con = null;
		
		try 
		{
			String dbUrl ="jdbc:sqlserver://localhost;integratedSecurity=true";
			
			//con= DriverManager.getConnection("jdbc:sqlserver://localhost", "username", "password");
			//con=DriverManager.getConnection(dbUrl, "location of properties file");
			con=DriverManager.getConnection(dbUrl);
			if(con!=null)
			{
				DatabaseMetaData dm = (DatabaseMetaData) con.getMetaData();
				System.err.println("Drivername :" +dm.getDriverName());
			}
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (con!=null && !con.isClosed())
				{
					con.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		}
	}
}

