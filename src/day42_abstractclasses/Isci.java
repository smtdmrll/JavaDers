package day42_abstractclasses;

public class Isci extends Personel{
	
	public static void main(String[] args) {
		Isci isci1=new Isci();
		isci1.maasHesapla();
		isci1.mesaiBilgisi();
		isci1.isim="rümeysa"; //abstract parent class daki variable larý istersem kullanýrým
		System.out.println(isci1.isim);
		isci1.ozelSigorta(); // bastract parent classdaki concrete metodu istersem kullanýrým 
							//bu metodu override etmedik ama parent child iliþkisi ile kullanabildik 
	}

	@Override
	public void maasHesapla() {
		/*
		  	parent classdaki abs methodu implement(uyarlama) etti
			
			1- sen abstract bir classý parent edindiysen mutlaka oradaki abs metodu implement edtmelesin
			2- parent cllasdali methodda body olmadýðý için onu kullanmanýn anlamý yok 
				biz child classda body olan method (concrete) kullanýp iþlem yapmalýyýz 
		 */
		
		System.out.println("iþçiler için maaþ 5000");
		
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("iþçiler günlük sekiz saat çalýþýr");
		
	}
}
