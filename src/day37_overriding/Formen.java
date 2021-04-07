package day37_overriding;

public class Formen extends Isci{

	public String sorumluOldBolum;
	public String isim= "samet ";
	
	
	public static void main(String[] args) {
		
		
		 //	Inheritance de data türü olarak class ismi kullanýmý 
		 
		Formen fr1 =new Formen();
		 
		//fr1 objesini kullanarak formen ve bütün parent classlarýn class memberlarýný görebilirim 
		
		fr1.sorumluOldBolum="marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim+" "+fr1.sorumluOldBolum+" "+fr1.maas); // atama yapýlmayanlaara ilk hangi deðer atandýysa o o çýkar
		
		Isci fr2 =new Formen();// data türü olarak isci seçildiði için formen classýný göremem 
		fr2.bolum="kaynak atölyesi ";
		System.out.println(fr2.isim+" "+fr2.bolum+" "+fr2.maas); 
		/*
		 	bir objeden o variable a gitmek istiyorsak önce data türüne bakarýz yani Isci fr2 =new Formen(); için
		 		fr2 den isim e ulaþmak istiyorsak önce hangi classtan obje üretilmiþ ona bakarýz 
		 		ve parent larda birden çok ayný isimde variable varsa öne hangisi yakýnsa onu alýr 
		 	
		 	Formen fr1 =new Formen(); objesinden üretmiþ olsak isimi yazacak olsak önce formende isim var mý ona bakarýz sonra 
		 		iþçi classýnda var mý ona bakarýz yoksa personele bakarýz child dan parenta doðru çýkarýz 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
