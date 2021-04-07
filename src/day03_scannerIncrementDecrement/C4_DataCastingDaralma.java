package day03_scannerIncrementDecrement;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		
		//double bir deðiþken oluþturalým ve bunu int ve sonra da byte a çevir lan 
		
		
		double numDouble= 400.56; 
		//ilk deðerimiz 131.56 idi bu deðerde -125 aldý
		// daha sonra deneme amaçlý 400.56 yaptýk
		
		int numInt= (int) numDouble ;
		
		// double dan integer a geçerken eðer sayýda ondalýklý bölüm varsa 
		// java ondalýklý bölümü siler tam sayý kýsmýný alýr 
		
		System.out.println("intijýýr için baboþ: "+numInt );
		
		byte numByte= (byte) numInt ;
		 System.out.println("bayt için baboþ : "+numByte);
		 
		 //byte -128 ile 127 arasý deðer alýr. double 131.56 yý byte a çevirirken 127 ye kadar sayar 
		 //kalan 4 adýmý -128 den düþmeye baþlar 131 içim  -128 -127 -126 (-125) deðerini alýr. 
		 
		 
		 // genel olarak daha dar data tipine çevirirken eðer data tipinin sýnýrýnda büyükse
		 // sýnýr negatif deðerinden saymaya devam eder 
		 
		 
		 
		 
		 
		

	}

}
