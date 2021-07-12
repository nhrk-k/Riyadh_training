package day3_Programs;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int m , n, num=0;
			Scanner s = new Scanner(System.in);
			System.out.println("enter number");
			m= s.nextInt();
			while(m>0)
			{
				n = m % 10;
				num = num *10 + n;
				m =m /10;
			}
			System.out.println(+num);
	}

}
