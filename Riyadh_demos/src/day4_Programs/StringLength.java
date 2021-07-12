package day4_Programs;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String word = sc.nextLine();
//		char [] a= word.toCharArray();
//			for(char ch : a){
//			c++;
//				}
//			System.out.println("The characters are "+c);
		int len =word.length();
		System.out.println("It contains "+len+" characters");
		
	}

}
