package day08_ifelseifnestedif;

import java.util.Scanner;

public class C5_NestedIf4 {

	public static void main(String[] args) {
		/*
		 Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
 		Kullanicidan bir sifre girmesini isteyin
 		Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  
 		“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
  		Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise  
  		“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		
		 *1, iþlem kullanýcýdan þifreyi alýp ilk harfine bak 
		 *büyük harf mi yoksa küçük harfa mi 
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("þifre");
		char ilkHarf= scan.next().charAt(0); //girilen þifrenin ilk karakterini alýr 
		
		if (ilkHarf>='A' && ilkHarf<='Z') {//ilk harf büyükse
			if (ilkHarf=='A') {
				System.out.println("þifre doðru");
				
			}else {
				System.out.println("geçersiz büyük harf ");
			}

		} else if (ilkHarf>='a'&& ilkHarf <='z') {//ilk harf küçükse
			if (ilkHarf=='z') {
				System.out.println("þifre doðru ");
			}else {
				System.out.println("geçersiz þifre küçük harf ");
			}
			
			
			
		} else {//küçük ya da büyük deðilse
			System.out.println("þifreniz geçersiz  ilk karakteri harf yapýn ");
			
		}

		scan.close();
			
	
		
		
		
		
	}

}
