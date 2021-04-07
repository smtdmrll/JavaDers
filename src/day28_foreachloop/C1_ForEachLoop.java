package day28_foreachloop;

public class C1_ForEachLoop {

	public static void main(String[] args) {
		// bir array in t�m elemanlar�n� for loop ile yaz�dral�m
		
		int arr[]= {2,4,6,8,15,12};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		
		//for loop yazmam�z�n amac� array in T�M ELEMANLARI �ZER�NDE i�lem yapmak ise
		//for each loop daha kolay kod yazmam�z� sa�lar
		
		
		// each==> her biridemek
		//for each loop istedi�im bir topluluktaki t�m elemanlar� birer birer bana getirir
		//for each loopda ba�lang�� de�eri YOKTUR biti� de�eri YOKTUR indeks YOKTUR
		System.out.println();
		
		for (int each : arr) { // each istersen i olur j olur w olur her �ey olur sana kalm�� arrayi bodosloma bana getir demek 
							   //art�� de�eri biti� ba�lang�� hi�bi�i yok t�m elemanlar� isterjen bunu kullan�r�z babo�
			System.out.print(each +" ");
		}
		
	}

}
