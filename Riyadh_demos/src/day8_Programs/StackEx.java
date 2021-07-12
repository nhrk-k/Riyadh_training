package day8_Programs;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> animals= new Stack<>();
		
		//Add elements
		animals.push("Cat");
		animals.push("Dog");
		animals.push("Camel");
		System.out.println("Animals added: "+animals);
		
		String element = animals.pop();
		System.out.println("Animals removed: "+animals);
		
		
		
		
		
		
	}

	
	
}
