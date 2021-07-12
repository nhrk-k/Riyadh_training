package day8_Programs;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits= new Vector<>();
		
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Strawberry");
		fruits.add("Grapes");
		
		//add using index number
//		fruits.add(2,"Banana");
//		System.out.println("Vectr list is: "+fruits);
		
	Iterator<String> iterate = fruits.iterator();
	System.out.println("Vector :");
	while(iterate.hasNext())
	{
		System.out.print(iterate.next());
		System.out.print(", ");
	}
	
	}

}
