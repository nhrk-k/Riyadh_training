package day4_Programs;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			//int a[] = new int[5];
			//a[5] = 30/0;
			
			int b[]= new int[2];
			System.out.println("Access element 3"+b[3]);
			
			//String s = null;
			//System.out.println(s.length());
		}
		catch(ArithmeticException e1)
		{
			System.out.println("Arithmetic Exception Occured" +e1);
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Array Index Out Of Bounds Exception Occured"+e2);
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception Occured");
		}
		
		double[] mylist= {1.1, 1.2, 1.3, 2.3};
		double max = mylist[0];
		for(int i=1;i<mylist.length;i++)
		{
			if(mylist[i]>max)max =mylist[i];
		}
		System.out.println("Max is" +max);
	}

}
