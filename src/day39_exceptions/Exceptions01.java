package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		
		/*
		 	javaya bir dosyay� okumas�n� ya da dosyaya yazmas�n� s�yledi�imizde 
		 		java "ya dosyay� bulamazsam" der bizden ��z�m �retmemizi bekler
		 		dosya bulma ile ilgili exc t�r� : FileNotFoundException
		 		
		 	java kodu yazar yazmaz buradaki olas� problemi g�r�r ve cte verir
		 	    kodumuzu yazd���m�z anda ortaya ��kan bu t�r exceptionslara CHECKED EXCEPT�ONS diyoruz 
		 */
		
		try {
			
			FileInputStream fis= new FileInputStream("C:\\Users\\demir\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
			
			// File dosyasi icin File'a sag klik yap, Properties'i sec, Location'i kopyala ve buraya yapistir.
			// Sikayete hala devam ediyor ustune gel Surrond with try catch'i sec
			
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace(); //t�m hata a��klamalar�n� yazd�r�r ama kodumuz bloke olmaz
			
			System.out.println(e.getMessage());//daha az hata a��klamas� yazd�r�r
		}
	System.out.println("�al��t�");
	}

}
