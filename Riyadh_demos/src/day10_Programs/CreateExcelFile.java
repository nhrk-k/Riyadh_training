package day10_Programs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelFile {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		try 
		{
		Workbook wb = new HSSFWorkbook(); //xls
		Workbook wb1 = new XSSFWorkbook(); //xlsx
		OutputStream output = new FileOutputStream("N:\\Training\\Riyadh\\Files\\ExamplePOI.xls");
		OutputStream foutput = new FileOutputStream("N:\\Training\\Riyadh\\Files\\ExamplePOI_1.xlsx");
			System.out.println("Files creaed");
			wb.write(output);
			wb1.write(foutput);
			wb.close();
			wb1.close();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
