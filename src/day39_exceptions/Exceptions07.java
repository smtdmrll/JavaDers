package day39_exceptions;

public class Exceptions07 {
	public static void main(String[] args) {
		/*
		 	
		 	data t�rlerini casting yaparken uygun olmayan i�lem yaparsan�z 
		 		Java ClassCastException verir
		 	
		 	E�er tamamen say�lardan olu�mayan bir stringi integera �evirmeye �al���rsan 
		 		java NumberFormatException verir
		 */
	int sayi = 10;
//	String str =sayi; //cte
	
	String str="1234";
		
	
	System.out.println(str +10); //123410
	
	int sayiStr= Integer.parseInt(str);
	
	System.out.println(sayiStr+10);//1244
		
	String str2 ="123a45";
	
	//System.out.println(Integer.parseInt(str2)); //NumberFormatException
	
	Object sayi2=40;
	
	String strSayi= (String) sayi2; // explicit narrowing casting 
									//ClassCastException
		
		
		
	}
}
