package day13_stringmanupltion;

import java.util.Scanner;

public class C11_Example3 {

	public static void main(String[] args) {
		/*
		 * kul dan ismini soy ismini ve kredi kartý bilgilerini isteyin aþaðýdaki gibi
		 * yazdýrýn isim soyisim m*** b*** kartno **** **** **** 1234
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen ismini gr");
		String isim = scan.next();

		System.out.println("soyismini gir");
		String soyIsim = scan.next();
		System.out.println("kart no gir");
		String kartNo = scan.next();

		char isimIlkHarf = isim.toUpperCase().charAt(0);
		String isimGeriKalan = isim.substring(1).replaceAll("\\w", "*");

		String soyIsimIlkHarf = soyIsim.toUpperCase().substring(0, 1);
		String soyIsimGeriyeKalan = soyIsim.substring(1).replaceAll("\\w", "*");

		String kkbasi = "**** **** **** ";
		String kksonu= kartNo.substring(kartNo.length()-4);
	
		System.out.println("isminiz soyisminiz "+isimIlkHarf+isimGeriKalan+ " " + soyIsimIlkHarf+soyIsimGeriyeKalan );
		System.out.println("karrt no "+kkbasi + kksonu );
	
scan.close();		
	}

}
