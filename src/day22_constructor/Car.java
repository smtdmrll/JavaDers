package day22_constructor;

public class Car {
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	public static void main(String[] args) {
		
		Car car1= new Car (); // burda " Car() "bir constructor d�r yani obje �retmek i�in class ad� + obje ad� = new Constroctor; �eklinde ol�.							
		
		/*
		 * bir obje olu�turuldu�unda e�itli�in sa��nda MUTLAKA CONSTRUCTOR olmal�d�r 
		 * 
		 * Constructor ismi class ismi ile ayn� olmal�d�r
		 * 
		 * Constructor da mutlakka () olmal�d�r 
		 * 
		 * Constructor parametre olmas� iste�e ba�l�d�r
		 */
		

		System.out.println(car1.marka+" " + car1.model+" " + car1.yil+" "+car1.kazasiVarMi);
							// null 			null 			0				 false	
		car1.marka= "Toyota ";
		car1.model="Corolla ";
		car1.yil=2010;
		car1.kazasiVarMi= false; // yazmasan da olur default de�eri false zaten 
		
		System.out.println(car1.marka+" " + car1.model+" " + car1.yil+" "+car1.kazasiVarMi);
							// Toyota	 	 Corolla		  2010				 false

		Car car2=new Car();
		
		car2.marka= "Opel ";
		car2.model="Astra ";
		car2.yil=2015;
		car2.kazasiVarMi= true; 
		
		
		System.out.println(car2.marka+" " + car2.model+" " + car2.yil+" "+car2.kazasiVarMi);
							//opel			astra				2015		true
		
		car1.kazasiVarMi=true; // car 1 e ait herhangi bir �zelli�i de�i�tirebiliriz
		
		System.out.println(car1.marka+" " + car1.model+" " + car1.yil+" "+car1.kazasiVarMi);
							// Toyota	 	 Corolla		  2010				 true

		
		
		
		
		
		
		
		
	}

}
