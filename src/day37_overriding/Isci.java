package day37_overriding;

public class Isci extends Personel {

	public String bolum= "kaynak";
	public int maas=5000;
	public String isim="mesut";
	
	
	public int maasHesapla () {
		return 30*8*15;
	}
	
	public void mesai () {
		System.out.println("i��iler g�nl�k 8 saat �al���r ");
	}
	
	/*
	 	Overloading 
	 		Ayn� isimde ama farkl� method signaturelara sahip methodlar //isimleri ayn� sign farkl� olacak i�te
	 
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
