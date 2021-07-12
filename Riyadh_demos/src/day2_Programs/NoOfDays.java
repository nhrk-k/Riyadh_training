package day2_Programs;

import java.util.Scanner;

public class NoOfDays {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Day number");
		int mnthnumber;
		mnthnumber= sc.nextInt();
		switch(mnthnumber)
		{
		case 1 :
		case 3 :
		case 5 :
			System.out.println("number of days : 31");
			break;
		case 4:
		case 6:
			System.out.println("number of days : 3");
			break;
			case 2:
			System.out.println("number of days : 28");
			break;
			
		}
	}
}


//print the days of month depending upon what month number u select

//3 : 31 days
//2 : 28 days

