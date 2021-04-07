package day39_exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions04 {

	public static void main(String[] args) {
		
		/*
		 	eðer handle exc lar arasýnda parent child iliþkisi varsa
		 		child exc blogu yazmasak da kodumuz çalýþýr
		 	
		 	Child exc ýný silmenin pozitif yaný : tek catch blogu ile tüm exc lar handle edilebilir
		 		negatif yönü : bir srunla karþýlaþtýðýmýzda bunun dosya bulunamadýðý için mi yoksa 
		 			dosya okunamadýðýn için mi oldðu anlaþýlamaz 
		 
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
		System.out.println("kod bloke olmadý");
		
	}
}
