package day4_Programs;

public class Exceptiondemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int num[] = {1,2,3,4};
			System.out.println(num[5]);
		}
		catch (Exception e)
		{
			System.out.println("The error is " +e );
		}
		System.out.println("The size issue");
	}

}
