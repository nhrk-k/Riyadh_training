package day5_Programs;

public class Examination {

		public static void main(String[] args) {
		methodmarks(100);
	}
		public static void methodmarks(int marks) //void : donot return value
		{
			if(marks>=75)
			{
				System.out.println("Grade A");
			}
			else if (marks>=60)
			{
				System.out.println("Grade B");
			}
			else
			{
				System.out.println("Grade C");
			}
		}

}


