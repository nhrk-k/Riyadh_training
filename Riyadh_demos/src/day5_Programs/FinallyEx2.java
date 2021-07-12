package day5_Programs;

public class FinallyEx2 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[2];
		try
		{
			System.out.println("Access elements" +a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown" +e);
			
		}
		finally
		{
			a[0] =6;
			System.out.println("First Element value : "+a[0]);
			System.out.println("Finally statement");
		}
	}

}
