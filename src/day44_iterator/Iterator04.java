package day44_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {
	
	public static void main(String[] args) {
		
		/*
		 	�terator kullanarak listenin elemanlar�n� sondan ba�a do�ru yazd�r�n 
		 */
		List<Integer> sayiList =new ArrayList<>();
		sayiList.add(2);
		sayiList.add(13);
		sayiList.add(56);
		sayiList.add(23);
		sayiList.add(45);
		sayiList.add(14);
		sayiList.add(40);
		
		System.out.println(sayiList);
		ListIterator li=sayiList.listIterator();
		while (li.hasNext()) {
			li.next();
		}
		while (li.hasPrevious()) {
		
			System.out.print(li.previous()+" ");
		}
	}
}
