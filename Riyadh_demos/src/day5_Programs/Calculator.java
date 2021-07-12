package day5_Programs;

import java.util.Scanner;

class NumberOperations
{
	int a,b;
	
	void calc()
	{
		System.out.println("Addition is: " +(a+b));
	}
}
class substraction extends NumberOperations
{
	void calc()
	{
		System.out.println("Substraction is: "+(a-b));
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOperations no;
		Scanner sc= new Scanner(System.in);
		
		no=new NumberOperations();
		System.out.println("Enter values for a and b");
		no.a=sc.nextInt();
		no.b=sc.nextInt();
		no.calc();
		
		no= new substraction();
		System.out.println("Enter values for a and b");
		no.a=sc.nextInt();
		no.b=sc.nextInt();
		no.calc();
	


	}

}
