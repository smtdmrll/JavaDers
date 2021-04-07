package day13_stringmanupltion;

public class C5_ReplaceAll {
	public static void main(String[] args) {
		
		String str = "java ogren mutlu ol, java candir 12345";

		System.out.println(str.replace("java", "hava"));

		/*
		 * replaceAll() merhodu replace methoduna benzer ama 2 far� vard�r
		 * 1-replace methodu char kabul eder ama replaceall kabul etmez
		 * 2-replaceall methodu regex kullan�lmas�na izin verir 
		 */

		System.out.println(str.replaceAll("\\w", "*")); //**** ***** ***** **, **** ****** t�m harfler ve rakamlar yerine * yazacak
		System.out.println(str.replaceAll("\\W", "*")); //java*ogren*mutlu*ol**java*candir 
		System.out.println(str.replaceAll("\\d", "*")); //java ogren mutlu ol, java candir *****
		System.out.println(str.replaceAll("\\D", "*")); //*********************************12345
		System.out.println(str.replaceAll("\\s", ".")); //java.ogren.mutlu.ol,.java.candir.12345
		System.out.println(str.replaceAll("\\S", "&")); //&&&& &&&&& &&&&& &&& &&&& &&&&&& &&&&&

	
		/*
		 *\\w (word)		t�m harfler ve rakamlar
		 *\\W (wordolmayan)	harfler ve rakamlar d���nda her �ey \\w nun tersi 
		 *\\d (digit)		say�lar� de�i�tirir
		 *\\D 				say� olmayan her �eyi de�i�tirir
		 *\\s (space)		bo�luklar� de�i�tirir
		 *\\S 				bo�luk olmayan her �eyi de�i�tir
		 */
										
	}

}
