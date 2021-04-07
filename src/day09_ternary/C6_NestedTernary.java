package day09_ternary;

import java.util.Scanner;

public class C6_NestedTernary {

	public static void main(String[] args) {
		/*kullanýcýdan harf iste küçükse küçük harf büyükse büyük harf 
		 * deðilse girdiðiniz karakter harf deðil mk 
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("bir harf giriniz ");
		char ilkHarf=scan.next().charAt(0);
		
		System.out.println(ilkHarf>='a'&& ilkHarf<='z' ?  "küçük harf " : 
			(ilkHarf>='A'&& ilkHarf<='Z'? "büyük harf" : "girdiðiniz karakter harf deðil "));
		
		scan.close();
	}

}
