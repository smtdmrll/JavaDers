package day07_ifelsestatements;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		/*
		 * kul dan iki sayý iste ikisi de poz ise top 
		 * ikisi de neg is çarp 
		 * farklý iþaret varsa yanlýþ girdi 
		 * sýfýra eþit olan varsa 0 yutan eleman yaz
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("iþareti ayný olan iki sayý gir ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		if (a== 0 || b==0 ) {
			System.out.println("0 yutan elemandýr ");
			
		}else if (a>0 && b>0 ) {
			System.out.println(a+b);
			
		}else if (a<0 && b<0) {
			System.out.println(a*b);
			
		}else {
			System.out.println("farklý iþaretlerle iþlem apamazsýn");
		}
		scan.close();
	}
/*
 * if else soprularýnda mutlakkaa ama muuuuutlaakaaa bir tanesi çalýþmalý 
 * çalýþmazsa sýkýntý baboþ 
 */
}
