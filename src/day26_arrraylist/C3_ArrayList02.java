package day26_arrraylist;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		// Listin uzunlupu nas�l bulurum

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);

		System.out.println(list); // [10, 15, 8, 12, 20]

		System.out.println(list.size()); // 5

		// bir eleman nas�l silinir
		list.remove(1);
		System.out.println(list); // [10, 8, 12, 20]

		System.out.println(list.remove(2)); // git 12 yi kald�r dedi�imizde 12 al�r�z ekranda 12 d�nd�r�r yani
		//remove(index) kulland���m�zda o indexteki eleman� remove eder 
		//ve bunun delili olarak o eleman� getirir 
		//e�er olmayan bir index girersek RTE verir 
		
		System.out.println(list);// [10, 8, 20]

		List<String> list2 = new ArrayList<>();

		list2.add("ali");

		System.out.println(list2.remove("hasan")); // git hasan� kald�r dedik bulamad� false d�nd�r�r

		// remove(object) metodu kullan�ld���nda e�er java istenen eleman� bulup remove
		// ederse
		// bize remove edilen eleman� d�nd�r�r, listede bulamazsa iste�in yerine
		// getirilemedi�ini anlamam�z i�in false d�nd�r�r
		 
//		System.out.println(list2.remove("ali")); bu true verir
		System.out.println(list2.remove(0)); // bu ali verir anla mk sala�� bu kadar asit 
		
		

	}

}
