package day33_Encapsulation;

public class Encapsulation03 {
	public static void main(String[] args) {
		
		/*
		 Encapsulation02 class�ndaki class member a ula�maya �al��al�m 
		 */
	
		Encapsulation02 obj1 = new Encapsulation02();
		 
		/*
		 biz eri�im yetkisini ikiye ay�r�r�z 
		 1- okuyab�lme
		 2- de�i�tirip kullanabilme
		 */
		
		System.out.println(obj1.sayi); //hem okudum
		obj1.sayi=25;					//hem de�er atad�m
		System.out.println(obj1.sayi);
		
		System.out.println(obj1.getOkulIsmi()); // sadece okuyabikirim 
//		obj1.getOkulIsmi()="samet kolej"; //de�i�iklik yapamam
		
		
		obj1.setHesapNo(546789); // sadece de�er atayabildim okuyamad�m 
//		System.out.println(obj1.setHesapNo(2351));  yazd�ramama edemem  yukar�da yazd�rm�� oluyorum zaten  set metodu okumaya izin vermez
		
		obj1.setTcNo("1545655");
	}
}
