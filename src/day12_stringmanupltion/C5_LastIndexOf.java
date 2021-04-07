package day12_stringmanupltion;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		/*
		 * lastindexof aranan karakteri cümle içerisinde en son nerede kullanýldýysa onu verir
		 * olmayan karakter sorgulanýrsa -1 verir 
		 * 
		 * kullanýcýdan bir cümle alýn 
		 * ve aþaðýdaki üç durumdan uygun olaný yazdýrýn 
		 * 1- cümle java içermiyor 
		 * 2- cümle bir tane java içeriyor
		 * 3-cümlede birden fazla java var
		 */
	
		Scanner scan=new Scanner (System.in);
		System.out.println("bir cümle girin ");
		
		String cumle= scan.nextLine().toLowerCase();
		int cumleIki=cumle.indexOf("java"); // ya -1 ya da ilk javanýn indeksini 
		int cumleSon=cumle.lastIndexOf("java");// ya -1 ya da son javanýn indeksini
		
		if (cumleIki==-1) {
			System.out.println("cumle java içermiyor ");
		} else if(cumleIki==cumleSon) {
			System.out.println("cümlede bir tane java var ");

		}else {
			System.out.println("cumle birden fazla java içeriyor ");
		}
	
	
	scan.close();
	
	
	
	
	}

}
