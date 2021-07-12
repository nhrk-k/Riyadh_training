package day6_Programs;

public class EmpDetails {
	private int id;
	private String name;
	private String desg;
	private String company;
	
	public void setid(final int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(final String name)
	{
		if(name == null || name.length() <=2)
		{
			throw new IllegalArgumentException("Proper Name");
		}
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
		
	public void setDesignation(final String desg)
	{
		this.desg=desg;
	}
	
	public String getDesignation()
	{
		return desg;
	}
	
	public void setcompany(final String company)
	{
		this.company=company;
	}
	public String getcompany()
	{
		return company;
	}
	
	public String toString()
	{
		return "Employee id: "+getId()+ "\nName: "+getName()+ "\nDesignation" +getDesignation()+ "\nCompany: "+getcompany();
	}
	
}

