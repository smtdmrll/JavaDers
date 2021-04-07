package day09_ternary;

public class C1_Ternary {

	public static void main(String[] args) {
		/*
		 * if else gibidir �art soru i�areti do�ruysa birinci s�radaki yanl��sa iki nokta �st �steden
		 * sonra ki ikinci k�s�m
		 * ternary i�lemi bir sonu� d�nderdi�inden bir variable olu�turup 
		 * ba��na assign yapmadan hata verir 
		 */

		int a=10;
		
		String sonuc = a%2 == 0 ? "�ift say�d�r" : "tek say�d�r";
		System.out.println(sonuc);
	
		
		/*
		 * bir variable a assign etmek istemezsem o zaman syso i�ine yazabilirim 
		 */
		System.out.println(a%2 == 0 ? "�ift say�d�r" : "tek say�d�r");
		
		// ba��na a��klama yazmak istersen ternary iyi paranteze almak zorundas�n ��nk� o komple bir i�lemdir.
		
		System.out.println("i�lem sonucu "+ (a%2 == 0 ? "�ift say�d�r" : "tek say�d�r"));
	
		
		
		
		
		
		
		
	}

}
