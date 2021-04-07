package day22_constructor;

public class Otomobil {
	
	public Otomobil(String renk){ // istersek cons u parametreli olarak olu�turabilirz
	}
	
	// biz bir cons olu�turdu�umuzda java default olan� yok eder 
	//dolay�s�yla biz bir cons olu�turdu�umuzda MUTLAKA default cons �n yerine de bir cons yazmal�y�z 
	
	public Otomobil () {
		
	}
	
	//�NEML� NOT : Default constructor dan ba�ka bir cons yazd���m�zda 
	//	java default olan� yok etti�i  i�in MUTLAKA AMA MUTLAKA default yerine de constructor yazmal�y�z 
	
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	
	public void yakit(String yakit) {
		System.out.println("Araba yak�t olarak " + yakit + " kullan�r ");
	}

	public void vites(String vites) {
		System.out.println("araba " + vites + " viteslidir");
	}


}
