package day33_Encapsulation;

public class Encapsulation03 {
	public static void main(String[] args) {
		
		/*
		 Encapsulation02 classýndaki class member a ulaþmaya çalýþalým 
		 */
	
		Encapsulation02 obj1 = new Encapsulation02();
		 
		/*
		 biz eriþim yetkisini ikiye ayýrýrýz 
		 1- okuyabþlme
		 2- deðiþtirip kullanabilme
		 */
		
		System.out.println(obj1.sayi); //hem okudum
		obj1.sayi=25;					//hem deðer atadým
		System.out.println(obj1.sayi);
		
		System.out.println(obj1.getOkulIsmi()); // sadece okuyabikirim 
//		obj1.getOkulIsmi()="samet kolej"; //deðiþiklik yapamam
		
		
		obj1.setHesapNo(546789); // sadece deðer atayabildim okuyamadým 
//		System.out.println(obj1.setHesapNo(2351));  yazdýramama edemem  yukarýda yazdýrmýþ oluyorum zaten  set metodu okumaya izin vermez
		
		obj1.setTcNo("1545655");
	}
}
