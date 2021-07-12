package day2_Programs;

import java.util.Scanner;

public class UserInput {
	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String Username;
		Float amount;
		
		System.out.println("Enter your ID: ");  
		int a= sc.nextInt();  
		System.out.println("Enter Usename");
		Username = sc.next();
		System.out.println("Enter Amount");
		amount = sc.nextFloat();
		System.out.println("Username is: "+Username);
		System.out.println("Id = "+a);
		sc.close();
	}
}
