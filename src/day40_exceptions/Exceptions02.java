package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\demir\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");

		/*
		 	try catch blogu exceptions ile handle etmekte kullanýlýr
		 	
		 	throws keyword u ise sadece decleration dýr 
		 		dolayýsýyla throw kullanýlan bir methodda exceptions oluþursa KOD BLOKE OLUR
		 */
		
		
		
		int k=0;
		
		while ((k=fis.read())!=-1) {
			System.out.print((char)k); 
		}
		
		
		
		
	
		
		/*
		 	Eðer birden fazla exception için throws keywordu kullanacaksak 
		 		yazacaðýmýz exc larýn arasýndaki iliþki ve sýralama önemli olur 
		 	Eðer yazdýðýmýz exclar arasýnda parent child iliþkisi varsa 
		 		önce child exceptions yazýlmalýdýr, aksi takdirde child exc eriþilemez olur
			Eðer yazacaklarýmýz arasýnda parent child iliþkisi varsa istersek sadece
				parent ý yazmamýz da yeterli olur 
				
				
				throws'un amaci : Kodum dogru benim sorunum yok sen hata verme bana 
					yoluna Java kardes bak demek icindir.
		 */
		/*
		 	THROW 
		 		sadece bir exc fýrlatmak için kullanýlýr 
		 	
		 	THROWS 
		 	 	declare etmek için kullanýlýr virgüþ koyarak birden fazla declare yapýlabilir
		 	
		 	
		 	THROW 
		 		methodun içinde kullanýlýr 
		 	
		 	THROWS
		 		method signature unda kullanýlýr 
		 		
		 	
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












































































































