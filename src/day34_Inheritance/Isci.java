package day34_Inheritance;

public class Isci extends Muhasebe {

	public static void main(String[] args) {
		
		Isci isci1 = new Isci();
		
		isci1.isim="ömer";
		isci1.soyisim="aydýn";
		isci1.id=1001;
		isci1.izindeMi=false;
		isci1.saatUcreti=12;
		isci1.statu="iþçi";
		isci1.maas=isci1.maasHesapla();
		
		System.out.println(isci1.id+" "+isci1.isim+" "+isci1.soyisim+" "+isci1.statu+" "+isci1.maas+"tl");

		/*
		 	bu derse kadar hangi class tan bilgi elde etmek istiyorsak o classtan obje oluþturduk
		 	
		 	inheritance ile bu mecburiyet ortadan kalktý 
		 	Child classta oluþturduðumuz obje ile tüm parent classlarda bulunan variable ve methodlarý inherit edebilirim 
		 	
		 */

		Isci isci2 = new Isci();
		

		isci2.isim="esad";
		isci2.soyisim="okumuþ";
		isci2.id=1002;
		isci2.izindeMi=true;
		isci2.saatUcreti=15;
		isci2.statu="iþçi";
		isci2.maas=isci2.maasHesapla();
		
		System.out.println(isci2.id+" "+isci2.isim+" "+isci2.soyisim+" "+isci2.statu+" "+isci2.maas+"tl");


	
	
	}

}
