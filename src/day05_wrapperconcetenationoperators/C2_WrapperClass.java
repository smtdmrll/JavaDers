package day05_wrapperconcetenationoperators;

public class C2_WrapperClass {

	public static void main(String[] args) {
		
		// javada iki tür data tipi vardý p ve n-p
		// primitive sadece VALUE ÝÇERÝR
		//n-p ise DEÐER VE METOD ÝÇERÝR
		
		String isim= "samet" ;
		System.out.println(isim.toUpperCase());
		
		// ÖNEMLÝ!!!! Wrapper class: javanýn primitive data türleri ile bazý metodlarý 
		//			kullanabilmemiz için oluþturduðu classlardýr 
		
		// boolean, char, byte,short,int,long,float,double
		
		 // ------------>>> byte sayi = 10;
		
		Byte sayi2=11; //ismen primitive data türü ile ayný olan 
		//			non-p datalara wrapper denir.
		
		System.out.println(sayi2);
		
		Byte byteMinSayi= Byte.MIN_VALUE;		
		System.out.println(byteMinSayi);
		
		Byte byteMaxSayi= Byte.MAX_VALUE;
		System.out.println(byteMaxSayi);
		
		// variable oluþturmadan direkt olarak short un en küçük ve en büyük deðerlerini yazdýralým 
		
		System.out.println(" "+Short.MAX_VALUE+" ve max" +Short.MIN_VALUE);
		
		//int wrapper classý Integer
		//int en büyük ve en küçük deðeri yaz 
		
		System.out.println(" "+Integer.MAX_VALUE+" ve "+Integer.MIN_VALUE); //UNUTMA BAÞINA " " KOYMANIN SEBEBÝ TAMAMINI STRÝNG ALGILAMASINI SAÐLAMAK ÝÇÝN 
		
		
		/*
		 * Boolean
		 * Character
		 * Byte
		 * Short
		 * Integer					primitiveler için wraper classlarý 
		 * Long
		 * Float
		 * Double
		 */
		
		
		
		
		
		
		
		
		
		
		

	}

}
