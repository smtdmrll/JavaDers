package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		System.out.println(list);//[Ali, Can, Ayse, Fatma]
		
		list.set(2, "kemal");
		System.out.println(list);//	[Ali, Can, kemal, Fatma]
	
// set metodu replace yap�yor yan� ve olmayan bir indeks kullan�rsa RTE verir 
		
		list.add(2, "yasin");
		System.out.println(list); // bu da istedi�imiz indekse eleman ekliyor 
		
		list.add(5, "h�rriyet");
		System.out.println(list);// son indeksin bir �st�n� kabul eder
		
//		list.add(20, "sefer");
//		System.out.println(list);// hatagt verir
		
		System.out.println(list.contains("h�rriyet")); // true
		System.out.println(list.contains("h�rriy"));	//false
		
		//listin elemanlar�n� s�ralama
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
