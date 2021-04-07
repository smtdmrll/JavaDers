package day18_whileloop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		/*
		 * While : iken, oldu�u s�rece
		 * 
		 * while dan �ne ba�lang�� de�eri sunmak zorunday�m biti� �art� sunmak
		 * zorunday�m art�� de�eri vermek zorudnay�m
		 * 
		 * Soru: 10 dan 30 a kadar olan say�ardan 4 ile b�l�nebilenleri aralar�nda 1
		 * bo�luk olacak �ekilde yan yana yazd�r�n
		 * 
		 */

		// �nce for loop

		for (int i = 10; i <= 30; i++) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}
		}

		// ayn�s�n�n while loop ile yap�m�

		int sayi = 10; // 1. �art� ger�ekle�tirdim (ba�lang�� de�eri )
		while (sayi < 30) { // 2. �art� ger�ekle�tridim (biti� �art�)
			if (sayi % 4 == 0) {
				System.out.print(sayi + " ");
			}
			sayi++;// 3. �art� ger�ekle�tirdim(art�� de�eri) // e�er increment yapmazsak while
															// s�rekli d�ner ram in anas� a�lar bir �ey yazd�rmaz 34. sat�ra ge�mez
		}
	}

}
