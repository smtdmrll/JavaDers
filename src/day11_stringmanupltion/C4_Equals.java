package day11_stringmanupltion;

public class C4_Equals {

	public static void main(String[] args) {
		/*
		 * str.equals(str2) str ve str2 yi kar��la�t�r�r ve String olarak e�it olup olmad�klar�na bakar 
		 * sonu� olarak true or false d�nd�r�r (sonu�)
		
			baz� metodlar�n yapt�klar� i�lem ile d�nd�rd�kleri sonu� farkl� olabilir
			bir metoda git ali ismindeki elementi sil deriz, 
			o da gidip ali yi bulur ve siler 
			bunu ��yle benzetebilir aliyi �ld�r dedik �ld�rd� �ld�rmesi i�in ispat� olarak bir par�a getirir
			
		 */
		String str="Ali can";
		String str2="Ali can";
		
		//str ile str2 inin e�it olup olmad���n� yazd�r�n 
		
		System.out.println(str.equals(str2)); // true yazd�r�r
		
		System.out.println(str.equals(str2)? "e�it": "e�it de�il");
		
		//javada str�ngler case sensitive dir(b�y�k k���k harf duyarl�d�r) bir harf bile farkl� b�y�kl�kte olsa Stringler e�it olmaz.
		
		
		
		
		

	}

}
