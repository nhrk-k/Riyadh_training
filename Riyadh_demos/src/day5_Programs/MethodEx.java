package day5_Programs;

public class MethodEx {
//create method
	public int addNumbers(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		int n1 =25;
		int n2=30;
		
		MethodEx obj = new MethodEx();
		
		int result = obj.addNumbers(n1, n2);
		System.out.println(result);

	}

}
