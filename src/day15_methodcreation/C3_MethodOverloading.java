package day15_methodcreation;

public class C3_MethodOverloading {

	public static void main(String[] args) {
		/*
		 * javada ayn� isimle birden fazla method olu�turulursa buna OVERLOAD�NG denir
		 * 
		 * overloading yapabilmek i�in Method Signature lar�n farkl� olmas� gerekir
		 * 
		 * Method Signature = isim +parametre say�s� + parametre data turu
		 * 
		 * birbiriniz kapsayan data t�rleri oldu�unda java en optimum ��z�m� �retir 
		 * (birebir uyan varsa o methodu �al��t�r�r, bire bir uyan yoksa en fazla uyan methodu kullan�r 
		 * 
		 * e�er kapsayan bir method da bulamazsa java CTE verir 
		 */

		toplama("ali", "veli"); // birinciyi birinciyle ikinciyi ikinciyle kar��la�t�r�r b�y�k tipten k���k data
								// tipine ge�mez

		toplama(2, 5); //int method sonucu7 double double da alabilirdi ama hangisinin oyutu k���kse onu se�er 
		toplama(2.3, 5);//double int  method sonucu7.3
		toplama(2.3, 5.0);//double method sonucu7.3
		toplama('a', 'b');//195 ascii e�er char method olmasayd� char a en yak�n olan integer � se�erdi // int method sonucu195
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
