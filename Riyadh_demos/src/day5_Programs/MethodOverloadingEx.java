package day5_Programs;

public class MethodOverloadingEx {
	
	public static int minvalue(int n1, int n2)
	{
		int minvalue;
		if(n1>n2)
		{minvalue =n2;}
		else
		{minvalue =n1;}
		return minvalue;
	}
	
	public static double minvalue(double n1, double n2)
	{
		double minValue;
		if(n1>n2)
		{minValue =n2;}
		else
		{minValue =n1;}
		return minValue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =11;
		int b=3;
		double c = 11.3;
		double d = 3.9;
		
		int result = minvalue(a, b);
		double result2 = minvalue(c, d);
		
		System.out.println("Method 1 result: "+result );
		System.out.println("Method 2 result: "+result2 );
		
	}

}
