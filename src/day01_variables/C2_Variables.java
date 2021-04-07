package day01_variables;

public class C2_Variables {
	
	public static void main(String []args) {
		
		int sayi; //; yazým dilindeki nokta gibidir. java noktalý virgülü görünce o satýrdaki kod dizimini anlar 
		 
		sayi=27;
		
		System.out.print(sayi);//eðer println deðil de print yazarsak yazdýrma iþleminden 
							// sonra alt satýra geçmez
		
		char ilkHarf='M';
		
		System.out.println(ilkHarf); //println yazýnca yazma iþleminde sonra alt satýra geçer
		
		double sayiDouble= 5.34;
		
		System.out.println(sayiDouble);
		
		System.out.println(sayi+ sayiDouble);//
		
		System.out.println(sayi+ ilkHarf);// büyük M harfinin ASCII deðeri ile topladý
											// ASCII M=77 + sayi= 27 =104
		//toplama iþleminde char deðiþkeni kllanýrsa ASCII kodu kullanýr 
		
		System.out.println(sayi+sayiDouble + ilkHarf);
	}
	
}
