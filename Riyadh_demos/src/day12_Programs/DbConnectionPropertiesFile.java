package day12_Programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbConnectionPropertiesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			InputStream io = new FileInputStream("N:\\Training\\Riyadh\\Files\\dbConfigFile.properties");
			Properties prop = new Properties();
			
			prop.load(io);
			
		}
		catch(IOException e) {	}

	}

}
