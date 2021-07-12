package day5_Programs;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int data=25/0;
			System.out.println(data);
		}
		//catch(NullPointerException e)
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Finally block executed");
		}
	}	

}
