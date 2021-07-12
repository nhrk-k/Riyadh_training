package day11_Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayValuesUsingJDBC {
	static final String JDBC_DRIVER = "com.sqlserver.jdbc.Driver";
	static final String DB_URL = "jdbc:sqlserver://localhost/EMP";
	
	static final String usrname = "un";
	static final String password = "pwd";
	
	public static void main(String[] args) {
		Connection con = null;
		Statement stmnt = null;
		
		try {
			//registered to JDBC driver
			Class.forName(JDBC_DRIVER);
			
			//open connection
			System.out.println("Cnnecting to db..");
			con = DriverManager.getConnection(DB_URL, usrname, password);
			
			//Execute a query
			stmnt= con.createStatement();
			String query;
			query = "Select id, fname, lname from emp";
			ResultSet rs =  stmnt.executeQuery(query);
			
			while(rs.next())
			{
				//retriving values from colname
				int id =rs.getInt("ID");
				String fname =rs.getString("Fname");
				//String Lname =rs.getString("Lname");
				String Lname =rs.getNString(2);
				
				
				//diplay values
				System.out.println("Id" +id);
				System.out.println("Fname" +fname);
				System.out.println("Lname" +Lname);
			}
			
			rs.close();
			stmnt.close();
			con.close();		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}

	}

}	
