package day17_forloop;

import java.util.Scanner;

public class C2_ForLoop2 {
	public static void main(String[] args) {
		/*
		 * Kullanicidan bir tamsayi girmesini isteyin sayi negatif veya sifirsa
		 * "Lutfen pozitif bir tamsayi giriniz" yazdirin Girilen Sayinin rakamlar
		 * toplamini ayri bir method'da hesaplayin
		 * 
		 * Main method icinde Kullanicidan bir sinir deger isteyin rakamlar toplami
		 * sinir degerden buyukse
		 * "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 * degilse
		 * "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 * yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir tam sayý giriniz");
		int sayi = scan.nextInt();
		System.out.println("lütfen sinir deger için bir tam sayý giriniz");
		int sinir  = scan.nextInt();

		if (sayi <= 0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
		} else {
//			rakamlarTopHesapla(sayi);// girilen sayýnýn rakamlar top int return type da int olacak void deðil 
			/*
			 * 1) direkt yazdýrabilirim syso rakamlarToplamihesapla
			 * 2) kýyas yapabilirim
			 * 3) deðiþkene assign edebilirim  
			 */
			
			if (rakamlarTopHesapla(sayi)>sinir) {
				System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk");
			} else {
				System.out.println( "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil");
			}
		}
	}

	public static int rakamlarTopHesapla(int sayi) { //yazdýrmak için void rakamlar top sayý olarak kullanmak için int
		
		int rakamlarTop=0;
		String sayi2=sayi+""; // string method kullanabilmek için sayiyi string le topladýk int.length yok diye 
		
		for (int i = 1; i < sayi2.length() ; i++) {
			rakamlarTop+= sayi%10;
					sayi/=10;
			
		}
		
		return rakamlarTop;  //yazdýrmak içinde döndürmek istediðimiz için bunu yazmak zorundayýz 
		
	}

	

}
