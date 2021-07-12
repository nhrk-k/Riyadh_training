package day5_Programs;

public class Student {
	
	String name;
	int id;
	int age;
	
		void info() { //method
			System.out.println("Name: "+name);
			System.out.println("id: "+id);
			System.out.println("age: "+age);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		
		//Accessing the values
		s.name="Niharika";
		s.id=001;
		s.age=20;
				
		s.info(); //calling method
	}

}
