package day12_stringmanupltion;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		/*
		 * lastindexof aranan karakteri c�mle i�erisinde en son nerede kullan�ld�ysa onu verir
		 * olmayan karakter sorgulan�rsa -1 verir 
		 * 
		 * kullan�c�dan bir c�mle al�n 
		 * ve a�a��daki �� durumdan uygun olan� yazd�r�n 
		 * 1- c�mle java i�ermiyor 
		 * 2- c�mle bir tane java i�eriyor
		 * 3-c�mlede birden fazla java var
		 */
	
		Scanner scan=new Scanner (System.in);
		System.out.println("bir c�mle girin ");
		
		String cumle= scan.nextLine().toLowerCase();
		int cumleIki=cumle.indexOf("java"); // ya -1 ya da ilk javan�n indeksini 
		int cumleSon=cumle.lastIndexOf("java");// ya -1 ya da son javan�n indeksini
		
		if (cumleIki==-1) {
			System.out.println("cumle java i�ermiyor ");
		} else if(cumleIki==cumleSon) {
			System.out.println("c�mlede bir tane java var ");

		}else {
			System.out.println("cumle birden fazla java i�eriyor ");
		}
	
	
	scan.close();
	
	
	
	
	}

}
