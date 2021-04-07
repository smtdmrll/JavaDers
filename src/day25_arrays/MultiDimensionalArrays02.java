package day25_arrays;

import java.util.Iterator;

public class MultiDimensionalArrays02 {

	public static void main(String[] args) {
		//verilen iki katl� bir array in t�m elemanlar�n�n toplam�n� bulal�m 
		/*
         * arr[0][0] = 1 // i = 0 olunca burasi
         * arr[0][1] = 2
         * arr[0][2] = 3 
         * 
         * arr[1][0] = 5 // i = 1 olunca burasi
         * arr[1][1] = 8 
         * 
         * arr[2][0] = 9 // i = 2 olunca burasi
         * arr[2][1] = 6
         * arr[2][2] = 5
         * arr[2][3] = 1 
         * 
         * meselaaaa
         */

		int arr[][]= {{1,2,3},{5,8},{9,6,5,1}};

		int toplam=0;
		for (int i = 0; i < arr.length; i++) { //outer arrayin lengthi 3
			
			for (int j = 0; j < arr[i].length; j++) {
				
				toplam+=arr[i][j];
			}
		}
		
		System.out.println("array deki t�m elemanlar�n toplam�: "+ toplam);
		
		
		
		
		
	}

}
