package day34_Inheritance;

public class Isci extends Muhasebe {

	public static void main(String[] args) {
		
		Isci isci1 = new Isci();
		
		isci1.isim="�mer";
		isci1.soyisim="ayd�n";
		isci1.id=1001;
		isci1.izindeMi=false;
		isci1.saatUcreti=12;
		isci1.statu="i��i";
		isci1.maas=isci1.maasHesapla();
		
		System.out.println(isci1.id+" "+isci1.isim+" "+isci1.soyisim+" "+isci1.statu+" "+isci1.maas+"tl");

		/*
		 	bu derse kadar hangi class tan bilgi elde etmek istiyorsak o classtan obje olu�turduk
		 	
		 	inheritance ile bu mecburiyet ortadan kalkt� 
		 	Child classta olu�turdu�umuz obje ile t�m parent classlarda bulunan variable ve methodlar� inherit edebilirim 
		 	
		 */

		Isci isci2 = new Isci();
		

		isci2.isim="esad";
		isci2.soyisim="okumu�";
		isci2.id=1002;
		isci2.izindeMi=true;
		isci2.saatUcreti=15;
		isci2.statu="i��i";
		isci2.maas=isci2.maasHesapla();
		
		System.out.println(isci2.id+" "+isci2.isim+" "+isci2.soyisim+" "+isci2.statu+" "+isci2.maas+"tl");


	
	
	}

}
