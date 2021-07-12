package day8_Programs;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
public class ExExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
	Workbook wb = new HSSFWorkbook();//XSSFWorkbook();
		
		OutputStream fileout = new FileOutputStream("N:\\Training\\Riyadh\\Riyadh_Selenium\\demExcel.xls/xlsx");
			System.out.println("File Created");
			wb.write(fileout);
			wb.close();
	}

}
