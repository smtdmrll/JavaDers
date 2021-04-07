package day14_methodcreation;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		/*
		 * 1)java methodlarýn sadece ismine deðil, isim + parametrelere bakar sadece
		 * parametre sayýsý deðil parametrelerin data tiplerine de bakar
		 */

		String str = "java çok güzel";
		str.endsWith("el"); // bu methodun görevi gidip kelimenin son kýsmýný kontrol etmek
							// bu methodu kullanmak için bu methodun kontrol ettikten sonra
							// bana rapor olarak ne getirdiðini bilmem lazým (true/false)

		/*
		 * 2) bir method oluþturduðumuzda methodun ne yapacaðýna ve görevi yaptýktan
		 * sonra bana ne döndüreceðine baþtan karar vermeliyiz
		 */

		/*
		 * 3) bir method oluþturulurken örn str.indexOf(String str, int fromindex) gibi
		 * dýþarýdan kabul edeceði parametreleri ve bu parametrelerin data tiplerini
		 * declare(deklare) etmeliyiz
		 * 
		 * methodu çalýþtýrmak istediðimde (methodu çaðýrmak)Parametre olarak declare
		 * edilen data tiplerine uygun deðerler girmeliyiz
		 * 
		 * Girilen bu deðerlere ARGUMENT denir
		 * 
		 * 
		 */

		str.indexOf("va", 1); // bu methodu çalýþtýrmak istediðimizde data tipi stringe
								// uygun bir deðer yazmamýz gerek
		


	}

}
