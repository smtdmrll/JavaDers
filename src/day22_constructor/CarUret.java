package day22_constructor;

public class CarUret {
	
	//þu anda bu classta görünür bir CONSTRUCTOR YOK 
	// bir class oluþturulduðudnda java bu classdan obje üreteceðini bilir 
	//ve görünmeyen yani DEFAULT CONSTRUCTOR classa yerleþtirilir.
	//default constructor parametresizdir.Dolayýsýyla sadece hiçbir özelliði tanýmlanamayn objeler üretir(tiþört üret)
	//default constructor ile üretilen bir objenin tüm özellikleri sonradan tanýmlanmalýdýr 
	
	//eðer biz sonradan bir constructor yazarsak java default constructor ý ÖLDÜRÜR
	
	//bir constructor oluþturalým 
		
	public CarUret(){ // public yazmazsak ayný packagete kullanabiliriz fakatt farklý packagelerde kul için mecbur public yazarýz 
		
	}
	/*
	 * 1- ismi class ile ayný olmalýdýr(yani büyük harfle baþlar)
	 * 2- constructor return type a sahip deðildir 
	 * 3- constructor isminden sonra MUTLAKA parantesz olur ama parametre olmasý opsiyoneldir
	 * 4- bir constructor oluþturulduðunda kimlerin kullanacaðýný belirlemek için acces modifier yazýlýr 
	 */
	
	
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	/*
	 * bir programda çok fazla üreteceðimiz objeler için bir tane class oluþtururuz
	 * bu classta oluþturulacak objelere ait tüm özellikler olur 
	 * bu class direkt çalýþtýrýlmayacaðý için main method olmasa da olur (kalýphane gibidir)
	 */

	public static void main(String[] args) {

	}

	public void yakit(String yakit) {
		System.out.println("Araba yakýt olarak " + yakit + " kullanýr ");
	}

	public void vites(String vites) {
		System.out.println("araba " + vites + " viteslidir");
	}

}
