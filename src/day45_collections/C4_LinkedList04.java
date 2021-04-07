package day45_collections;

import java.util.LinkedList;

public class C4_LinkedList04 {
	public static void main(String[] args) {
		
		
		LinkedList<String> ll1 = new LinkedList<>();

		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); 
		
		System.out.println(ll1.contains("A")); //True
		
		LinkedList<String> ll2 = new LinkedList<>();

		ll2.add("A");
		ll2.add("B");
		ll2.add("C");
		ll2.add("D");
		
		System.out.println(ll2); 
		
		ll2.containsAll(ll1);
		System.out.println(ll2.containsAll(ll1));
		
		ll2.get(2);
		System.out.println(ll2.get(2));
		System.out.println(ll2.getFirst());
		System.out.println(ll2.getLast());
		System.out.println(ll2.getClass());
		
	}
}
