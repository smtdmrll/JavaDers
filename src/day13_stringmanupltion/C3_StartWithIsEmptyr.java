package day13_stringmanupltion;

public class C3_StartWithIsEmptyr {

	public static void main(String[] args) {
		/*
		 * endwithle çalýþma mantýðý aynýdýr baþlangýcý kontrol eder true ya da false
		 * çýktýsý alýr
		 * 
		 * 
		 */

		String str = "her gün java olsa ";
		System.out.println(str.startsWith("g", 4)); // 4. indeksten sonrasýndan g ile mi baþlýyoru döndürür

		System.out.println(str.startsWith("her ")); // true

		System.out.println(str.startsWith("e")); // false

		System.out.println(str.startsWith("java", 7)); // 7. indeks ve sonrasý java ile mi baþlýyor hayýr 8. ile
														// baþlýyor

		System.out.println(str.isEmpty()); // boþlukla baþlamýyor

		String str2 = "";

		System.out.println(str2.isEmpty()); // true

//		String str3 = null;// null bir deðer deðildir 
							// sadece str3 ün hiçbir þeye eþit olmadýðýný gösteren bir POÝNTER dýr 

//			System.out.println(str3.isEmpty()); // rte hatasý verir
		
		System.out.println(str2.isBlank());

	}

}
