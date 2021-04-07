package day37_overriding;

public class GeciciIsci extends Isci {

	public String calistigiBolum = "yemekhane ";

	public static void main(String[] args) {

		/*
		  		Overriding method 
		  			bir child classda parent classdan miras alýnan metodu deðiþtirmeye overriding denir
		  			
		 	farkli bir isim yapsam override yapmazsam parent sinifindan metod ve gecici siniftan
		  		metod gozukur, birisi degistirebilir, yanlislikla isciye saat ucretini 15 ile carpabilir
	      		boyle yaparak parent class daki metodu gecersiz kilarak onun kullanimini burada engelliyoru
		 */

		GeciciIsci gi1 = new GeciciIsci();
		System.out.println(gi1.maasHesapla());
		// iþçi classýndaki ayný metodu birebir(ayný meth sign. sahip) buraya yazarak
		// burda kullanýrken iþçi classýndaki metodu geçersiz kýlar
		
		gi1.mesai();
	}
	public int maasHesapla() { 

		return 30 * 8 * 10;
	}

	@Override // bunun adý annotation java otomatik oluþturdu 
	
	public void mesai() {//source kýsmýndan otomatik override yappabiliriz
		
		//super.mesai();
		System.out.println("geçiçi iþçiler hafta 25 saat çalýþýr ");
	}
	
	/*
	 	annotation: açýklam, dipnot sözlük anlamý 
	 	
	 	Annotation sadece bir açýklama deðildir, override yaptýðýmýz methodu sürekli kontrol eder ve 
	 		parent classtaki overriden method signature ý deðiþtirilirse CTE verir.
	 		Yani @override yapýyorsan parent classtakitle mutlaka ayný olacak ve burda parent classý silmiþ yani burdaki 
	 		methodu kullanmýþ olacan 
	 		
	 		
	 		java 31.satýrda(@override) kodu inceleyenler için bir açýklama getiriyor 
	 		
	 		Eðer override edilen parent classdaki methodun(overriden=override edilmiþ demek) da çalýþmasýný istiyorsak
	 			super.overridenMethodIsmi yazarýz  
	 		
	 		Eðer overriding methodda super. yazýlmazsa overriden method çalýþmaz (const. görünmeyen super() var ondan farklý)
	 	
	 		Acces modifier 
	 		overriding methodun acces modif i ovverriden methodun acces modifinden daha dar olamaz 
	 		yani parent publicse child default olamaz
	 		ama parent defaultsa child public olabilir 
	 		
	 		Return Type
	 		overriding methodun return type ý primtive veya void ise 
	 		overriding methodun return type i da ayný olmalý 
	 		
	 			eðer return type non-p ise  
	 			(overriding methodun return type ý ) IS-A (overriden methodun return type i) olmak zorunda 
	 			YANÝ RETURN TYPE DA EN BÜYÜK PARENT OLMALI 
	 			ACCESTE CHÝLD BÜYÜK YA DA EÞÝT RETURNDA PARENT BÜYÜK YA DA EÞÝT 
	 			
	 */

}


























































