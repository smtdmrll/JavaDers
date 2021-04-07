package day35_inheritance;

public class Memur extends Personel {
	
	public int maas;
	
	
	public Memur() {
//		super(); e�er ba�ka keyword yoksa her hal�karda �al���r ama varsa superi de yazmak zorunday�z
		System.out.println("child class parametresiz constructor �al��t�");
		
	}
	public Memur(int maa�) {
		super();
		System.out.println("child class parametreli constructor �al��t�");

	}
	/*
	 Inheritance da constructor olu�turdu�uuzda javan�n otomatik olarak cons koyduu�u SUPER() KEYWORDu �nemlidir.
	 
	 super() keyword default constructor gibidir biz g�rmesek de �al���r.
	  ancak yerine ba�ka bir keyword yazarsak etkisiz hale gelir yani �ld�n olluuuum
	  
	  ***extends varsa yerine bir �ey yazmad�k�a super constructor call �al��r
	 */

	public static void main(String[] args) {
		
		Memur obj1 = new Memur(); //personel parametresiz constructor �al��t�
								 //child class parametresiz constructor �al��t�

		System.out.println("\n----------------------------\n");
		
		Memur obj2= new Memur(500);
		
		
		
		
		
	}
}
