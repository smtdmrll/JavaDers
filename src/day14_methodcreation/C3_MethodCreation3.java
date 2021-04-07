package day14_methodcreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		/*
		 * verilen üç double sayýynýn ortalamasýný alan bir method yazýn main method
		 * içinde çaðýrarak methodu çalýþtýrýn
		 */

		ortalama (10, 20); // methodlarda iki tane argüment olan bunun deðerlerinialacak 3 argüment olan aþaðýdakini 
		
		ortalama(10, 34, 33); // burasý int ama methodda double olursa int methoddan daha küçük olduðu için
							// kabul eder
							// methodda double kullanmak en mantýklýsý

		// java adý ortalama olan ve PARAMETRESÝ 3 olan bir method arayacak
		// daha sonra argümentlerle paramaetrenin uyumuna bakar 10---> double sayi1 e uyuyor mu uyuyor devam keeeee

	}// main method son u

	public static void ortalama(double sayi1, double sayi2, double sayi3) {

		System.out.println((sayi1 + sayi2 + sayi3) / 3);
	}

	public static void ortalama(double sayi1, double sayi2) {

		System.out.println("girdiðiniz iki sayýnýn ortalamasý " + (sayi1 + sayi2) / 2);

	}

}// class sonu
