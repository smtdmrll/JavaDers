package day36_inheritanceoverriding;

public class UstaBasi extends Ýsci{
	
	public String bolum="takýmhane";
	public int sorOldIsciSay = 10;
	
	
	public static void main(String[] args) {
	
		UstaBasi ub1= new UstaBasi();				
		//objeyi torun classýndan oluþturunxa üç classa da ulaþabiliriz 
		
		
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorOldIsciSay);
		
		System.out.println(ub1.saatUcreti);
		System.out.println(ub1.isim);
	
		Ýsci ub2= new UstaBasi();
		/*
		 extends ile birbirine baðlý olan classlarda IS A relation olan data türleri(yani classlar)
		  	isteðe baðlý olarak kullanýlabilir
		 daha geniþ data türü yazmanýn avantajý kapsamýn daha geniþ olmasý 
		 	
		 daha geniþ data türü yazmanýn dezavantajý
		 data türü olarak seçtiðimiz class ve parent larýna ait datalara ulaþabiliriz 
		 */
		System.out.println(ub2.departman);//iþçi classýndan aldýk 
		System.out.println(ub2.izindeMi);//personel classýndan aldýk 
		
		Personel ub3= new UstaBasi();
		
		
		
		
		
		
		
	}
}
