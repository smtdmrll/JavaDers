package day28_foreachloop;

public class C1_ForEachLoop {

	public static void main(String[] args) {
		// bir array in tüm elemanlarýný for loop ile yazýdralým
		
		int arr[]= {2,4,6,8,15,12};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		
		//for loop yazmamýzýn amacý array in TÜM ELEMANLARI ÜZERÝNDE iþlem yapmak ise
		//for each loop daha kolay kod yazmamýzý saðlar
		
		
		// each==> her biridemek
		//for each loop istediðim bir topluluktaki tüm elemanlarý birer birer bana getirir
		//for each loopda baþlangýç deðeri YOKTUR bitiþ deðeri YOKTUR indeks YOKTUR
		System.out.println();
		
		for (int each : arr) { // each istersen i olur j olur w olur her þey olur sana kalmýþ arrayi bodosloma bana getir demek 
							   //artýþ deðeri bitiþ baþlangýç hiçbiþi yok tüm elemanlarý isterjen bunu kullanýrýz baboþ
			System.out.print(each +" ");
		}
		
	}

}
