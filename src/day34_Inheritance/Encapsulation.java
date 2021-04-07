package day34_Inheritance;

public class Encapsulation {

	private String okulIsmi = "Y�ld�z Koleji";
	private int okulHesapNo = 12345;
	private boolean okulAcikMi = true;

//	private static int sayi=10; // static metodunun private yap�lmas� mant�ks�z 
								// zaten static metodu her yerden ula��ls�n diye yap�l�yot

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public int getOkulHesapNo() {
		return okulHesapNo;
	}
	
	public boolean isOkulAcikMi() { // boolean olanlar�n getter� is diye ba�lar get diye de�il 
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
