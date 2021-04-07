package day37_overriding;

public class Isci extends Personel {

	public String bolum= "kaynak";
	public int maas=5000;
	public String isim="mesut";
	
	
	public int maasHesapla () {
		return 30*8*15;
	}
	
	public void mesai () {
		System.out.println("iþçiler günlük 8 saat çalýþýr ");
	}
	
	/*
	 	Overloading 
	 		Ayný isimde ama farklý method signaturelara sahip methodlar //isimleri ayný sign farklý olacak iþte
	 
	 */
	public int maasHesapla(int gunSayisi) {
		return gunSayisi*8*15;
	}
	
	public int maasHesapla(int gunlukCalismaSaati, int gunSayisi) {
		return gunSayisi*gunlukCalismaSaati*15;
	}
	public int maasHesapla(int gunlukCalismaSaati, int gunSayisi, int saatUcreti) {
		return gunlukCalismaSaati*gunSayisi*saatUcreti;
				
	}
}
