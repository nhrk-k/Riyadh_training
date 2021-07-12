package day8_Programs;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num= new LinkedList<>();
		
		num.add(100);
		num.add(300);
		System.out.println("List is: "+num);
		
		//access elements
		int element = num.get(2);
		System.out.println("Accessed element is "+element);
		
		int index = num.indexOf(200);
		System.out.println("Position of 300 is: "+index);
		
		
	}
	
	}


