package day16_forloop;

public class C4_ForLoop4 {

	public static void main(String[] args) {
		/*
		 * 50 den bðyðk 150 den küçük tam sayýlardan 
		 * 7 ile tam bölünenleri toplayýp 
		 * sonucu yazdýrýn 
		 */
		/*
		int sayi=0;
		
		for(int i=56; i<150 ; i+=7 )  {
			sayi+= i;
			
		}
		System.out.println(sayi);
		
		ikinci çözüm aþaðýda
		
		*/
		
		int toplam=0;
		
		for(int i=56; i<150 ; i++ )  {
			
			if (i%7==0) {
				toplam+=i;
			}
		}
		System.out.println(toplam);
		
		
		
		
		
		
	}

}
