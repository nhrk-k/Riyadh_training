package day3_Programs;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name ="Wasayef Bander Alotibi";
		//System.out.println("String is: "+name);
		//int length = name.length();
		//System.out.println("Length is: " +length);
	
		int c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String: ");
		String name = sc.next();
		char[] a =name.toCharArray();
		for(char ch : a)
		{
			c++;
		}
		System.out.println("String contains "+c+ " characters");
		
	}

}
