package day24_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		/*
		 * Soru 1: Verilen 3 elemanli bir array�in tum elemanlarini bir soldaki konuma
		 * tasiyacak bir program yazin. 
		 * Ornek; array [1,2, 3] ise output [2, 3, 1] olacak
		 */

		int arr[] = { 1, 2, 3, 4, 5,6,7,8,9,10 };

		int temp = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {

//			arr[0]=arr[1];

			arr[i] = arr[i + 1];

		}

		arr[arr.length - 1] = temp;
		System.out.println(Arrays.toString(arr));

	}

}
