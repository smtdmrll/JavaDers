package day26_arrraylist;

import java.util.ArrayList;
import java.util.List;

public class C2_ArraysList01 {

	public static void main(String[] args) {
		/*
		 *  bir arraylist nas�l oluiturulur
		 *  ArrayList bir objedir, yeni bir tane olu�turmak i�in new keyword � kullanmak zorunday�m 
		 */
		
		//1. yol
		ArrayList<String> list= new ArrayList <String> ();
		
		//2.yol 
		ArrayList<String> list2= new ArrayList<>();
		
		//3. yol en �ok bu kullan�l�r 
		List<String> list3= new ArrayList<>();
		
		//NOT e�er constructor olarak List<>() kullan�l�rsa CTE VER�R
		//List constructor  olarak kullan�lamaz 
		
//		List<String> list4 =new List<>();
		
		// olu�turdu�umuz class isimleri javada kullan�lan obje isimleri ile AYNI OLAMAAAAAAAZ. sebebini sen biliyorsun zaten 
		
		//List e eleman eklemek 
		//list oluitururken otomatik olarak eleman ekleme �zelli�i yoktur elemanlar�n tek tek eklenmesi gerekir
		
		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ay�e");
		
		//nas�l yazd�r�l�r
		
		System.out.println(list3);//[Ali, Veli, Ay�e]

		list3.add(1, "Can");//[Ali, Can, Veli, Ay�e] birinci indexe istenen stringi ekler
		
		System.out.println(list3);
		
		list3.add(1, "fatma");
		
		System.out.println(list3);
		
		 /*
        Soru 6) Verilen bir Array�den istenen degere esit olan elamanlari kaldirip, 
        kalanlari yeni bir Array olarak yazdiran bir method yaziniz
        */
		
		  int arr[]= {2,3,5,3,6,4,3,6,7};
	      int sayi=3;
		
		List<Integer> istenenList= new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=sayi) istenenList.add(arr[i]);
			
		}
		System.out.println(istenenList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
