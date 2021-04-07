package day19_dowhileloop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		//kuldan bir cümle al cümlede büyük harf var mý yok mu yazdýrýn 
		//while loop kullanaraj yap
		
		Scanner scan=new Scanner (System.in);
		System.out.println("cümle gir");
		String str =scan.nextLine();
		
		String flag= "yok"; // flagde iki durum vardýr ya öyle ya böyle 
							// count yani sayac ise sayar kaç tane olduðunu 
		
		
		int index= 0;
		
		while (index<str.length()) {
			if (str.charAt(index)>='A'&&str.charAt(index)<='Z' ) {
				flag="var";
				
				
			}
			index++;
		}
		System.out.println("verdiðiniz cümlede büyük harf  "+ flag);
		
		

	}

}
