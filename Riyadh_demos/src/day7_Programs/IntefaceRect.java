package day7_Programs;

public abstract class IntefaceRect implements InterfaceShape {
	
	private double ht;
	private double wd;
	
	public void InterfaceRect(double w, double h)
	{
		this.ht =h;
		this.wd=w;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle drawn");
	}
	
	public double getArea()
	{
		return this.ht*this.wd;
		
	}



}
