package day44_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day13_stringmanupltion.C6_ReplaceFirst;

public class Iterator01 {

	public static void main(String[] args) {
		List<String> smt = new ArrayList<>();

		smt.add("A");
		smt.add("B");
		smt.add("C");
		smt.add("D");

		System.out.println(smt);
		// her elemana B harfini ekleyelim
		
		for (String each : smt) {
			each+="B";
		System.out.print(each +" ");
		}
		System.out.println("\n"+smt);
		
		//collections da her yapý indexi desteklemez örneðin set de indeks olmaz
		// indeks olmayýnca mecburen tüm elemanlara ulaþmak için For-each loop kullanýlýr 
		//for-each loop ile de de update veya delete yapamayýz 
		//bunun için de java iterator iinterface ýný oluþturmuþtur 
		
		Iterator it1= smt.iterator();
		// next hasNext remove metodlarýnasahip
		//listedeki tüm elemanlarý iterator kullanarak silelim

		while (it1.hasNext()) {
			it1.next();
			it1.remove();
		}
		System.out.println(smt);
	}
}


































