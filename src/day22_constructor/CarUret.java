package day22_constructor;

public class CarUret {
	
	//�u anda bu classta g�r�n�r bir CONSTRUCTOR YOK 
	// bir class olu�turuldu�udnda java bu classdan obje �retece�ini bilir 
	//ve g�r�nmeyen yani DEFAULT CONSTRUCTOR classa yerle�tirilir.
	//default constructor parametresizdir.Dolay�s�yla sadece hi�bir �zelli�i tan�mlanamayn objeler �retir(ti��rt �ret)
	//default constructor ile �retilen bir objenin t�m �zellikleri sonradan tan�mlanmal�d�r 
	
	//e�er biz sonradan bir constructor yazarsak java default constructor � �LD�R�R
	
	//bir constructor olu�tural�m 
		
	public CarUret(){ // public yazmazsak ayn� packagete kullanabiliriz fakatt farkl� packagelerde kul i�in mecbur public yazar�z 
		
	}
	/*
	 * 1- ismi class ile ayn� olmal�d�r(yani b�y�k harfle ba�lar)
	 * 2- constructor return type a sahip de�ildir 
	 * 3- constructor isminden sonra MUTLAKA parantesz olur ama parametre olmas� opsiyoneldir
	 * 4- bir constructor olu�turuldu�unda kimlerin kullanaca��n� belirlemek i�in acces modifier yaz�l�r 
	 */
	
	
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	/*
	 * bir programda �ok fazla �retece�imiz objeler i�in bir tane class olu�tururuz
	 * bu classta olu�turulacak objelere ait t�m �zellikler olur 
	 * bu class direkt �al��t�r�lmayaca�� i�in main method olmasa da olur (kal�phane gibidir)
	 */

	public static void main(String[] args) {

	}

	public void yakit(String yakit) {
		System.out.println("Araba yak�t olarak " + yakit + " kullan�r ");
	}

	public void vites(String vites) {
		System.out.println("araba " + vites + " viteslidir");
	}

}
