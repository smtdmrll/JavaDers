package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<>();

		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		System.out.println(list);
		
		System.out.println(list.size());//4
		
	
		System.out.println(list.remove(1));// indexi 1 olan can� silip sildi�i eleman� bana d�nd�recek
		System.out.println(list);
		
		list.remove("ayse"); //ayse yi bulamad��� i�in false ��nk� a k���k 
		System.out.println(list.remove("Ayse")); //ay�eyi �ld�recek true d�necek 
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
