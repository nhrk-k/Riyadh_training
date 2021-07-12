package day5_Programs;

import java.util.Scanner;

class Dept
{
	int sal, bonus;
	void calc()
	{
		System.out.println("Salary is:  "+(sal+bonus));
	}
}

class HR extends Dept
{
	
}

class sales extends Dept
{
	int incet=3000;
	void calc_sales()
	{
		System.out.println("Salary is:  "+(sal+bonus+incet));
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sales s= new sales();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter sal, bnus for HR");
		s.sal=sc.nextInt();
		s.bonus=sc.nextInt();
		s.calc();
		
		System.out.println("Enter sal, bnus for sales");
		s.sal=sc.nextInt();
		s.bonus=sc.nextInt();
		s.calc_sales();
		sc.close();
		}
	

}
