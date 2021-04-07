package day43_interfaces;

public interface Interface01 {
	
	public void motor(); //interface i�inde abstract methodlar ve �ZEL concrete methodlar olabilir
	 
	/*
	 	bir abstract methodun bodysi olmad���ndan o methodun
	 		istenen dinamik �zelli�i nas�l ger�ekle�tirece�i bilemmiz m�mk�n de�il sadece ne yapaca��n� biliriz
	 	
	 	bu method bize �unu anlat�r: 
	 		beni inherit eden her concrete class �n dinamik motor �zelli�i olmal�d�r
	 */
	
	void vites(); //beni inherit eden her concrete class �n dinamik vites �zelli�i olmal�d�r
	
	abstract void kasa(); //beni inherit eden her concrete class �n dinamik kasa �zelli�i olmal�d�r
	
	//Interface de sadece ABSTRACT, PUBL�C methodlar olur 
			// bu iki keyworduYAZSAK DA YAZMASAK DA java t�m methodlar� bu �ekilde kabul eder 

	/*
	 	javada interface olu�turmak istiyorsak ba�tan se�meliyiz 
	 		bir class sonradan baz� keywordler yaz�larak interface yap�lamaz
	 */
	
	String ISIM="samet"; // java isim kelimesini italic ve bold yapt� 
								// demek ki t�m variable lar final ve static tir ve bu y�zden de�er atamak zorunday�z	

}














