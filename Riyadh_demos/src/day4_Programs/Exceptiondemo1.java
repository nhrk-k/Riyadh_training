package day4_Programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptiondemo1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file =new File("D://file.txt");
//		try {
//			FileReader fr=new FileReader(file);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("File is not there in system");
//		}
		FileReader fr=new FileReader(file);
		System.out.println("File is not there in system");
	}

}
