package day04;

public class C2_ModulesOperatoru {

	public static void main(String[] args) {
		
		// modulus operat�r� b�lme i�leminde kalan� verir 
		
		//15 tek mi �ift mi  15/2 kalan 1 tek
		//25 ��e b�ln�r m� 25/3 kalan 1 b�l�nemez kontrol edimi 
		//herhangi bir say�n�n 7 ile b�l�m�n� kontrol etmek i�in modulus i�lemini kullan�r�z 
		
		
		int kalan=15%4;
		
		System.out.println(kalan);

		//856 n�n birler basama�� ka� ? 6 
		int sayi=856;
		int birBasamagi=sayi%10;
		
		System.out.println(birBasamagi); //=6
		
		//856 onlar basama�� ka� 5
		
		//say�n�n birler basama��n� bulduktan sonra onlar basama��n� bulmak i�in birler basama��ndan
		// birler basama��ndan kurtulmak gerekiyor 
		//birler basama��ndan kurtulmak i�in 10 a b�leriz ��nk� int sadece tam say� al�r 
		
		sayi/=10;
		
		
		
		System.out.println("on a b�l�nd�kten sonra de�eri " +sayi);
		
		int onlarBasamagi= sayi %10;
		
		System.out.println("onlar basma�� "+ onlarBasamagi);
		
		//y�<ler i�in de ayn� �eyi yapar�z 
		
		sayi/=10 ;
		
		System.out.println("2. defa on a b�ld�kten sonra "+sayi);
		
		int yuzlerBasamagi= sayi%10 ;
		
		System.out.println(yuzlerBasamagi);
		
		
		
		
		

	}

}
