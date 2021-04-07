package day42_abstractclasses;

public class Isci extends Personel{
	
	public static void main(String[] args) {
		Isci isci1=new Isci();
		isci1.maasHesapla();
		isci1.mesaiBilgisi();
		isci1.isim="r�meysa"; //abstract parent class daki variable lar� istersem kullan�r�m
		System.out.println(isci1.isim);
		isci1.ozelSigorta(); // bastract parent classdaki concrete metodu istersem kullan�r�m 
							//bu metodu override etmedik ama parent child ili�kisi ile kullanabildik 
	}

	@Override
	public void maasHesapla() {
		/*
		  	parent classdaki abs methodu implement(uyarlama) etti
			
			1- sen abstract bir class� parent edindiysen mutlaka oradaki abs metodu implement edtmelesin
			2- parent cllasdali methodda body olmad��� i�in onu kullanman�n anlam� yok 
				biz child classda body olan method (concrete) kullan�p i�lem yapmal�y�z 
		 */
		
		System.out.println("i��iler i�in maa� 5000");
		
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("i��iler g�nl�k sekiz saat �al���r");
		
	}
}
