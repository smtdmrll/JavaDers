package day18_whileloop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		/*
		 * verilen say�n�n asal olup olmad���n� bulan bir program yaz�n 
		 */
		
		
		int sayi = 41 ;
		String flag = "asal"; // flag bayrak bizim istedi�imiz �art�n ger�ekle�ip ger�ekle�mediini kontrol eder
		int bolen=2;
		while (bolen<sayi ) {
			if (sayi % bolen== 0 ) {
				flag="asal de�il " ;
			}
			bolen++;
		}
		System.out.println(flag);
	}

}
