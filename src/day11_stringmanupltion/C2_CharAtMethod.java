package day11_stringmanupltion;

public class C2_CharAtMethod {

	public static void main(String[] args) {
		/*
		 * charAt(index) 
		 * scan.next().charAt(0) ---> 0. indeksteki karakteri verir 
		 * index s�f�rdan ba�lar 
		 */
		
		String str= "java �ok g�zel";
		
		System.out.println(str.charAt(0)); // output: j 
		System.out.println(str.charAt(5)); //0 dan ba�lay�p 5 e kadar sayar 5. karakteri  "�" yazd�r�r 
		System.out.println(str.charAt(13));//l output
		
		//kelimenin uzunlu�u son indeks + 1 dir. 
		
		//son indeks kelimenin uzunlu�u(length)-1
		
		//System.out.println(str.charAt(14)); ---> hata verir
		
		//kullan�c� on harfli bir kelime girerse bana son harfi verecek kodu yaz�n�z �rn: abcd efghi
		//str.charArt(9) 
		
		//System.out.println(str.charAt(14)); 
		//---> hata verir e�er index olarak string uzunlu�u kadar yani karakter uzunlu�u kadar veya daha fazlas girilirse hata verir
		
		//String str3 = 5   // compile time error CTE
					      //kod �al��madan javan�n fark�na var�p alt�n� k�rm�z� �izdi�i hatalard�r 
						  //bu t�r hatalar d�zeltilmeden java �al��maz 
		
		//System.out.println(str.charAt(14)); ----> baz� hatalar suntaxten anla��lmaz ancak kod �al��t�r�ld�ktan sonra 
		//java i�lemi yaparken anla��l�r
		//kod run edildi�inde ortaya ��kt��� i�in bu t�r hatalara 
		//Run Time Error denir RTE
		
		
	}

}
