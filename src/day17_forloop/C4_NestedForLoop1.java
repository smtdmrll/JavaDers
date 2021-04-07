package day17_forloop;

import java.util.Scanner;

public class C4_NestedForLoop1 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
  *
  * *
  * * *
  * * * *
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("pozitif bir RAKAM gir");
		int sayi = scan.nextInt();

		for (int i = 1;  i <= sayi; i++) { // outer loop denir 
			System.out.println(" ");
			for (int j = 0; j < i; j++) { //buna genelde inner loop denir
				System.out.print("* ");
			}
		}
scan.close();
	}

}
