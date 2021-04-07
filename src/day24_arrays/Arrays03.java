package day24_arrays;

import java.util.Iterator;

public class Arrays03 {

	public static void main(String[] args) {
		// verilen bir arrayin tüm elemanlarýný toplayan bir prog yazýn 

		int arr[]= {10,15,2,45,78};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			toplam +=arr[i];
			
		}
		System.out.println(toplam);
		
		//verilen elemanlarýný toStringsiz yazdýr 
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
