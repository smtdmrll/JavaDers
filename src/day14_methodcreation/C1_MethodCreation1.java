package day14_methodcreation;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		/*
		 * 1)java methodlar�n sadece ismine de�il, isim + parametrelere bakar sadece
		 * parametre say�s� de�il parametrelerin data tiplerine de bakar
		 */

		String str = "java �ok g�zel";
		str.endsWith("el"); // bu methodun g�revi gidip kelimenin son k�sm�n� kontrol etmek
							// bu methodu kullanmak i�in bu methodun kontrol ettikten sonra
							// bana rapor olarak ne getirdi�ini bilmem laz�m (true/false)

		/*
		 * 2) bir method olu�turdu�umuzda methodun ne yapaca��na ve g�revi yapt�ktan
		 * sonra bana ne d�nd�rece�ine ba�tan karar vermeliyiz
		 */

		/*
		 * 3) bir method olu�turulurken �rn str.indexOf(String str, int fromindex) gibi
		 * d��ar�dan kabul edece�i parametreleri ve bu parametrelerin data tiplerini
		 * declare(deklare) etmeliyiz
		 * 
		 * methodu �al��t�rmak istedi�imde (methodu �a��rmak)Parametre olarak declare
		 * edilen data tiplerine uygun de�erler girmeliyiz
		 * 
		 * Girilen bu de�erlere ARGUMENT denir
		 * 
		 * 
		 */

		str.indexOf("va", 1); // bu methodu �al��t�rmak istedi�imizde data tipi stringe
								// uygun bir de�er yazmam�z gerek
		


	}

}
