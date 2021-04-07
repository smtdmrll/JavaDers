package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {
	
	public static void main(String[] args) {
		int count=1;
		
		Scanner scan = new Scanner(System.in);
		
		while(count<100) {
		System.out.println("bölünecek tam sayýyý yazýn");
		int sayi1 =scan.nextInt();
		System.out.println("böleccek sayýyý gir");
		int sayi2= scan.nextInt();
		/*
		java exceptions ý handle etmek için bir çözüm üretmezsek java exception ile karþýlatýðýnda 
	     	çalýþmayý durdurur buna (stop execution) deriz 
			throws exception (exception fýrlatýr)(problemiin kaynaðýný bize gösterir)
			
			tüm application durmuþ olur...
			müþterinin kullandýðý bir uygulama için bu KABUL EDÝLEMEZ 
			bunun için kod yazan kiþi muhtemel sorunlarý ön görmeli ve javaya bu sorunla handle edebilmesi için 
				yol göstermelidir
			
		  */
		 
		System.out.println("iþlem no: "+ count);
		try {
			System.out.println("bölme iþlem sonucu : "+sayi1/sayi2);
		
		}catch (ArithmeticException e) {
			System.out.println("sayýyý sýfýra bölemezsin ");
		}
		
		
		
		
		count++;
		}
	}
}
