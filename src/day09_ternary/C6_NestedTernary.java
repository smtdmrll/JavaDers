package day09_ternary;

import java.util.Scanner;

public class C6_NestedTernary {

	public static void main(String[] args) {
		/*kullan�c�dan harf iste k���kse k���k harf b�y�kse b�y�k harf 
		 * de�ilse girdi�iniz karakter harf de�il mk 
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("bir harf giriniz ");
		char ilkHarf=scan.next().charAt(0);
		
		System.out.println(ilkHarf>='a'&& ilkHarf<='z' ?  "k���k harf " : 
			(ilkHarf>='A'&& ilkHarf<='Z'? "b�y�k harf" : "girdi�iniz karakter harf de�il "));
		
		scan.close();
	}

}
