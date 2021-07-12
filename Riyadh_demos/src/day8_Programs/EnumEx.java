package day8_Programs;

enum Days
{
	Sunday, Monday, Tuesday;
}
enum Day
{
	Sunday, Monday, Tuesday;
}
	public class EnumEx {
	Days day;
	
	public EnumEx(Days Day)
	{
		this.day=day;
	}
	
	public void dayIS()
	{
		switch (day) {
		case Sunday: {
			
			System.out.println("1st day of week");
			break;
		}
		case Monday: {
			
			System.out.println("2nd day of week");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}
	}
	 	public static void main(String[] args) {
		String str = "Sunday";
		EnumEx e1= new EnumEx(Days.valueOf(str));
		e1.dayIS();
		
		
		
	}

}
