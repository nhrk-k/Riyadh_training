package day3_Programs;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2021;
		if(((year%4==0) && (year % 100!=0)) || (year % 400 == 0))
		{
			System.out.println(year+" Leap Year");
		}
		else
		{
			System.out.println(year+" Not a Leap Year");
		}
		
	}

}

