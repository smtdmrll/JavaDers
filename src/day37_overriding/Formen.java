package day37_overriding;

public class Formen extends Isci{

	public String sorumluOldBolum;
	public String isim= "samet ";
	
	
	public static void main(String[] args) {
		
		
		 //	Inheritance de data t�r� olarak class ismi kullan�m� 
		 
		Formen fr1 =new Formen();
		 
		//fr1 objesini kullanarak formen ve b�t�n parent classlar�n class memberlar�n� g�rebilirim 
		
		fr1.sorumluOldBolum="marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim+" "+fr1.sorumluOldBolum+" "+fr1.maas); // atama yap�lmayanlaara ilk hangi de�er atand�ysa o o ��kar
		
		Isci fr2 =new Formen();// data t�r� olarak isci se�ildi�i i�in formen class�n� g�remem 
		fr2.bolum="kaynak at�lyesi ";
		System.out.println(fr2.isim+" "+fr2.bolum+" "+fr2.maas); 
		/*
		 	bir objeden o variable a gitmek istiyorsak �nce data t�r�ne bakar�z yani Isci fr2 =new Formen(); i�in
		 		fr2 den isim e ula�mak istiyorsak �nce hangi classtan obje �retilmi� ona bakar�z 
		 		ve parent larda birden �ok ayn� isimde variable varsa �ne hangisi yak�nsa onu al�r 
		 	
		 	Formen fr1 =new Formen(); objesinden �retmi� olsak isimi yazacak olsak �nce formende isim var m� ona bakar�z sonra 
		 		i��i class�nda var m� ona bakar�z yoksa personele bakar�z child dan parenta do�ru ��kar�z 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
