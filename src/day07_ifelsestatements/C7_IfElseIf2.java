package day07_ifelsestatements;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		/*
		 * kul dan iki say� iste ikisi de poz ise top 
		 * ikisi de neg is �arp 
		 * farkl� i�aret varsa yanl�� girdi 
		 * s�f�ra e�it olan varsa 0 yutan eleman yaz
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("i�areti ayn� olan iki say� gir ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		if (a== 0 || b==0 ) {
			System.out.println("0 yutan elemand�r ");
			
		}else if (a>0 && b>0 ) {
			System.out.println(a+b);
			
		}else if (a<0 && b<0) {
			System.out.println(a*b);
			
		}else {
			System.out.println("farkl� i�aretlerle i�lem apamazs�n");
		}
		scan.close();
	}
/*
 * if else soprular�nda mutlakkaa ama muuuuutlaakaaa bir tanesi �al��mal� 
 * �al��mazsa s�k�nt� babo� 
 */
}
