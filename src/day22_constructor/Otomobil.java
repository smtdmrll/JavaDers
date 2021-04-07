package day22_constructor;

public class Otomobil {
	
	public Otomobil(String renk){ // istersek cons u parametreli olarak oluþturabilirz
	}
	
	// biz bir cons oluþturduðumuzda java default olaný yok eder 
	//dolayýsýyla biz bir cons oluþturduðumuzda MUTLAKA default cons ýn yerine de bir cons yazmalýyýz 
	
	public Otomobil () {
		
	}
	
	//ÖNEMLÝ NOT : Default constructor dan baþka bir cons yazdýðýmýzda 
	//	java default olaný yok ettiði  için MUTLAKA AMA MUTLAKA default yerine de constructor yazmalýyýz 
	
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	
	public void yakit(String yakit) {
		System.out.println("Araba yakýt olarak " + yakit + " kullanýr ");
	}

	public void vites(String vites) {
		System.out.println("araba " + vites + " viteslidir");
	}


}
