package day11_Programs;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class MetaDataEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.sqlserver.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc.sqlserver://localhost:3360/JDBCDemo","root","password");
			DatabaseMetaData dbmd = cn.getMetaData();
			System.out.println("Driver Name" +dbmd.getDriverName());
			System.out.println("Versin Name" +dbmd.getDriverVersion());
			cn.close();
		}
		catch (Exception e) {
		
		}
	}

}
