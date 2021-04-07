package day18_whileloop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		/*
		 * While : iken, olduðu sürece
		 * 
		 * while dan öne baþlangýç deðeri sunmak zorundayým bitiþ þartý sunmak
		 * zorundayým artýþ deðeri vermek zorudnayým
		 * 
		 * Soru: 10 dan 30 a kadar olan sayýardan 4 ile bölünebilenleri aralarýnda 1
		 * boþluk olacak þekilde yan yana yazdýrýn
		 * 
		 */

		// önce for loop

		for (int i = 10; i <= 30; i++) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}
		}

		// aynýsýnýn while loop ile yapýmý

		int sayi = 10; // 1. þartý gerçekleþtirdim (baþlangýç deðeri )
		while (sayi < 30) { // 2. þartý gerçekleþtridim (bitiþ þartý)
			if (sayi % 4 == 0) {
				System.out.print(sayi + " ");
			}
			sayi++;// 3. þartý gerçekleþtirdim(artýþ deðeri) // eðer increment yapmazsak while
															// sürekli döner ram in anasý aðlar bir þey yazdýrmaz 34. satýra geçmez
		}
	}

}
