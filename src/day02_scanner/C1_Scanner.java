package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {

		//scanner ile kullan�c�dan bilgi alabiliriz 
		// 3 ad�mla scanner i�lemi ger�ekle�ir		
		
		 //1. ad�m scanner objesi olu�turucaz 
		
				
				Scanner  scan=  new   Scanner(System.in); //kodlar aras�ndaki bo�luk �nemli de�il		
				
				//new: javada yeni bir obje olu�turuluyor  anlam�na gelir		
				// parantez i�ine parametre denir Scanner i�in System.in yazmam�z gerekir		
				// bir kod yazd���m�zda kodun alt�nda k�rm�z� �izgi olu�uyorsa veya sat�r 
				//numaras� olan k�s�mda �arp� i�areti varsa  bir �eyler yanl�� 			
				//java.utill javan�n bizim i�in haz�rlad��� bir k�t�phanedir
				//... ihtiyac�m�z oldu�unda ihtiyac�m�z olan kodlar� classa import 
				// etmemiz yeterlidir
				//scan olu�turdu�umuz scanner �bjesine verdi�imiz isimdir farkl� isimler de verilebiir
				//ancak scan ismi kabullenilen k�lt�r kodumuzu anla��labilir ve
				//rahat okunabilir olmas� i�in tavsiye edilir.
				
				
				//2. ad�m kullan�c�ya bir mesaj yaz�n
				
				System.out.println("karenin bir kenar�n� gir lan ");
				
				//3. ad�m  konsolo girdi�i de�eri programa alaca��z 
				//ve variable olu�turup bu de�eri atayaca��z
				//kullan�c�dan bir kenar uzunlu�u istedi�im i�in k�.�k bir ay� da girebilir b�y�k de 
				//tam say� da yazabilir virg�ll� de
				
				double kenar = scan.nextDouble(); 
				
				System.out.println("girdi�iniz kenar uzunlu�una sahip karenin alan� = " + kenar*kenar);
				
				
				scan.close();
				
				
				
		
	}

}
