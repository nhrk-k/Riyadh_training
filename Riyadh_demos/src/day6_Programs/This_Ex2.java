package day6_Programs;

public class This_Ex2 {
	int num =10; // instance variable

	public This_Ex2() //constructor1
	{
		System.out.println("Statment 1");
	}
	
	public This_Ex2(int num) //constructor2
	{
		this(); //invoking default constructor
		this.num=num; //assigning the local variable to instance variable
	}
	public void greet()
	{
		System.out.println("Statement 2");
	}
	
	public void print()
	{
		int num=20; //local variable
		System.out.println("Value of local variable "+num);
		System.out.println("Value of instance variable "+this.num);
	}
	public static void main(String[] args) 
	{
		This_Ex2 obj = new This_Ex2();
		obj.print();
		
		This_Ex2 obj1 = new This_Ex2(20);
		obj1.print();
	}

}
