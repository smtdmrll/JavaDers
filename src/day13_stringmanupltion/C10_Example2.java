package day13_stringmanupltion;

public class C10_Example2 {

	public static void main(String[] args) {
		/*
			 *String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
			String str1 = “$13.99”
			String str2 = “$10.55”
			ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
		 */
		
		String str1= "$13.99";
		str1=str1.replaceAll("\\D", "");
		System.out.println(str1);
		
		String str2= "$10.55";
		str2=str2.replaceAll("\\D", "");
		System.out.println(str2);
		
		// str1 ve str2 içeriði sayý olan String lerdir . 
		//eðer içeriðinin tamamen sayý olsuðunu bildiðimiz String varsa 
		// parseDouble() veya parseInt() methodu kullanabiliriz 
		//ancak primitive data tipleri methoda sahip deðildir bu yüzden wrapper klas kullanmak gerek
		
		double sayi1= Double.parseDouble(str1);
		double sayi2= Double.parseDouble(str2);
		

		double toplam =(sayi1+sayi2)/100 ;
		System.out.println(toplam);
	}

}
