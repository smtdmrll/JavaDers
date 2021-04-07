package day13_stringmanupltion;

public class C8_Trim {

	public static void main(String[] args) {
		/*
		 * kýrpma yapar 
		 * baþýnda ve sonunda olan boþluklarý temizler 
		 */
		String isim="  akþsjdba  ";
				
		isim=isim.trim();
		System.out.println(isim); //akþsjdba
	}

}
