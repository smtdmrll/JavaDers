package day16_forloop;

public class C4_ForLoop4 {

	public static void main(String[] args) {
		/*
		 * 50 den b�y�k 150 den k���k tam say�lardan 
		 * 7 ile tam b�l�nenleri toplay�p 
		 * sonucu yazd�r�n 
		 */
		/*
		int sayi=0;
		
		for(int i=56; i<150 ; i+=7 )  {
			sayi+= i;
			
		}
		System.out.println(sayi);
		
		ikinci ��z�m a�a��da
		
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
