package day43_interfaces;

public interface Interface02 {
	
	/*
	 	buradaki default ve static bizim bildi�imiz defaultla static ile ayn� m� 
	 		cevap HAYIR
	 		
	 	bizim bildi�imiz default acces modifierd�
	 		bir methodda birden fazla acces modifier olur mu OLMAZ
	 		bizim interfacete olu�turdu�umuz t�m methodlar zaten public ve abstract t�r 

	 	interfacete default keyword kullanarak concerete method olu�turabiliriz(yani bodysi olan)
	 		buradaki default keywordu acces modifier de�il javan�n �zel bir ��z�m�d�r    
	 		buradaki default keyword yaz�ld��� methodun concrete oldu�unu belirtir 
	 */
	
	public default void deneme() {
		System.out.println("default lkeyword lu method �al��t� ");
	}
	
	static void deneme2() {
		System.out.println("static keywordlu method �al��t�");
	}
	/*
	 	yukar�da default keywordu i�in s�ylenenlerinin hepsi static i�in de ge�erlidir. 
	 	
	 	static ve default keyword� kullanarak olu�turdu�umuz methodlar override edilmek ZORUNDA DE��LD�R
	 */
	
}
