package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		/*
		 * kul dan deðerler alarak int bir array oluþturun 
		 * önce kul dan gireceði sayý adedini almamýz lazým ki array i oluþturalým 
		 */

		Scanner scan= new Scanner (System.in);
		System.out.println("kaç sayýdan oluþan bir array istediðinizi giriniz");
		int uzunluk=scan.nextInt();
		
		 int arr[]= new int [uzunluk]; //
		 
		 System.out.println("lütfen saylarý giriniz ");
		 
		 for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
			 
		}
		 
		System.out.println(Arrays.toString(arr));
		
		
scan.close();		
	}

}
