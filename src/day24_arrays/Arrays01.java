package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		int sayi=10;
		int sayi2=20;
		String isim="mehmet";
		 
		
		/*
		 * javada birden fazla eleman� koyabilece�imiz (store) objectler vard�r
		 * 
		 * Bug�n bunlardan ilkini ��renece�iz
		 * 
		 * Arrays de sadece pr-npri datalara ait referanslar depolan�r
		 * Arrays i�inde t�m variablelar ayn� datat tipinde olmal�d�r 
		 * bir array ol��turmadan �nce i�ine ka� tane variable koyaca��m�za karar vermeliyiz 
		 * Bir array koyabilece�imiz varriable say�s�na Array in *length i * denir. o array i�ine length den fazla variable koyamazs�n�z 
		 */
		
		int arr[] = {10,20,30,}; // int[] arr �eklinde de yaz�labilir.
								//bu �rnekte array in elemanlar�n� direkt yazd���m i�in uzunluk belirtmeye ihtiya� yok 
							   //bu kullan�mda max eleman say�s� (length) yazd���m�z eleman say�s�d�r.yani 4 �nc� eleman ekleyemen 
							  
		System.out.println(arr); // Array bir obje dir e�er direkt olarak Arrayi yazd�rmak isterseniz java referans yazd�r�r 
		
		System.out.println(Arrays.toString(arr));// [10, 20, 30] yazd�r�r virg�lden sonra bir bo�luk b�rak�r
												// Arrays javan�n kendi olu�turdu�u bir class . koyduktans sonra methodlar ��kar 
		
		String takim[]= new String[3] ; // �� elemanl� arrays olu�turucam demek [null, null, null]
		System.out.println(Arrays.toString(takim));
		
		takim[0]="ali"; // 0. indexi ali
		System.out.println(Arrays.toString(takim)); //[ali, null, null]
		takim[2]="hasan";
		takim[1]="veli";
		System.out.println(Arrays.toString(takim)); //[ali, veli, hasan]

//	takim[3]="mehmet "; // java Run Time programd�r dolay�s�yla array prog �al��t�r�l�nca olu�turulur
						   // 36. sat�rda syntax olarak hata olmadigindan CTE olmaz 
						  // array in uzunlu�u 3 ama biz 4.  y� tan�mlamaya �al��t�k yani 3. index yok diye RTE verecek
		
		//Array deki bir eleman� update etme velinin yerine kemal gelsin
		
		takim[1]="kemal ";
		System.out.println(Arrays.toString(takim)); //[ali, kemal, hasan]
		
		
		//bir arrayin uzunlu�unu nas�l bulabiliriz 
		
		System.out.println(takim.length); //3
										 //stringteki length() b�yle arrayde parantez yok length b�le.
		
		// Arraydeki son eleman� Mehmet yap�n
		
		takim[takim.length-1]="mehmet";
		System.out.println(Arrays.toString(takim));
		
		
		//e�er arrayin eleman say�s� tek ise ortadaki eleman� can yapal�m 
		
		if (takim.length%2==1) {
			int ortaIndex=(takim.length-1)/2; // 1 ��karmam�z�n sebebi index in 0 dan ba�lamas�
			takim[ortaIndex]="can";
			
		}
		System.out.println(Arrays.toString(takim));//
		
		
		
		
		
		
		
		
		
		
		
	}

}
