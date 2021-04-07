package day39_exceptions;

import java.util.Scanner;

public class Exceptions08 {

	public static void main(String[] args) {
		/*
        
        Kullanicidan carpma yapmak icin bir String isteyin. 
        Kullanicinin girdigi String sadece sayilardan olusuyorsa 
        sayiyi 2 ile carpip sonucu yazdirin.
       	Kullanici sayilardan olusmayan bir String girerse 
       	“Girdiginiz String sayiya cevrilemez” yazdirin.
        */
		Scanner scan = new Scanner  (System.in);
		System.out.println("çarpma için iki sayý gir ");
		String str1 =scan.next();
		String str2 = scan.next();
		try {
			System.out.println(Integer.parseInt(str1)*Integer.parseInt(str2));
		} catch (NumberFormatException e) {
			System.out.println("Girdiginiz String sayiya cevrilemez");
		}
	}
}
