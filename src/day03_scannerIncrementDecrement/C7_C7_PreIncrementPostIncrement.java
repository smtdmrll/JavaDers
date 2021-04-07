package day03_scannerIncrementDecrement;

public class C7_C7_PreIncrementPostIncrement {

	public static void main(String[] args) {
		
		int num=20 ;
		
		num++;
		
		System.out.println(num);//21
		System.out.println(num++);	//21	önce yazdýrýyor sonra artýrýyor 
		System.out.println(num);//22
		
		System.out.println(++num);//23
		System.out.println(num); //23
		
		//--num dersek önce çýkarma iþlemi yapar sonra içinde bulunduðu iþlemi yapar ( buna statement deniyr)
		//num-- dersek önce içinde bulunduðu iþlemi yapar sonra eksiltir 
		// bunlarýn aynýsý pozitif sayýlar içinde geçerldir
		
		// bu num+= ya da num -= gibi ifadelerde geçerli deðildir sadece ++ ve -- metodlarýnda geçerlidir
		// ++ ve -- için önde mi arkada mý olduðuna bakacz 
		
		int num1 = 12;
				System.out.println(num1-=3); //9
		
		
	}

}
