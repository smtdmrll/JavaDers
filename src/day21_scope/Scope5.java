package day21_scope;

public class Scope5 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 5; i++) {
			
			String isim="Ayse";
			System.out.println(i+ " "+isim);
			
		}
//		System.out.println(isim); //  Loop i�inde olu�turulan variable lar loopa �zeldir ve loop d���nda kullan�lamaz 
	
		for (int i = 0; i < 5; i++) {
			System.out.print(i +" ");
		}
//		System.out.println(i);
		
		int count=0;  // methoda ait lokal variable d�r 
					// de�er atamadan kullanmaya �al���rsan CTE al�rs�n 
		while(count<5) {
			System.out.println(count);
			count++;
			
		}
	}

}
