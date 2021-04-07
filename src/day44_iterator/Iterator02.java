package day44_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

	public static void main(String[] args) {
		List<String> smt = new ArrayList<>();

		smt.add("A");
		smt.add("B");
		smt.add("C");
		smt.add("D");

		System.out.println(smt);
		// her elemana B harfini ekleyelim
		
		ListIterator li1= smt.listIterator();
		
		while (li1.hasNext()) {
			
		
			String temp=(String) li1.next();
			li1.set(temp+"B");
			
			
		}
		System.out.println(smt);
	}
}
