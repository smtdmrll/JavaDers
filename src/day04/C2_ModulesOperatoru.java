package day04;

public class C2_ModulesOperatoru {

	public static void main(String[] args) {
		
		// modulus operatörü bölme iþleminde kalaný verir 
		
		//15 tek mi çift mi  15/2 kalan 1 tek
		//25 üçe bölnür mü 25/3 kalan 1 bölünemez kontrol edimi 
		//herhangi bir sayýnýn 7 ile bölümünü kontrol etmek için modulus iþlemini kullanýrýz 
		
		
		int kalan=15%4;
		
		System.out.println(kalan);

		//856 nýn birler basamaðý kaç ? 6 
		int sayi=856;
		int birBasamagi=sayi%10;
		
		System.out.println(birBasamagi); //=6
		
		//856 onlar basamaðý kaç 5
		
		//sayýnýn birler basamaðýný bulduktan sonra onlar basamaðýný bulmak için birler basamaðýndan
		// birler basamaðýndan kurtulmak gerekiyor 
		//birler basamaðýndan kurtulmak için 10 a böleriz çünkü int sadece tam sayý alýr 
		
		sayi/=10;
		
		
		
		System.out.println("on a bölündükten sonra deðeri " +sayi);
		
		int onlarBasamagi= sayi %10;
		
		System.out.println("onlar basmaðý "+ onlarBasamagi);
		
		//yü<ler için de ayný þeyi yaparýz 
		
		sayi/=10 ;
		
		System.out.println("2. defa on a böldükten sonra "+sayi);
		
		int yuzlerBasamagi= sayi%10 ;
		
		System.out.println(yuzlerBasamagi);
		
		
		
		
		

	}

}
