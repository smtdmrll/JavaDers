package day08_ifelseifnestedif;

import java.util.Scanner;

public class C5_NestedIf4 {

	public static void main(String[] args) {
		/*
		 Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
 		Kullanicidan bir sifre girmesini isteyin
 		Eger ilk harf buyuk harf ise �A� olup olmadigini kontrol edin. Ilk harf A ise  
 		�Gecerli Sifre� degilse �Gecersiz Sifre� yazdirin.
  		Eger ilk harf kucuk harf ise �z� olup olmadigini kontrol edin. Ilk harf z ise  
  		�Gecerli Sifre� degilse �Gecersiz Sifre� yazdirin.
		
		 *1, i�lem kullan�c�dan �ifreyi al�p ilk harfine bak 
		 *b�y�k harf mi yoksa k���k harfa mi 
		 */
		
		Scanner scan =new Scanner (System.in);
		System.out.println("�ifre");
		char ilkHarf= scan.next().charAt(0); //girilen �ifrenin ilk karakterini al�r 
		
		if (ilkHarf>='A' && ilkHarf<='Z') {//ilk harf b�y�kse
			if (ilkHarf=='A') {
				System.out.println("�ifre do�ru");
				
			}else {
				System.out.println("ge�ersiz b�y�k harf ");
			}

		} else if (ilkHarf>='a'&& ilkHarf <='z') {//ilk harf k���kse
			if (ilkHarf=='z') {
				System.out.println("�ifre do�ru ");
			}else {
				System.out.println("ge�ersiz �ifre k���k harf ");
			}
			
			
			
		} else {//k���k ya da b�y�k de�ilse
			System.out.println("�ifreniz ge�ersiz  ilk karakteri harf yap�n ");
			
		}

		scan.close();
			
	
		
		
		
		
	}

}
