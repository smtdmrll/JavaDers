package day39_exceptions;

public class Exceptions05 {

	public static void main(String[] args) {

		/*
		 	null ile tanýmlanmýþ nir obje uygun olmayan bir iþlem yapmaya çalýþtýðýnýzda 
		 		Java NullPointerException verir
		 		yani UNCHECKED EXC dir 
		 		
		 */
		
		String str1 = " ";
		String str2 = "";
		String str3 = null; //null bir deðer deðil str3 ðn hiçbir þeye eþit olmadýðýný söyleyen pointer
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		//System.out.println(str3.length()); //NullPointerException
		
		System.out.println(str3+"boss");//nullboss
	}
}

















































