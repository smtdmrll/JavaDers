package day16_forloop;

import java.util.Iterator;
import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		/*
		 * kul dan pozitif iki tam sayý alýn 
		 * aldýðýnýz deðerlerden küçük olandan baþlayýp büyük olana kadar 
		 * tüm sayýlarý yan yana (virgülle ayrýlarak) yazdýrýn 
		 */
		Scanner scan= new Scanner (System.in);
		System.out.println("iki adet pozitif sayý girin ");
		int sayi1= scan.nextInt();
		int sayi2=scan.nextInt();
		
		int kucukSayi=0;
		int buyukSayi=0;
		
		
		if (sayi1>sayi2) {
			buyukSayi=sayi1;
			kucukSayi=sayi2;
			
		}else {
			buyukSayi=sayi2;
			kucukSayi=sayi1;
		}
		for (int i = kucukSayi ; i<=buyukSayi ; i++) {
			System.out.print(i+",");
			
		}
	}

}
