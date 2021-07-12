package day4_Programs;

import java.util.Scanner;

public class Unique_characters
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String word = sc.nextLine();
		
		for(int i=0;i<word.length();i++)
		{
			for(int j=i+1;j<word.length();j++)
			{
				if(word.charAt(i)==word.charAt(j))
				{
					word = word.replace(String.valueOf(word.charAt(j)),"");
				}
			}
			for(char a: word.toCharArray())
			{
				boolean containDigit = Character.isDigit(a);
				if(containDigit)
				{
					System.out.println("Invalid sentence");
				}
			}	System.out.println(word);
		}
	}
}
	

