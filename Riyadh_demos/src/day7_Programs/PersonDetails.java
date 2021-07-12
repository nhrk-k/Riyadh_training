package day7_Programs;

import java.util.Scanner;

public class PersonDetails {
	private String name;
	private String Id;
	private int age;
	
	Scanner sc= new Scanner(System.in);
	
	public int getAge()
	{
		System.out.println("Enter Age");
		return age = sc.nextInt();
	}
	public void setAge(int newAge)
	{
		this.age=sc.nextInt();
	}
	
	public String getName()
	{
		System.out.println("Enter Name");
		return name = sc.next();
	}
	public void setName(String newName)
	{
		this.name=sc.next();
	}
	
	public String getIdNum()
	{
		System.out.println("Enter ID");
		return Id = sc.next();
	}
	public void setId(String newId)
	{
		this.Id=sc.next();
	}
}
