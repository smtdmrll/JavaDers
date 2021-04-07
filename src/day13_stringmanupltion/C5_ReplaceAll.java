package day13_stringmanupltion;

public class C5_ReplaceAll {
	public static void main(String[] args) {
		
		String str = "java ogren mutlu ol, java candir 12345";

		System.out.println(str.replace("java", "hava"));

		/*
		 * replaceAll() merhodu replace methoduna benzer ama 2 farý vardýr
		 * 1-replace methodu char kabul eder ama replaceall kabul etmez
		 * 2-replaceall methodu regex kullanýlmasýna izin verir 
		 */

		System.out.println(str.replaceAll("\\w", "*")); //**** ***** ***** **, **** ****** tüm harfler ve rakamlar yerine * yazacak
		System.out.println(str.replaceAll("\\W", "*")); //java*ogren*mutlu*ol**java*candir 
		System.out.println(str.replaceAll("\\d", "*")); //java ogren mutlu ol, java candir *****
		System.out.println(str.replaceAll("\\D", "*")); //*********************************12345
		System.out.println(str.replaceAll("\\s", ".")); //java.ogren.mutlu.ol,.java.candir.12345
		System.out.println(str.replaceAll("\\S", "&")); //&&&& &&&&& &&&&& &&& &&&& &&&&&& &&&&&

	
		/*
		 *\\w (word)		tüm harfler ve rakamlar
		 *\\W (wordolmayan)	harfler ve rakamlar dýþýnda her þey \\w nun tersi 
		 *\\d (digit)		sayýlarý deðiþtirir
		 *\\D 				sayý olmayan her þeyi deðiþtirir
		 *\\s (space)		boþluklarý deðiþtirir
		 *\\S 				boþluk olmayan her þeyi deðiþtir
		 */
										
	}

}
