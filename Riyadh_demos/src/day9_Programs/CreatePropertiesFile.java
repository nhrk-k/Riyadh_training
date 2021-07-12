package day9_Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreatePropertiesFile {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("Device Name", "OnePlus7");
		prop.put("Andriod Version", "9");
		prop.put("Device Model", "GM1963");
		prop.put("CPU", "Snapdragon855");
		
		//InputStream input = new FileInputStream(projectpath+"/Riyadh_demos/src/day9_Programs/datafile.properties");	
		String path = "N:\\Training\\Riyadh\\Riyadh_Selenium\\myfile.propertise";
		FileOutputStream output =null;
		
		try {
			output = new FileOutputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occurred "+e);
		}
		try	{
			prop.store(output, "Sample file");
		}
		catch(IOException e){
			System.out.println("Exception occured"+e);			
		}
		System.out.println("Properties file created..!!");
	}
}
