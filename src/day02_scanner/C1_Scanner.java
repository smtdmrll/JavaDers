package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {

		//scanner ile kullanýcýdan bilgi alabiliriz 
		// 3 adýmla scanner iþlemi gerçekleþir		
		
		 //1. adým scanner objesi oluþturucaz 
		
				
				Scanner  scan=  new   Scanner(System.in); //kodlar arasýndaki boþluk önemli deðil		
				
				//new: javada yeni bir obje oluþturuluyor  anlamýna gelir		
				// parantez içine parametre denir Scanner için System.in yazmamýz gerekir		
				// bir kod yazdýðýmýzda kodun altýnda kýrmýzý çizgi oluþuyorsa veya satýr 
				//numarasý olan kýsýmda çarpý iþareti varsa  bir þeyler yanlýþ 			
				//java.utill javanýn bizim için hazýrladýðý bir kütüphanedir
				//... ihtiyacýmýz olduðunda ihtiyacýmýz olan kodlarý classa import 
				// etmemiz yeterlidir
				//scan oluþturduðumuz scanner ýbjesine verdiðimiz isimdir farklý isimler de verilebiir
				//ancak scan ismi kabullenilen kültür kodumuzu anlaþýlabilir ve
				//rahat okunabilir olmasý için tavsiye edilir.
				
				
				//2. adým kullanýcýya bir mesaj yazýn
				
				System.out.println("karenin bir kenarýný gir lan ");
				
				//3. adým  konsolo girdiði deðeri programa alacaðýz 
				//ve variable oluþturup bu deðeri atayacaðýz
				//kullanýcýdan bir kenar uzunluðu istediðim için kü.ük bir ayý da girebilir büyük de 
				//tam sayý da yazabilir virgüllü de
				
				double kenar = scan.nextDouble(); 
				
				System.out.println("girdiðiniz kenar uzunluðuna sahip karenin alaný = " + kenar*kenar);
				
				
				scan.close();
				
				
				
		
	}

}
