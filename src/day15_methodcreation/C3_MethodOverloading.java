package day15_methodcreation;

public class C3_MethodOverloading {

	public static void main(String[] args) {
		/*
		 * javada ayný isimle birden fazla method oluþturulursa buna OVERLOADÝNG denir
		 * 
		 * overloading yapabilmek için Method Signature larýn farklý olmasý gerekir
		 * 
		 * Method Signature = isim +parametre sayýsý + parametre data turu
		 * 
		 * birbiriniz kapsayan data türleri olduðunda java en optimum çözümü üretir 
		 * (birebir uyan varsa o methodu çalýþtýrýr, bire bir uyan yoksa en fazla uyan methodu kullanýr 
		 * 
		 * eðer kapsayan bir method da bulamazsa java CTE verir 
		 */

		toplama("ali", "veli"); // birinciyi birinciyle ikinciyi ikinciyle karþýlaþtýrýr büyük tipten küçük data
								// tipine geçmez

		toplama(2, 5); //int method sonucu7 double double da alabilirdi ama hangisinin oyutu küçükse onu seçer 
		toplama(2.3, 5);//double int  method sonucu7.3
		toplama(2.3, 5.0);//double method sonucu7.3
		toplama('a', 'b');//195 ascii eðer char method olmasaydý char a en yakýn olan integer ý seçerdi // int method sonucu195
	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("int method sonucu" + (sayi1 + sayi2));
	}

	public static void toplama(double sayi1, double sayi2) {
		System.out.println("double method sonucu" + (sayi1 + sayi2));
	}

	public static void toplama(int sayi1, double sayi2) {
		System.out.println("int double method sonucu" + (sayi1 + sayi2));
	}

	public static void toplama(double sayi2, int sayi1) {
		System.out.println("double int  method sonucu" + (sayi1 + sayi2));
	}

		public static void toplama(char char1, char char2) {
			System.out.println("char method sonucu" + (char1 + char2));
	}

	public static void toplama(String str1, String str2) {
		System.out.println("String method sonucu" + (str1 + str2));
	}

}
