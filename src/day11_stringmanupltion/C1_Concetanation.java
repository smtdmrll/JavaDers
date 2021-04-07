package day11_stringmanupltion;

public class C1_Concetanation {

	public static void main(String[] args) {
		/*
		 * HATIRLATMA
		 * 
		 * concetenation : javada + iþlemi yapýlýrken eðer toplanan ifadelerden biri veya her ikisi string ise
		 * java concetenation yapar yani toplama deðil BÝRLEÞTÝRME yapar 
		 * 
		 */

		System.out.println(15+20+"merhaba");      	//35MERHABA
		System.out.println("MERHABA"+ 15 + 20 ); 	//MERHABA1520
		System.out.println("merhaba"+ 15*20);		//merhaba300
		
		String str1= "hay";
		String str2= "biçýs" ;
		
		System.out.println(str1+str2);
		
		// str1.concat(str2) methdu str1 in sonuna str2 iyi ekler 
		
		System.out.println(str1.concat(str2)); //haybiçýs
		
		System.out.println(str1.concat(" ").concat(str2));// istediðin kadar concat yapabilirsin hay biçs  yazdýrýr oþluk býraktýrmýþ oluruz 
		
		System.out.println(str1.concat(" "+ str2)); // hay biçýs yazar yani boþluk býrakýr
	}

}
