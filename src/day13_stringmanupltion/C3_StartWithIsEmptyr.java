package day13_stringmanupltion;

public class C3_StartWithIsEmptyr {

	public static void main(String[] args) {
		/*
		 * endwithle �al��ma mant��� ayn�d�r ba�lang�c� kontrol eder true ya da false
		 * ��kt�s� al�r
		 * 
		 * 
		 */

		String str = "her g�n java olsa ";
		System.out.println(str.startsWith("g", 4)); // 4. indeksten sonras�ndan g ile mi ba�l�yoru d�nd�r�r

		System.out.println(str.startsWith("her ")); // true

		System.out.println(str.startsWith("e")); // false

		System.out.println(str.startsWith("java", 7)); // 7. indeks ve sonras� java ile mi ba�l�yor hay�r 8. ile
														// ba�l�yor

		System.out.println(str.isEmpty()); // bo�lukla ba�lam�yor

		String str2 = "";

		System.out.println(str2.isEmpty()); // true

//		String str3 = null;// null bir de�er de�ildir 
							// sadece str3 �n hi�bir �eye e�it olmad���n� g�steren bir PO�NTER d�r 

//			System.out.println(str3.isEmpty()); // rte hatas� verir
		
		System.out.println(str2.isBlank());

	}

}
