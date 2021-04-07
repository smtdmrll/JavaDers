package day37_overriding;

public class GeciciIsci extends Isci {

	public String calistigiBolum = "yemekhane ";

	public static void main(String[] args) {

		/*
		  		Overriding method 
		  			bir child classda parent classdan miras al�nan metodu de�i�tirmeye overriding denir
		  			
		 	farkli bir isim yapsam override yapmazsam parent sinifindan metod ve gecici siniftan
		  		metod gozukur, birisi degistirebilir, yanlislikla isciye saat ucretini 15 ile carpabilir
	      		boyle yaparak parent class daki metodu gecersiz kilarak onun kullanimini burada engelliyoru
		 */

		GeciciIsci gi1 = new GeciciIsci();
		System.out.println(gi1.maasHesapla());
		// i��i class�ndaki ayn� metodu birebir(ayn� meth sign. sahip) buraya yazarak
		// burda kullan�rken i��i class�ndaki metodu ge�ersiz k�lar
		
		gi1.mesai();
	}
	public int maasHesapla() { 

		return 30 * 8 * 10;
	}

	@Override // bunun ad� annotation java otomatik olu�turdu 
	
	public void mesai() {//source k�sm�ndan otomatik override yappabiliriz
		
		//super.mesai();
		System.out.println("ge�i�i i��iler hafta 25 saat �al���r ");
	}
	
	/*
	 	annotation: a��klam, dipnot s�zl�k anlam� 
	 	
	 	Annotation sadece bir a��klama de�ildir, override yapt���m�z methodu s�rekli kontrol eder ve 
	 		parent classtaki overriden method signature � de�i�tirilirse CTE verir.
	 		Yani @override yap�yorsan parent classtakitle mutlaka ayn� olacak ve burda parent class� silmi� yani burdaki 
	 		methodu kullanm�� olacan 
	 		
	 		
	 		java 31.sat�rda(@override) kodu inceleyenler i�in bir a��klama getiriyor 
	 		
	 		E�er override edilen parent classdaki methodun(overriden=override edilmi� demek) da �al��mas�n� istiyorsak
	 			super.overridenMethodIsmi yazar�z  
	 		
	 		E�er overriding methodda super. yaz�lmazsa overriden method �al��maz (const. g�r�nmeyen super() var ondan farkl�)
	 	
	 		Acces modifier 
	 		overriding methodun acces modif i ovverriden methodun acces modifinden daha dar olamaz 
	 		yani parent publicse child default olamaz
	 		ama parent defaultsa child public olabilir 
	 		
	 		Return Type
	 		overriding methodun return type � primtive veya void ise 
	 		overriding methodun return type i da ayn� olmal� 
	 		
	 			e�er return type non-p ise  
	 			(overriding methodun return type � ) IS-A (overriden methodun return type i) olmak zorunda 
	 			YAN� RETURN TYPE DA EN B�Y�K PARENT OLMALI 
	 			ACCESTE CH�LD B�Y�K YA DA E��T RETURNDA PARENT B�Y�K YA DA E��T 
	 			
	 */

}


























































