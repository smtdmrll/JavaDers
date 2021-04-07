package day26_arrraylist;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		// Listin uzunlupu nasýl bulurum

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);

		System.out.println(list); // [10, 15, 8, 12, 20]

		System.out.println(list.size()); // 5

		// bir eleman nasýl silinir
		list.remove(1);
		System.out.println(list); // [10, 8, 12, 20]

		System.out.println(list.remove(2)); // git 12 yi kaldýr dediðimizde 12 alýrýz ekranda 12 döndürür yani
		//remove(index) kullandýðýmýzda o indexteki elemaný remove eder 
		//ve bunun delili olarak o elemaný getirir 
		//eðer olmayan bir index girersek RTE verir 
		
		System.out.println(list);// [10, 8, 20]

		List<String> list2 = new ArrayList<>();

		list2.add("ali");

		System.out.println(list2.remove("hasan")); // git hasaný kaldýr dedik bulamadý false döndürür

		// remove(object) metodu kullanýldýüýnda eüer java istenen elemaný bulup remove
		// ederse
		// bize remove edilen elemaný döndürür, listede bulamazsa isteðin yerine
		// getirilemediðini anlamamýz için false döndürür
		 
//		System.out.println(list2.remove("ali")); bu true verir
		System.out.println(list2.remove(0)); // bu ali verir anla mk salaðý bu kadar asit 
		
		

	}

}
