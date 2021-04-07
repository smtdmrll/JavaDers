package day10_switchcase;

public class C7_StringManuplation {

	public static void main(String[] args) {
		/*
		 * VERY IMPORTANT olmazsa olmaz bir konu
		 * stringi deðiþtirme anlmýný taþýr
		 * nonpri data türleri value ile birlikte methodlara sahiptirler
		 * methodlarý kullanarak stringi deðiþtirmeye stringmanuplation deniyor
		 * string metodlarý geçici olarak manipüle eder kalýcý assign yapmaz 
		 */

		String str="hello world";
		System.out.println(str.toUpperCase()); //HELLO WORLD (geici olarak manipüle ediyor 
		
		System.out.println(str);// hello world
		
		String str2=str.toUpperCase();// burda str birin manipüle edilmiþ hali str2 ye atanmýþ olur 
		
		System.out.println(str); //hello world 
		System.out.println(str2);//HELLO WORLD
		 
		
		
		
		
		
		
	}

}
