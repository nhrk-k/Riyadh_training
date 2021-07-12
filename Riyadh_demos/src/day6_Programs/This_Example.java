package day6_Programs;

public class This_Example {
	
	int a;
	int b;
	
	public void setData(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void showData()
	{
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Example obj = new This_Example();
		obj.setData(2,10);
		obj.showData();

	}

}
