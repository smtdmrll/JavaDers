package day03_scannerIncrementDecrement;

public class C7_C7_PreIncrementPostIncrement {

	public static void main(String[] args) {
		
		int num=20 ;
		
		num++;
		
		System.out.println(num);//21
		System.out.println(num++);	//21	�nce yazd�r�yor sonra art�r�yor 
		System.out.println(num);//22
		
		System.out.println(++num);//23
		System.out.println(num); //23
		
		//--num dersek �nce ��karma i�lemi yapar sonra i�inde bulundu�u i�lemi yapar ( buna statement deniyr)
		//num-- dersek �nce i�inde bulundu�u i�lemi yapar sonra eksiltir 
		// bunlar�n ayn�s� pozitif say�lar i�inde ge�erldir
		
		// bu num+= ya da num -= gibi ifadelerde ge�erli de�ildir sadece ++ ve -- metodlar�nda ge�erlidir
		// ++ ve -- i�in �nde mi arkada m� oldu�una bakacz 
		
		int num1 = 12;
				System.out.println(num1-=3); //9
		
		
	}

}
