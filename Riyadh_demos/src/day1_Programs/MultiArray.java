package day1_Programs;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[][] = {{50, 80, 90}, {85,78,66}};
		for(int i=0; i<=1; i++)
		{
			for (int j=0;j<=2;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
