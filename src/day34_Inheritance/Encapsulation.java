package day34_Inheritance;

public class Encapsulation {

	private String okulIsmi = "Yýldýz Koleji";
	private int okulHesapNo = 12345;
	private boolean okulAcikMi = true;

//	private static int sayi=10; // static metodunun private yapýlmasý mantýksýz 
								// zaten static metodu her yerden ulaþýlsýn diye yapýlýyot

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public int getOkulHesapNo() {
		return okulHesapNo;
	}
	
	public boolean isOkulAcikMi() { // boolean olanlarýn getterý is diye baþlar get diye deðil 
		return okulAcikMi;
	}
	
	public void setOkulIsmi(String okulIsmi) { 
		this.okulIsmi=okulIsmi;
	}

	public void setOkulHesapNo (int okulHesapNo) {
		this.okulHesapNo= okulHesapNo;
	}
	
	public void setOkulAcikMi(boolean okulAcikMi) {
		this.okulAcikMi=okulAcikMi;
	}
	

	
}
