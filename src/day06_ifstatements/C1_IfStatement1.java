package day06_ifstatements;

public class C1_IfStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		int b=8;
		
		if (a>b) {// 10>8 ise body nin içine girer deðilse girmez
			
			System.out.println("ilk sayi buyuk ");			
		}
		
		if (a*b<0) {
			System.out.println("sayilarin carpimi negatif baba");
		}
	
		if (a<b || b>0 ) {
			System.out.println("orrrrr lu cümle çalýþtý");
			
		}
		
		if (a-b>0 && a*b>0) {
			System.out.println("and cümlesi çalýþtý lo ");
		}
	}

}
