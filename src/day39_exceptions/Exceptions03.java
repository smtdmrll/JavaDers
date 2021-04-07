package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
		
		/*
		 	i� i�e try-catch yerine 
		 		1tane try multiple catch blogu kullanabiliriz
		 		ancak bu durumda yazd���m�z exceptionslar aras�nda parent ve child ili�kisi  varsa �nce child class � yazmal�y�z
		 		aksi takdirde yance parent yaz�l�rsa child a i� kalmaz ve
		 		java eri�ilemez catch blogu diye cte verir
		 		
		 	FileNotFoundException IS-A IOException
		 */	
		try {

			FileInputStream fis = new FileInputStream("C:\\Users\\demir\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
					
			int k=0;
			
				while ((k=fis.read())!=-1) {
					System.out.print((char)k); 
				}
		}catch (FileNotFoundException e) { // �nce child exc yazd�k 
		
				e.printStackTrace();
			
		} catch (IOException e) {

			System.out.println(e.getMessage());
		}
		System.out.println("kod bloke olmad�");
	}
	

}
