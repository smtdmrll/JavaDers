package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		/*
		 * kul dan de�erler alarak int bir array olu�turun 
		 * �nce kul dan girece�i say� adedini almam�z laz�m ki array i olu�tural�m 
		 */

		Scanner scan= new Scanner (System.in);
		System.out.println("ka� say�dan olu�an bir array istedi�inizi giriniz");
		int uzunluk=scan.nextInt();
		
		 int arr[]= new int [uzunluk]; //
		 
		 System.out.println("l�tfen saylar� giriniz ");
		 
		 for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
			 
		}
		 
		System.out.println(Arrays.toString(arr));
		
		
scan.close();		
	}

}
