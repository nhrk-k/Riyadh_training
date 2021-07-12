package day8_Programs;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num= new ArrayList<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		System.out.println("List is: "+num);
		
		//access elements
		int element = num.get(2);
		System.out.println("Accessed element is "+element);
	}

}
