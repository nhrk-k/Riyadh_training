package day8_Programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<>();
		
		//add elements
		set1.add(88);
		set1.add(99);
		System.out.println("Set 1 is: "+set1);
		
		Set<Integer> set2 = new HashSet<>();
		//add elements
		set2.add(88);
		set2.add(101);
		set2.add(77);
		System.out.println("Set 2 is: "+set2);
		
		//combine 2 sets
		set2.addAll(set1);
		System.out.println("Union of sets is" +set2);
		
		Iterator<Integer> iterate = set2.iterator();
		System.out.println("SET is :");
		while(iterate.hasNext())
		{
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		
		

	}

}
