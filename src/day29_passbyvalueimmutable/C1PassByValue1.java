package day29_passbyvalueimmutable;

public class C1PassByValue1 {

	public static void main(String[] args) {
		// passbyvalue ve passbyreference

		/*
		 * Soru : Verilen bir fiyat icin %10 indirim yapan bir method olusturun. -
		 * Method�da indirim uygulanan fiyati yazdirin - Method Call sonrasi original
		 * fiyati yazdirin ve method�da yapilan degisikligin orginal degeri degistirip
		 * degistirmedigini kontrol edin.
		 */
		
		double fiyat =100;
		
		indirimUygula(fiyat); //method call 
		System.out.println("method call sonras� fiyat: "+ fiyat);
	}

	public static void indirimUygula(double fiyat) {
		
		fiyat *=0.90;
		System.out.println("%10 indirimli fiyat: "+ fiyat);
		
	}

}
