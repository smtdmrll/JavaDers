package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		//kullan�c�dan ismini ve soyismini al�p aralar�nda bir bo�luk b�rakarak isim soyisim yazd�r
		
		Scanner scan=new Scanner(System.in);
		System.out.println("isim gir lan ");
		
		
		String isim= scan.nextLine(); // sadece next s�ilirse kullan�c� birden fazla kelime girse de ilk kelimeyi al�r
									//e�er girdi�i t�m yaaz�y� almak istersek nextLine se�mek zorunday�z.
		
		System.out.println("soyisim gir lan");
		
		String soyisim=scan.nextLine();
		
		System.out.println("b�yle isim mi olur mk "+ isim + " "+ soyisim);
		
		scan.close();
	}

}
