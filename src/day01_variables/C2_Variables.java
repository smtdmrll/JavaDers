package day01_variables;

public class C2_Variables {
	
	public static void main(String []args) {
		
		int sayi; //; yaz�m dilindeki nokta gibidir. java noktal� virg�l� g�r�nce o sat�rdaki kod dizimini anlar 
		 
		sayi=27;
		
		System.out.print(sayi);//e�er println de�il de print yazarsak yazd�rma i�leminden 
							// sonra alt sat�ra ge�mez
		
		char ilkHarf='M';
		
		System.out.println(ilkHarf); //println yaz�nca yazma i�leminde sonra alt sat�ra ge�er
		
		double sayiDouble= 5.34;
		
		System.out.println(sayiDouble);
		
		System.out.println(sayi+ sayiDouble);//
		
		System.out.println(sayi+ ilkHarf);// b�y�k M harfinin ASCII de�eri ile toplad�
											// ASCII M=77 + sayi= 27 =104
		//toplama i�leminde char de�i�keni kllan�rsa ASCII kodu kullan�r 
		
		System.out.println(sayi+sayiDouble + ilkHarf);
	}
	
}
