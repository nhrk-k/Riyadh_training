package day2_Programs;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Grade (A, B, C, D)");
		char grade = sc.next().toCharArray()[0];
		if (grade == 'A')
		{
			System.out.println("You got 'A' Grade");
		}
		else if(grade == 'B')
		{
			System.out.println("You got 'B' Grade");
		}
		else
		{
			System.out.println("Improper Input");
		}
	}

}
