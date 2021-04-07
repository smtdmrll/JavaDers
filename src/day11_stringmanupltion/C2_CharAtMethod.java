package day11_stringmanupltion;

public class C2_CharAtMethod {

	public static void main(String[] args) {
		/*
		 * charAt(index) 
		 * scan.next().charAt(0) ---> 0. indeksteki karakteri verir 
		 * index sýfýrdan baþlar 
		 */
		
		String str= "java çok güzel";
		
		System.out.println(str.charAt(0)); // output: j 
		System.out.println(str.charAt(5)); //0 dan baþlayýp 5 e kadar sayar 5. karakteri  "ç" yazdýrýr 
		System.out.println(str.charAt(13));//l output
		
		//kelimenin uzunluðu son indeks + 1 dir. 
		
		//son indeks kelimenin uzunluðu(length)-1
		
		//System.out.println(str.charAt(14)); ---> hata verir
		
		//kullanýcý on harfli bir kelime girerse bana son harfi verecek kodu yazýnýz örn: abcd efghi
		//str.charArt(9) 
		
		//System.out.println(str.charAt(14)); 
		//---> hata verir eðer index olarak string uzunluðu kadar yani karakter uzunluðu kadar veya daha fazlas girilirse hata verir
		
		//String str3 = 5   // compile time error CTE
					      //kod çalýþmadan javanýn farkýna varýp altýný kýrmýzý çizdiði hatalardýr 
						  //bu tür hatalar düzeltilmeden java çalýþmaz 
		
		//System.out.println(str.charAt(14)); ----> bazý hatalar suntaxten anlaþýlmaz ancak kod çalýþtýrýldýktan sonra 
		//java iþlemi yaparken anlaþýlýr
		//kod run edildiðinde ortaya çýktýðý için bu tür hatalara 
		//Run Time Error denir RTE
		
		
	}

}
