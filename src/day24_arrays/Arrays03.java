package day24_arrays;

import java.util.Iterator;

public class Arrays03 {

	public static void main(String[] args) {
		// verilen bir arrayin t�m elemanlar�n� toplayan bir prog yaz�n 

		int arr[]= {10,15,2,45,78};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			toplam +=arr[i];
			
		}
		System.out.println(toplam);
		
		//verilen elemanlar�n� toStringsiz yazd�r 
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
