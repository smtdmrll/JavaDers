package day03_scannerIncrementDecrement;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		
		//double bir de�i�ken olu�tural�m ve bunu int ve sonra da byte a �evir lan 
		
		
		double numDouble= 400.56; 
		//ilk de�erimiz 131.56 idi bu de�erde -125 ald�
		// daha sonra deneme ama�l� 400.56 yapt�k
		
		int numInt= (int) numDouble ;
		
		// double dan integer a ge�erken e�er say�da ondal�kl� b�l�m varsa 
		// java ondal�kl� b�l�m� siler tam say� k�sm�n� al�r 
		
		System.out.println("intij��r i�in babo�: "+numInt );
		
		byte numByte= (byte) numInt ;
		 System.out.println("bayt i�in babo� : "+numByte);
		 
		 //byte -128 ile 127 aras� de�er al�r. double 131.56 y� byte a �evirirken 127 ye kadar sayar 
		 //kalan 4 ad�m� -128 den d��meye ba�lar 131 i�im  -128 -127 -126 (-125) de�erini al�r. 
		 
		 
		 // genel olarak daha dar data tipine �evirirken e�er data tipinin s�n�r�nda b�y�kse
		 // s�n�r negatif de�erinden saymaya devam eder 
		 
		 
		 
		 
		 
		

	}

}
