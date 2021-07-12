package day11_Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx {

	public static void main(String[] args) {
		Connection cn = null;
		PreparedStatement ps= null;
		String query = "INSERT INTO EMPLOYEE (ID,FNAME,LNAME) VALUES (?,?,?)";
		
		try {
			Class.forName("com.sqlserver.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc.sqlserver://localhost:3360/JDBCDemo","root","password");
			ps = cn.prepareStatement(query);
			ps.setInt(1, 100);
			ps.setString(2, "Fname");
			ps.setString(3, "Lname");
			int affectedRows = ps.executeUpdate();
			System.out.println(affectedRows + "Rows Affected");
			cn.commit();
			}
		catch (Exception e)	{
		
		}
		finally{
			try {
				ps.close();
				cn.close();
			} catch (SQLException e) {
					e.printStackTrace();
			}
			}
	}	
}
