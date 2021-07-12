package day2_Programs;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of Elements in Array");
		n=sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0; i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Elements are");
		for(int i=0; i<n;i++)
		{
			System.out.println(array[i]);
		}
	}

}
