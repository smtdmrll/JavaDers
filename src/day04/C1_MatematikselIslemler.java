package day04;

public class C1_MatematikselIslemler {

	public static void main(String[] args) {
		
		int num=38/2*(4+3)*2;
		
		System.out.println(num);
		
		int num1= 8+2 * (14-6/2) - 12 ;
		
		System.out.println(num1);
	
		int num2= 10 ;
		
		double num3 = num*num1/num2; // 478.8  bulur ama iþlem yapýlan bütün tipler int sonucu tam alýr 
	
		//daha sonra eþitliðin sað tarafý int olduðu için auto widening yapýp double a çevirir 
		// yani iþlem sonucu 478.8 çýkar int le 478 bulur daha sonra aw ile 478.0 olarak çýktý verir.
		
		
		System.out.println(num3);
	
		double num4 = 24.56;
		double num5= 14.2;
		
		double num6 = num4/ num5;
		
		System.out.println(num6);
		System.out.println(num4/num2); //biri double biri int olunca büyük boyutla olaný alýr 
		
		
		double num7 = (double) num*num1/num2; // 478,8 çünkü auto widening yapar
		
		
		System.out.println(num7);
		
		
		
		
	}

}
