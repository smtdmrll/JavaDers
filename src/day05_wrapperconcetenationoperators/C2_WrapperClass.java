package day05_wrapperconcetenationoperators;

public class C2_WrapperClass {

	public static void main(String[] args) {
		
		// javada iki t�r data tipi vard� p ve n-p
		// primitive sadece VALUE ��ER�R
		//n-p ise DE�ER VE METOD ��ER�R
		
		String isim= "samet" ;
		System.out.println(isim.toUpperCase());
		
		// �NEML�!!!! Wrapper class: javan�n primitive data t�rleri ile baz� metodlar� 
		//			kullanabilmemiz i�in olu�turdu�u classlard�r 
		
		// boolean, char, byte,short,int,long,float,double
		
		 // ------------>>> byte sayi = 10;
		
		Byte sayi2=11; //ismen primitive data t�r� ile ayn� olan 
		//			non-p datalara wrapper denir.
		
		System.out.println(sayi2);
		
		Byte byteMinSayi= Byte.MIN_VALUE;		
		System.out.println(byteMinSayi);
		
		Byte byteMaxSayi= Byte.MAX_VALUE;
		System.out.println(byteMaxSayi);
		
		// variable olu�turmadan direkt olarak short un en k���k ve en b�y�k de�erlerini yazd�ral�m 
		
		System.out.println(" "+Short.MAX_VALUE+" ve max" +Short.MIN_VALUE);
		
		//int wrapper class� Integer
		//int en b�y�k ve en k���k de�eri yaz 
		
		System.out.println(" "+Integer.MAX_VALUE+" ve "+Integer.MIN_VALUE); //UNUTMA BA�INA " " KOYMANIN SEBEB� TAMAMINI STR�NG ALGILAMASINI SA�LAMAK ���N 
		
		
		/*
		 * Boolean
		 * Character
		 * Byte
		 * Short
		 * Integer					primitiveler i�in wraper classlar� 
		 * Long
		 * Float
		 * Double
		 */
		
		
		
		
		
		
		
		
		
		
		

	}

}
