package day39_exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions04 {

	public static void main(String[] args) {
		
		/*
		 	e�er handle exc lar aras�nda parent child ili�kisi varsa
		 		child exc blogu yazmasak da kodumuz �al���r
		 	
		 	Child exc �n� silmenin pozitif yan� : tek catch blogu ile t�m exc lar handle edilebilir
		 		negatif y�n� : bir srunla kar��la�t���m�zda bunun dosya bulunamad��� i�in mi yoksa 
		 			dosya okunamad���n i�in mi old�u anla��lamaz 
		 
		 */
		
		
		try {

			FileInputStream fis = new FileInputStream("C:\\Users\\demir\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
					
			int k=0;
			
				while ((k=fis.read())!=-1) {
					System.out.print((char)k); 
				}
fis.close();	
		} catch (IOException e) {

			System.out.println(e.getMessage());
		}
		System.out.println("kod bloke olmad�");
		
	}
}
