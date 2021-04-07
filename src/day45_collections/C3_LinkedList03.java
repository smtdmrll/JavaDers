package day45_collections;

import java.util.LinkedList;

public class C3_LinkedList03 {

	public static void main(String[] args) {

		LinkedList<String> ll1 = new LinkedList<>();

		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); 
		
		
		System.out.println(ll1.remove(0)); //A
		System.out.println(ll1); //[B]
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); 

		System.out.println(ll1.remove("B")); //true false döndürür ve ilk elemaný siler 
		System.out.println(ll1);
		
		ll1.addFirst("B");
		System.out.println(ll1);
		
		
		ll1.removeFirstOccurrence("B");
		System.out.println(ll1); //yine ilk bulduðuný siler
		
		
		
		
		
		
		
		
	}
}














