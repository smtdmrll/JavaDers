package day24_arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		//karýþýk sýralý verilen bir Array i sýralý olarak yazdýrýnýz 
		
		int arr[]= {25,17,6,78,45,69,1};
		
		Arrays.sort(arr);  // sort sýralama methodu 
		System.out.println(Arrays.toString(arr));
		
		//ayný arrayin büyükten küçüðe doðru nasýl yazdýrabiliriz
		
		for (int i = arr.length-1 ; i >=0 ; i--) {
			System.out.print(arr[i] + " ");
		}
		// ayný array i büyükten küçüðe doðru nasýl sýralayabiliriz ?
		
		int arrTers[]=new int[arr.length]; // ilk array in uzunluðuna eþit yeni bir array oluþturdum 
		
		for (int i = 0; i < arrTers.length; i++) {
			arrTers[i]=arr[arr.length-1-i];
		}
		
		
		
		
	}

}
