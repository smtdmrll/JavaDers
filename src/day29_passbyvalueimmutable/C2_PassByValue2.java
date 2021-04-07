package day29_passbyvalueimmutable;

public class C2_PassByValue2 {

	public static void main(String[] args) {
		/*
		 Soru2 : Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun.
  		- Method�da indirim uygulayip fiyati main method�da yazdirin
  		- Method�lari arka arkaya cagirip dogru calistiklarini kontrol edin
		 */
		
		double fiyat =100;
		
		System.out.println("%10 indirimli fiyat: "+indirimUygula10(fiyat));
		System.out.println("20 indirimli fiyat: "+indirimUygula20(fiyat));
		System.out.println("25 indirimli fiyat: "+indirimUygula25(fiyat));
		System.out.println("method call sonras� fiyat: "+ fiyat);
	}

	public static double indirimUygula25(double fiyat) {
		
		fiyat*=0.75;

		return fiyat;
	}

	public static double indirimUygula20(double fiyat) {
		
		fiyat*=0.8;

		return fiyat;
	}

	public static double indirimUygula10(double fiyat) {
		
		fiyat*=0.9;
		return fiyat;
	}

}
