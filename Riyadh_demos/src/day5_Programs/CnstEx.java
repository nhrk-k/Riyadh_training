package day5_Programs;

public class CnstEx {

	String name;
	
	CnstEx(){
	System.out.println("Constructor is called");
	name = "Niharikaa";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CnstEx obj = new CnstEx();
		System.out.println("Name is "+obj.name);
	}

}
