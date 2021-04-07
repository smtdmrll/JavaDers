package day35_inheritance;

public class Memur extends Personel {
	
	public int maas;
	
	
	public Memur() {
//		super(); eðer baþka keyword yoksa her halükarda çalýþýr ama varsa superi de yazmak zorundayýz
		System.out.println("child class parametresiz constructor çalýþtý");
		
	}
	public Memur(int maaþ) {
		super();
		System.out.println("child class parametreli constructor çalýþtý");

	}
	/*
	 Inheritance da constructor oluþturduðuuzda javanýn otomatik olarak cons koyduuðu SUPER() KEYWORDu önemlidir.
	 
	 super() keyword default constructor gibidir biz görmesek de çalýþýr.
	  ancak yerine baþka bir keyword yazarsak etkisiz hale gelir yani öldün olluuuum
	  
	  ***extends varsa yerine bir þey yazmadýkça super constructor call çalýþr
	 */

	public static void main(String[] args) {
		
		Memur obj1 = new Memur(); //personel parametresiz constructor çalýþtý
								 //child class parametresiz constructor çalýþtý

		System.out.println("\n----------------------------\n");
		
		Memur obj2= new Memur(500);
		
		
		
		
		
	}
}
