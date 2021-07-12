package day4_Programs;

public class NestedTrydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			try
			{
				System.out.println("Division");
				int b= 30/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try
			{
				int a[] = new int[5];
				a[5] = 4;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println("The try catch block complted");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("REst of your Program will be executed");
	}

}
