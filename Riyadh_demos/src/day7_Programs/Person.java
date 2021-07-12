package day7_Programs;

public abstract class Person {
	
	private String name;
	private String gender;
	
	public Person(String nm, String gen)
	{
		this.name=nm;
		this.gender=gen;
	}

	public abstract void work();
	
	public String toString()
	{
		return "Name: "+this.name+ "\nGender: "+this.gender;
	}
	
	public void changeName(String newName)
	{
		this.name =newName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
