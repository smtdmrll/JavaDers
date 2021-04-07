package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		/*
		 * kul dan vip(very important person) k�saltmas�nda hangi harfin anlam�n� istedi�ini soral�m 
		 * girilen harfin a��klamas�n� yazal�m 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("vip k�saltmas�ndan hangi harfin anlam�n� ��renmek istersin ");
		char harf = scan.next().toLowerCase().charAt(0);
		
		switch (harf) {
		case 'v':
		case 'V'://bu toupper ya da tolower yazmasan da ekleyebilece�in bir ��z�m
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
			System.out.println("yanl�� harf");
			break;
		}
		
		//kul b�rden fazla harf girmesi sorun olarak kabul ediyorsak ve hata olarak bildirmek istiyorsak String olarak almal�s�n�z 
		
		System.out.println("vip k�saltmas�ndan hangi harfin anlam�n� ��renmek istersin ");
		String str = scan.next();
		
		switch (str) {
		case "v":
		case "V"://bu toupper ya da tolower yazmasan da ekleyebilece�in bir ��z�m
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
			System.out.println("yanl�� harf ");
			break;
			
			
	
		}
	scan.close();
	}

}
