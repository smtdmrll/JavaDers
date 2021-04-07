package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		/*
		 	 e�er kodumuzu yazd���m�zda birden fazla exceptionsla ili�ikili durum olu�uyorsa
		 	 	i� i�e try-catch bloklar� olu�turulabilinir
		 	 
		 	 Bu �rnekte ilk �nce dosyay� okutmak istedik 
		 	 	java "ya dosyay� bulamazsam" diye bizden yard�m istedi
		 	 biz de try-catch blo�u ile FileNotFoundException ile handle etmesinde yard�mc� olduk 
		 	 
		 	 Sonra dosyadaki yaz�lar� okutmaya �al��t�k ve java "ya okuyamazsam" diye yard�m istedi
		 	 	biz de try-catch blogu ile IOException ile handle etmesini sa�lad�k.
		 	 	
		 	 
		 */
		
		try {

			FileInputStream fis = new FileInputStream("C:\\Users\\demir\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
					
			int k=0;
			try {
				while ((k=fis.read())!=-1) {
					System.out.print((char)k); //yazarsak ascii de�erlerini de�il harfler gelir
				}
			} catch (IOException e) {//dosyalarla ilgili genel yazma ve okuma sorunlar ile handle eder
			
				e.printStackTrace();
			}
		
		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		}
		System.out.println("kod bloke olmad�");
	}

}
