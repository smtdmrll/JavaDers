package day25_arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// iki array in e�it oldu�unu kontrol etme

		int arr1[] = { 10, 25, 5, 20 };

		int arr2[] = { 25, 10, 20, 5 };

		Arrays.equals(arr1, arr2);
		System.out.println(Arrays.equals(arr1, arr2));

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.equals(arr1, arr2)); // iki array in birbirine e�it olmas� i�in hem uzunluklar�,
														// elemanlar�, ve e�it elemanlar�n indexleri e�it olmal�d�r 

	}

}
