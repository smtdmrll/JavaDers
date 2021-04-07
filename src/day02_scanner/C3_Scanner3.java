package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		//kullanýcýdan ismini ve soyismini alýp aralarýnda bir boþluk býrakarak isim soyisim yazdýr
		
		Scanner scan=new Scanner(System.in);
		System.out.println("isim gir lan ");
		
		
		String isim= scan.nextLine(); // sadece next sçilirse kullanýcý birden fazla kelime girse de ilk kelimeyi alýr
									//eðer girdiði tüm yaazýyý almak istersek nextLine seçmek zorundayýz.
		
		System.out.println("soyisim gir lan");
		
		String soyisim=scan.nextLine();
		
		System.out.println("böyle isim mi olur mk "+ isim + " "+ soyisim);
		
		scan.close();
	}

}
