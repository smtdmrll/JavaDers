package day03_scannerIncrementDecrement;

public class C5_Artirmaazaltma {
	
	public static void main(String[] args) {
		
		int num=15;
		
		int num2= num + 2 ;
		
		System.out.println(num2);
		System.out.println(num);
		
		num=num+5; //eşitliğin solunda num yazdığımızda eşitliğin sağındaki işlemde oluşan sonuç 
		// num variableına atanır. BU SATIRDAN SONRA num = 20
		
		System.out.println("16. satırdan sonra num: " + num );
		
		System.out.println(num + 12 );
		
		//bir sayıyı artırmak(increment) istersek o sayıya istediğimiz sayıyı ekler ve sonucu 
		//variable a atarız
		
		//num i 8 artır 
		
		num= num+8 ; //num=28 olur artık 
		
		//num ı 5 daha artır ama kolay yoldan yani ikinci seçenek 
		
		num+=5; //num artık 33 oldu 
		
		System.out.println(num );
		
		num+=10; //num =43 
		
		num+=1; //44
		
		num++; //num 45 
		
		System.out.println(num);
		
		
	}

}
