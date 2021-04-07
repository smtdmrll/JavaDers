package day09_ternary;

public class C1_Ternary {

	public static void main(String[] args) {
		/*
		 * if else gibidir þart soru iþareti doðruysa birinci sýradaki yanlýþsa iki nokta üst üsteden
		 * sonra ki ikinci kýsým
		 * ternary iþlemi bir sonuç dönderdiðinden bir variable oluþturup 
		 * baþýna assign yapmadan hata verir 
		 */

		int a=10;
		
		String sonuc = a%2 == 0 ? "çift sayýdýr" : "tek sayýdýr";
		System.out.println(sonuc);
	
		
		/*
		 * bir variable a assign etmek istemezsem o zaman syso içine yazabilirim 
		 */
		System.out.println(a%2 == 0 ? "çift sayýdýr" : "tek sayýdýr");
		
		// baþýna açýklama yazmak istersen ternary iyi paranteze almak zorundasýn çünkü o komple bir iþlemdir.
		
		System.out.println("iþlem sonucu "+ (a%2 == 0 ? "çift sayýdýr" : "tek sayýdýr"));
	
		
		
		
		
		
		
		
	}

}
