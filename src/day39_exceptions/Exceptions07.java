package day39_exceptions;

public class Exceptions07 {
	public static void main(String[] args) {
		/*
		 	
		 	data türlerini casting yaparken uygun olmayan iþlem yaparsanýz 
		 		Java ClassCastException verir
		 	
		 	Eðer tamamen sayýlardan oluþmayan bir stringi integera çevirmeye çalýþýrsan 
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
