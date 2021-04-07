package day01_variables;

public class C4_Variables3 {

	public static void main(String[] args) {
	
		String isim1= "Java" ;
		String isim2= "Guzel";
		String bos=" ";
		
		System.out.println(isim1+bos+isim2);
		
		int sayi1 = 5 ;
		int sayi2=7;
		
		System.out.println(sayi1+sayi2+bos+isim1); // int le baþladýðý için 
		System.out.println(isim1+ sayi1+sayi2); // farklý variablelarda ilk deðiþkene göre 
		//  devam eder java yazdý 5 yazdý 7 yazdý

	}

}
