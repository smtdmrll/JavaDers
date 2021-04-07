package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
		
		/*
		 	iç içe try-catch yerine 
		 		1tane try multiple catch blogu kullanabiliriz
		 		ancak bu durumda yazdýðýmýz exceptionslar arasýnda parent ve child iliþkisi  varsa önce child class ý yazmalýyýz
		 		aksi takdirde yance parent yazýlýrsa child a iþ kalmaz ve
		 		java eriþilemez catch blogu diye cte verir
		 		
		 	FileNotFoundException IS-A IOException
		 */	
		try {

			FileInputStream fis = new FileInputStream("C:\\Users\\demir\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
					
			int k=0;
			
				while ((k=fis.read())!=-1) {
					System.out.print((char)k); 
				}
		}catch (FileNotFoundException e) { // önce child exc yazdýk 
		
				e.printStackTrace();
			
		} catch (IOException e) {

			System.out.println(e.getMessage());
		}
		System.out.println("kod bloke olmadý");
	}
	

}
