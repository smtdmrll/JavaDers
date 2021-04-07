package day05_wrapperconcetenationoperators;

public class C3_Concatenation {

	public static void main(String[] args) {
		
		//concatenation(birleþtirme ): Javada birden fazla string i + iþareti ile 
		//toplarsanýz, java 
		
		String str1="java ";
		String str2="güzeldr";
		
		System.out.println(str1+str2); //javagüzeldir
		// eðer arada boþluk istersen araya çift týrnak boþluk býrak 
		
		System.out.println(str1+" "+str2 ); 
		// güzeldir java
		
		System.out.println(str2+str1);
		
		int sayi1=5;
		int sayi2=4;
		
		//verilen deðiþkenleri kullanarak9 yazdýrýn 
		System.out.println(sayi1+sayi2);
		
		System.out.println(sayi1+sayi2+ str1+str2);//9javaguzxeldi
		
		System.out.println(str1+str2+sayi1+sayi2);//javaguzeldir54

		//javagüzeldir1
		
		System.out.println(str1+str2+(sayi1-sayi2));//
		
		System.out.println(sayi1+sayi2 +' ' +str1+str2);// boþluk ascýý karþýlýðý32 sonuç 41javagüzeldir
		
		//java matematiksel bir iþlem yaparken char türünden bir deðerle karþýlaþýrsa 
		//o charýn ascýý deðerini alýr 
		
		System.out.println(sayi1+sayi2+str1+' '+ str2);//9java güzeldir 
		
		//chardan önce int varsa ascýý deðeri string varsa noþluk olarak alýr
		
		System.out.println(str1+str2+sayi1*sayi2);
		
		/*
		 * son tekrar
		 * 
		 * kural1) eðer toplanan deðerlerden bir tanesi bile string deðilse java concatenation yapar
		 * 
		 * kural2) eðer toplanan deðerlerin ikisi de matematiksel iþlemse toplar 
		 * 
		 * kural3) eðer sayý ve string deðiþkenler birlikte kullanýlacaksa öncliklerbelirlenip
		 * o iþlemler için parantez kullanýlabilir 
		 * 
		 * kural4) matematiksel bir iþlemde char deðiþken kullanýlýrsa java char ý ascii karþýlýðýný alýr
		 * 
		 * kural5) charla string toplanýrsa char concatenation yapar
		 */
		
	}

}
