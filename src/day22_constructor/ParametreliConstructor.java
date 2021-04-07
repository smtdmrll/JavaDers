package day22_constructor;

public class ParametreliConstructor {
	
	

	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	public ParametreliConstructor(int yil) {//1
		this.yil= yil;
	}
	
	public ParametreliConstructor() {//2
		
	}
	public ParametreliConstructor(String marka, String model) {//3
		
	}
	public ParametreliConstructor(String marka, String model, int yil, boolean kazasiVarMi) {//4
		this.marka=marka; 
		this.model=model;
		this.yil=yil;
		this.kazasiVarMi=kazasiVarMi;
	}
	
	public void yakit(String yakit) {
		System.out.println("Araba yakýt olarak " + yakit + " kullanýr ");
	}

	public void vites(String vites) {
		System.out.println("araba " + vites + " viteslidir");
	}

}
