package day36_inheritanceoverriding;

public class UstaBasi extends �sci{
	
	public String bolum="tak�mhane";
	public int sorOldIsciSay = 10;
	
	
	public static void main(String[] args) {
	
		UstaBasi ub1= new UstaBasi();				
		//objeyi torun class�ndan olu�turunxa �� classa da ula�abiliriz 
		
		
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorOldIsciSay);
		
		System.out.println(ub1.saatUcreti);
		System.out.println(ub1.isim);
	
		�sci ub2= new UstaBasi();
		/*
		 extends ile birbirine ba�l� olan classlarda IS A relation olan data t�rleri(yani classlar)
		  	iste�e ba�l� olarak kullan�labilir
		 daha geni� data t�r� yazman�n avantaj� kapsam�n daha geni� olmas� 
		 	
		 daha geni� data t�r� yazman�n dezavantaj�
		 data t�r� olarak se�ti�imiz class ve parent lar�na ait datalara ula�abiliriz 
		 */
		System.out.println(ub2.departman);//i��i class�ndan ald�k 
		System.out.println(ub2.izindeMi);//personel class�ndan ald�k 
		
		Personel ub3= new UstaBasi();
		
		
		
		
		
		
		
	}
}
