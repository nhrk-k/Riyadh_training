package day6_Programs;

public class SetGet {
	private String name;
	private int id;
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getid()
	{
		return id;
	}
	public static void main(String[] args) 
	{
		SetGet sg = new SetGet();
		sg.setName("Niharikaa");
		sg.setId(700);
		System.out.println(sg.getName());
		System.out.println(sg.getid());
	}
	
//	public static void main(String[] args) {
//		SetGet sg = new SetGet();
//		sg.name="Set sme value";
//		sg.id=12;
//		
//		System.out.println("Name is: "+sg.name);
//		System.out.println("ID is: "+sg.id);
//		
//	}

}
