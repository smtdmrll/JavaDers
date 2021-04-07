package day19_dowhileloop;

import java.util.Scanner;

public class C5_DoWhileLoop3 {

	public static void main(String[] args) {
		/*
		 * Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki
		 * sartlara gore kontrol edin ve sifredeki hatalari yazdirin. Kullanici gecerli
		 * bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde
		 * �Sifreniz Kabul edilmistir� yazdirin. - Sifre kucuk harf icermelidir - Sifre
		 * buyuk harf icermelidir - Sifre ozel karakter icermelidir - Sifre en az 8
		 * karakter olmalidir.
		 */

		Scanner scan = new Scanner(System.in);
		String sifre = "";
		int sonuc;
		do {
			System.out.println("l�tfen �ifrenizi giriniz ");
			sifre = scan.nextLine();

			sonuc = kucukHarfVarMi(sifre) + buyukHarfVarMi(sifre) + ozelKarakterVarMi(sifre) + uzunlukUygunMu(sifre);
		} while (sonuc != 4);

		System.out.println("giri� ba�ar�l� �ifreniz kaydedilmi�tir ");
scan.close();	
	}

	public static int uzunlukUygunMu(String sifre) {
		int sonucUzunluk = 0;
		if (sifre.length() < 8) {
			System.out.println("�ifre en az 8 karakter olmal�d�r ");
		} else {
			sonucUzunluk = 1;
		}

		return sonucUzunluk;
	}

	public static int ozelKarakterVarMi(String sifre) {

		int flagOzel = 0;
		int index = 0;

		while (index < sifre.length()) {
			if (sifre.charAt(index) >= ' ' && sifre.charAt(index) <= '/') {
				flagOzel = 1;
			}
			index++;
		}
		if (flagOzel == 0) {
			System.out.println("�ifre �zel karakter harf i�ermelidir ");
		}
		return flagOzel;
	}

	public static int buyukHarfVarMi(String sifre) {

		int flagBuyuk = 0;
		int index = 0;

		while (index < sifre.length()) {
			if (sifre.charAt(index) >= 'A' && sifre.charAt(index) <= 'Z') {
				flagBuyuk = 1;
			}
			index++;
		}
		if (flagBuyuk == 0) {
			System.out.println("�ifre b�y�k harf i�ermelidir ");
		}
		return flagBuyuk;
	}

	public static int kucukHarfVarMi(String sifre) { // sifre = MehmetJava123
		int flagKucuk = 0;
		int index = 0;

		while (index < sifre.length()) {
			if (sifre.charAt(index) >= 'a' && sifre.charAt(index) <= 'z') {
				flagKucuk = 1;
			}
			index++;
		}
		if (flagKucuk == 0) {
			System.out.println("�ifre k���k harf i�ermelidir ");
		}

		return flagKucuk;

	}

}
