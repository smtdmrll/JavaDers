package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		/*
		 * kul dan vip(very important person) kýsaltmasýnda hangi harfin anlamýný istediðini soralým 
		 * girilen harfin açýklamasýný yazalým 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("vip kýsaltmasýndan hangi harfin anlamýný öðrenmek istersin ");
		char harf = scan.next().toLowerCase().charAt(0);
		
		switch (harf) {
		case 'v':
		case 'V'://bu toupper ya da tolower yazmasan da ekleyebileceðin bir çözüm
			System.out.println("very");
			break;
		case 'i':
		case 'I':
			System.out.println("important");
			break;
		case 'p':
			System.out.println("person");
			break;
		default:
			System.out.println("yanlýþ harf");
			break;
		}
		
		//kul bþrden fazla harf girmesi sorun olarak kabul ediyorsak ve hata olarak bildirmek istiyorsak String olarak almalýsýnýz 
		
		System.out.println("vip kýsaltmasýndan hangi harfin anlamýný öðrenmek istersin ");
		String str = scan.next();
		
		switch (str) {
		case "v":
		case "V"://bu toupper ya da tolower yazmasan da ekleyebileceðin bir çözüm
			System.out.println("very ");
			break;
		case "i":
		case "I":
			System.out.println("important ");
			break;
		case "p":
		case "P":
			System.out.println("person ");
			break;
		default:
			System.out.println("yanlýþ harf ");
			break;
			
			
	
		}
	scan.close();
	}

}
