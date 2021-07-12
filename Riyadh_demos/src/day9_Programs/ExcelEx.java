package day9_Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ExcelEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream(new File("Downloads\\test.xls"));
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Calculate Simple Interest");

		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Pricipal Amount (P)");
		header.createCell(1).setCellValue("Rate of Interest (r)");
		header.createCell(2).setCellValue("Tenure (t)");
		header.createCell(3).setCellValue("Interest (P r t)");

		Row dataRow = sheet.createRow(1);
		dataRow.createCell(0).setCellValue(14500);
		dataRow.createCell(1).setCellValue(9.25);
		dataRow.createCell(2).setCellValue(3);
		

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("poi-generated-file.xlsx");
        workbook.write(fileOut);
        fileOut.close();
        System.out.println("Excel written successfully..");

	}
}
