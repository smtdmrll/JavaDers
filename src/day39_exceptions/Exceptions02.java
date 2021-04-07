package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		/*
		 	 eðer kodumuzu yazdýðýmýzda birden fazla exceptionsla iliþikili durum oluþuyorsa
		 	 	iç içe try-catch bloklarý oluþturulabilinir
		 	 
		 	 Bu örnekte ilk önce dosyayý okutmak istedik 
		 	 	java "ya dosyayý bulamazsam" diye bizden yardým istedi
		 	 biz de try-catch bloðu ile FileNotFoundException ile handle etmesinde yardýmcý olduk 
		 	 
		 	 Sonra dosyadaki yazýlarý okutmaya çalýþtýk ve java "ya okuyamazsam" diye yardým istedi
		 	 	biz de try-catch blogu ile IOException ile handle etmesini saðladýk.
		 	 	
		 	 
		 */
		
		try {

			FileInputStream fis = new FileInputStream("C:\\Users\\demir\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
					
			int k=0;
			try {
				while ((k=fis.read())!=-1) {
					System.out.print((char)k); //yazarsak ascii deðerlerini deðil harfler gelir
				}
			} catch (IOException e) {//dosyalarla ilgili genel yazma ve okuma sorunlar ile handle eder
			
				e.printStackTrace();
			}
		
		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		}
		System.out.println("kod bloke olmadý");
	}

}
