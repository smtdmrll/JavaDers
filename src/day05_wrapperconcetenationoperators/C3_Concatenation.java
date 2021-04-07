package day05_wrapperconcetenationoperators;

public class C3_Concatenation {

	public static void main(String[] args) {
		
		//concatenation(birle�tirme ): Javada birden fazla string i + i�areti ile 
		//toplarsan�z, java 
		
		String str1="java ";
		String str2="g�zeldr";
		
		System.out.println(str1+str2); //javag�zeldir
		// e�er arada bo�luk istersen araya �ift t�rnak bo�luk b�rak 
		
		System.out.println(str1+" "+str2 ); 
		// g�zeldir java
		
		System.out.println(str2+str1);
		
		int sayi1=5;
		int sayi2=4;
		
		//verilen de�i�kenleri kullanarak9 yazd�r�n 
		System.out.println(sayi1+sayi2);
		
		System.out.println(sayi1+sayi2+ str1+str2);//9javaguzxeldi
		
		System.out.println(str1+str2+sayi1+sayi2);//javaguzeldir54

		//javag�zeldir1
		
		System.out.println(str1+str2+(sayi1-sayi2));//
		
		System.out.println(sayi1+sayi2 +' ' +str1+str2);// bo�luk asc�� kar��l���32 sonu� 41javag�zeldir
		
		//java matematiksel bir i�lem yaparken char t�r�nden bir de�erle kar��la��rsa 
		//o char�n asc�� de�erini al�r 
		
		System.out.println(sayi1+sayi2+str1+' '+ str2);//9java g�zeldir 
		
		//chardan �nce int varsa asc�� de�eri string varsa no�luk olarak al�r
		
		System.out.println(str1+str2+sayi1*sayi2);
		
		/*
		 * son tekrar
		 * 
		 * kural1) e�er toplanan de�erlerden bir tanesi bile string de�ilse java concatenation yapar
		 * 
		 * kural2) e�er toplanan de�erlerin ikisi de matematiksel i�lemse toplar 
		 * 
		 * kural3) e�er say� ve string de�i�kenler birlikte kullan�lacaksa �ncliklerbelirlenip
		 * o i�lemler i�in parantez kullan�labilir 
		 * 
		 * kural4) matematiksel bir i�lemde char de�i�ken kullan�l�rsa java char � ascii kar��l���n� al�r
		 * 
		 * kural5) charla string toplan�rsa char concatenation yapar
		 */
		
	}

}
