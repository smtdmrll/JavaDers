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
	
// set metodu replace yapýyor yaný ve olmayan bir indeks kullanýrsa RTE verir 
		
		list.add(2, "yasin");
		System.out.println(list); // bu da istediðimiz indekse eleman ekliyor 
		
		list.add(5, "hürriyet");
		System.out.println(list);// son indeksin bir üstünü kabul eder
		
//		list.add(20, "sefer");
//		System.out.println(list);// hatagt verir
		
		System.out.println(list.contains("hürriyet")); // true
		System.out.println(list.contains("hürriy"));	//false
		
		//listin elemanlarýný sýralama
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
