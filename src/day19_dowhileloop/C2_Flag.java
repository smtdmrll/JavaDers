package day19_dowhileloop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		//kuldan bir c�mle al c�mlede b�y�k harf var m� yok mu yazd�r�n 
		//while loop kullanaraj yap
		
		Scanner scan=new Scanner (System.in);
		System.out.println("c�mle gir");
		String str =scan.nextLine();
		
		String flag= "yok"; // flagde iki durum vard�r ya �yle ya b�yle 
							// count yani sayac ise sayar ka� tane oldu�unu 
		
		
		int index= 0;
		
		while (index<str.length()) {
			if (str.charAt(index)>='A'&&str.charAt(index)<='Z' ) {
				flag="var";
				
				
			}
			index++;
		}
		System.out.println("verdi�iniz c�mlede b�y�k harf  "+ flag);
		
		

	}

}
