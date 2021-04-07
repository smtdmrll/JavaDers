package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		int sayi=10;
		int sayi2=20;
		String isim="mehmet";
		 
		
		/*
		 * javada birden fazla elemaný koyabileceðimiz (store) objectler vardýr
		 * 
		 * Bugün bunlardan ilkini öðreneceðiz
		 * 
		 * Arrays de sadece pr-npri datalara ait referanslar depolanýr
		 * Arrays içinde tüm variablelar ayný datat tipinde olmalýdýr 
		 * bir array olýþturmadan önce içine kaç tane variable koyacaðýmýza karar vermeliyiz 
		 * Bir array koyabileceðimiz varriable sayýsýna Array in *length i * denir. o array içine length den fazla variable koyamazsýnýz 
		 */
		
		int arr[] = {10,20,30,}; // int[] arr þeklinde de yazýlabilir.
								//bu örnekte array in elemanlarýný direkt yazdýðým için uzunluk belirtmeye ihtiyaç yok 
							   //bu kullanýmda max eleman sayýsý (length) yazdýðýmýz eleman sayýsýdýr.yani 4 üncü eleman ekleyemen 
							  
		System.out.println(arr); // Array bir obje dir eðer direkt olarak Arrayi yazdýrmak isterseniz java referans yazdýrýr 
		
		System.out.println(Arrays.toString(arr));// [10, 20, 30] yazdýrýr virgülden sonra bir boþluk býrakýr
												// Arrays javanýn kendi oluþturduðu bir class . koyduktans sonra methodlar çýkar 
		
		String takim[]= new String[3] ; // üç elemanlý arrays oluþturucam demek [null, null, null]
		System.out.println(Arrays.toString(takim));
		
		takim[0]="ali"; // 0. indexi ali
		System.out.println(Arrays.toString(takim)); //[ali, null, null]
		takim[2]="hasan";
		takim[1]="veli";
		System.out.println(Arrays.toString(takim)); //[ali, veli, hasan]

//	takim[3]="mehmet "; // java Run Time programdýr dolayýsýyla array prog çalýþtýrýlýnca oluþturulur
						   // 36. satýrda syntax olarak hata olmadigindan CTE olmaz 
						  // array in uzunluðu 3 ama biz 4.  yü tanýmlamaya çalýþtýk yani 3. index yok diye RTE verecek
		
		//Array deki bir elemaný update etme velinin yerine kemal gelsin
		
		takim[1]="kemal ";
		System.out.println(Arrays.toString(takim)); //[ali, kemal, hasan]
		
		
		//bir arrayin uzunluðunu nasýl bulabiliriz 
		
		System.out.println(takim.length); //3
										 //stringteki length() böyle arrayde parantez yok length böle.
		
		// Arraydeki son elemaný Mehmet yapýn
		
		takim[takim.length-1]="mehmet";
		System.out.println(Arrays.toString(takim));
		
		
		//eðer arrayin eleman sayýsý tek ise ortadaki elemaný can yapalým 
		
		if (takim.length%2==1) {
			int ortaIndex=(takim.length-1)/2; // 1 çýkarmamýzýn sebebi index in 0 dan baþlamasý
			takim[ortaIndex]="can";
			
		}
		System.out.println(Arrays.toString(takim));//
		
		
		
		
		
		
		
		
		
		
		
	}

}
