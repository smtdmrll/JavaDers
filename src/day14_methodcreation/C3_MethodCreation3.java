package day14_methodcreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		/*
		 * verilen �� double say�yn�n ortalamas�n� alan bir method yaz�n main method
		 * i�inde �a��rarak methodu �al��t�r�n
		 */

		ortalama (10, 20); // methodlarda iki tane arg�ment olan bunun de�erlerinialacak 3 arg�ment olan a�a��dakini 
		
		ortalama(10, 34, 33); // buras� int ama methodda double olursa int methoddan daha k���k oldu�u i�in
							// kabul eder
							// methodda double kullanmak en mant�kl�s�

		// java ad� ortalama olan ve PARAMETRES� 3 olan bir method arayacak
		// daha sonra arg�mentlerle paramaetrenin uyumuna bakar 10---> double sayi1 e uyuyor mu uyuyor devam keeeee

	}// main method son u

	public static void ortalama(double sayi1, double sayi2, double sayi3) {

		System.out.println((sayi1 + sayi2 + sayi3) / 3);
	}

	public static void ortalama(double sayi1, double sayi2) {

		System.out.println("girdi�iniz iki say�n�n ortalamas� " + (sayi1 + sayi2) / 2);

	}

}// class sonu
