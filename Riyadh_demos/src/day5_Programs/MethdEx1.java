package day5_Programs;

public class MethdEx1 {
	
	public void display1()
	{
		System.out.println("method without paramenter");
	}
	public void display2(int a)
	{
		System.out.println("method with paramenter " +a);
	}
	
	public static void main(String[] args) 
	{
		MethdEx1 obj = new MethdEx1();
		obj.display1();
		obj.display2(25);
		
	
//	public static int square(int num)
//	{
//		return num*num;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int result;
//		result = square(10);
//		System.out.println(result);
//	}

}
}
