package day7_Programs;

public class PersonDriver extends Person {
	
	private int empId;
	
	public PersonDriver(String nm,String gen,int id)
	{
		super(nm,gen);
		this.empId=id;
	}
	public void work()
	{
		if(empId==0)
		{
			System.out.println("Person is not working");
		}
		else
		{
			System.out.println("Person is working");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person student = new PersonDriver("Niharikaa","Female" , 0);
		Person emp = new PersonDriver("Nikita","Female" , 100);
		
		student.work();
		emp.work();
		
		//emp.changeName("ABC");
		
		System.out.println(emp.toString());
	}

}
