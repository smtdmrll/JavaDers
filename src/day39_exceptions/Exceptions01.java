package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		
		/*
		 	javaya bir dosyayý okumasýný ya da dosyaya yazmasýný söylediðimizde 
		 		java "ya dosyayý bulamazsam" der bizden çözüm üretmemizi bekler
		 		dosya bulma ile ilgili exc türü : FileNotFoundException
		 		
		 	java kodu yazar yazmaz buradaki olasý problemi görür ve cte verir
		 	    kodumuzu yazdýðýmýz anda ortaya çýkan bu tür exceptionslara CHECKED EXCEPTÝONS diyoruz 
		 */
		
		try {
			
			FileInputStream fis= new FileInputStream("C:\\Users\\demir\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
			
			// File dosyasi icin File'a sag klik yap, Properties'i sec, Location'i kopyala ve buraya yapistir.
			// Sikayete hala devam ediyor ustune gel Surrond with try catch'i sec
			
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace(); //tüm hata açýklamalarýný yazdýrýr ama kodumuz bloke olmaz
			
			System.out.println(e.getMessage());//daha az hata açýklamasý yazdýrýr
		}
	System.out.println("çalýþtý");
	}

}
