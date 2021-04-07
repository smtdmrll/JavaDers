package day18_whileloop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		/*
		 * verilen sayýnýn asal olup olmadýðýný bulan bir program yazýn 
		 */
		
		
		int sayi = 41 ;
		String flag = "asal"; // flag bayrak bizim istediðimiz þartýn gerçekleþip gerçekleþmediini kontrol eder
		int bolen=2;
		while (bolen<sayi ) {
			if (sayi % bolen== 0 ) {
				flag="asal deðil " ;
			}
			bolen++;
		}
		System.out.println(flag);
	}

}
