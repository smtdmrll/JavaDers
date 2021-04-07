package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\demir\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");

		/*
		 	try catch blogu exceptions ile handle etmekte kullan�l�r
		 	
		 	throws keyword u ise sadece decleration d�r 
		 		dolay�s�yla throw kullan�lan bir methodda exceptions olu�ursa KOD BLOKE OLUR
		 */
		
		
		
		int k=0;
		
		while ((k=fis.read())!=-1) {
			System.out.print((char)k); 
		}
		
		
		
		
	
		
		/*
		 	E�er birden fazla exception i�in throws keywordu kullanacaksak 
		 		yazaca��m�z exc lar�n aras�ndaki ili�ki ve s�ralama �nemli olur 
		 	E�er yazd���m�z exclar aras�nda parent child ili�kisi varsa 
		 		�nce child exceptions yaz�lmal�d�r, aksi takdirde child exc eri�ilemez olur
			E�er yazacaklar�m�z aras�nda parent child ili�kisi varsa istersek sadece
				parent � yazmam�z da yeterli olur 
				
				
				throws'un amaci : Kodum dogru benim sorunum yok sen hata verme bana 
					yoluna Java kardes bak demek icindir.
		 */
		/*
		 	THROW 
		 		sadece bir exc f�rlatmak i�in kullan�l�r 
		 	
		 	THROWS 
		 	 	declare etmek i�in kullan�l�r virg�� koyarak birden fazla declare yap�labilir
		 	
		 	
		 	THROW 
		 		methodun i�inde kullan�l�r 
		 	
		 	THROWS
		 		method signature unda kullan�l�r 
		 		
		 	
		 SLAYTTA THROW VE THROWS FARKI VAR
		 		
		 	
		 	
		 */
		/*
		 	THROW:
1- Aleni sekilde exception throw eder
2- throw bir tane exception firlatmakicin kullanilir
3- throw method icinde kullanilir
4- Syntac olarak throw kelimesinden sonra instance variable kullanilir
		 */
		/*
		 
		 	/*
    Throws Throw
    Throw keyword'u 1 exc. firlatmak icin. Throw declare etmiyor
    Throws ise bir veya daha fazla exc.'i declera etmek icindir. "," ile ayrilarak yazilabilir.
    
    Throw method'un icinde kullanilir.
    Throws keyword ise method signature'inda kullanilir.
    
     Throw'dan sonra new diyip exc. turunu yazmamis lazim.
     Throws'dan sonra sadece exc. turu yazilmasi yeterlidir.
    
    */
		
	}
}












































































































