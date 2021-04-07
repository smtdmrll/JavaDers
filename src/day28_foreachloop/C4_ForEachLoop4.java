package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C4_ForEachLoop4 {

	public static void main(String[] args) {
		/*
		 * iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each
		 * loop kullanarak bulunuz. Sonucu ekrana yazdiriniz. Ortak eleman yoksa ekrana
		 * “Ortak eleman yok” yazdiriniz
		 */
		String arr1[]= {"ali","can","ayþe","seher"};
		String arr2[]= {"ali","veli","mesut","seher","sedat"};
		
		//ortak elemanlarý koymak için bir list oluituralým 
		
		List<String> ortakElemanlar= new ArrayList<>();
		
		for (String each1 : arr1) {
			for (String each2 : arr2) {
				
				if (each1.equals(each2)) {
					ortakElemanlar.add(each1);
				}
			}
		}
		
		System.out.println(ortakElemanlar);

	}

}
