package day03_scannerIncrementDecrement;

public class C5_Artirmaazaltma {
	
	public static void main(String[] args) {
		
		int num=15;
		
		int num2= num + 2 ;
		
		System.out.println(num2);
		System.out.println(num);
		
		num=num+5; //e�itli�in solunda num yazd���m�zda e�itli�in sa��ndaki i�lemde olu�an sonu� 
		// num variable�na atan�r. BU SATIRDAN SONRA num = 20
		
		System.out.println("16. sat�rdan sonra num: " + num );
		
		System.out.println(num + 12 );
		
		//bir say�y� art�rmak(increment) istersek o say�ya istedi�imiz say�y� ekler ve sonucu 
		//variable a atar�z
		
		//num i 8 art�r 
		
		num= num+8 ; //num=28 olur art�k 
		
		//num � 5 daha art�r ama kolay yoldan yani ikinci se�enek 
		
		num+=5; //num art�k 33 oldu 
		
		System.out.println(num );
		
		num+=10; //num =43 
		
		num+=1; //44
		
		num++; //num 45 
		
		System.out.println(num);
		
		
	}

}
