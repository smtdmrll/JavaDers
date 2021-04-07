package day39_exceptions;

public class Exceptions05 {

	public static void main(String[] args) {

		/*
		 	null ile tan�mlanm�� nir obje uygun olmayan bir i�lem yapmaya �al��t���n�zda 
		 		Java NullPointerException verir
		 		yani UNCHECKED EXC dir 
		 		
		 */
		
		String str1 = " ";
		String str2 = "";
		String str3 = null; //null bir de�er de�il str3 �n hi�bir �eye e�it olmad���n� s�yleyen pointer
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		//System.out.println(str3.length()); //NullPointerException
		
		System.out.println(str3+"boss");//nullboss
	}
}

















































