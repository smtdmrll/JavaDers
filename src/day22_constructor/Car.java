package day22_constructor;

public class Car {
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	public static void main(String[] args) {
		
		Car car1= new Car (); // burda " Car() "bir constructor dýr yani obje üretmek için class adý + obje adý = new Constroctor; þeklinde olþ.							
		
		/*
		 * bir obje oluþturulduðunda eþitliðin saðýnda MUTLAKA CONSTRUCTOR olmalýdýr 
		 * 
		 * Constructor ismi class ismi ile ayný olmalýdýr
		 * 
		 * Constructor da mutlakka () olmalýdýr 
		 * 
		 * Constructor parametre olmasý isteðe baðlýdýr
		 */
		

		System.out.println(car1.marka+" " + car1.model+" " + car1.yil+" "+car1.kazasiVarMi);
							// null 			null 			0				 false	
		car1.marka= "Toyota ";
		car1.model="Corolla ";
		car1.yil=2010;
		car1.kazasiVarMi= false; // yazmasan da olur default deðeri false zaten 
		
		System.out.println(car1.marka+" " + car1.model+" " + car1.yil+" "+car1.kazasiVarMi);
							// Toyota	 	 Corolla		  2010				 false

		Car car2=new Car();
		
		car2.marka= "Opel ";
		car2.model="Astra ";
		car2.yil=2015;
		car2.kazasiVarMi= true; 
		
		
		System.out.println(car2.marka+" " + car2.model+" " + car2.yil+" "+car2.kazasiVarMi);
							//opel			astra				2015		true
		
		car1.kazasiVarMi=true; // car 1 e ait herhangi bir özelliði deðiþtirebiliriz
		
		System.out.println(car1.marka+" " + car1.model+" " + car1.yil+" "+car1.kazasiVarMi);
							// Toyota	 	 Corolla		  2010				 true

		
		
		
		
		
		
		
		
	}

}
