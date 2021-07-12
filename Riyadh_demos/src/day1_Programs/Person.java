package day1_Programs;

public class Person 
{
	int age;
	String name, address;
	float sal;
	
	void display()
	{
		System.out.println("Person age "+age);
		System.out.println("Person Name "+name);
		System.out.println("Person address "+address);
		System.out.println("Person salary "+sal);
	}
	
	public static void main(String args[])
	{
		Person p = new Person();
		p.age = 30;
		p.name = "Tom";
		p.address = "New York";
		p.sal = 2000000;
		p.display();
		System.out.println("Demo statement");
	}

}
