package day11_stringmanupltion;

public class C1_Concetanation {

	public static void main(String[] args) {
		/*
		 * HATIRLATMA
		 * 
		 * concetenation : javada + i�lemi yap�l�rken e�er toplanan ifadelerden biri veya her ikisi string ise
		 * java concetenation yapar yani toplama de�il B�RLE�T�RME yapar 
		 * 
		 */

		System.out.println(15+20+"merhaba");      	//35MERHABA
		System.out.println("MERHABA"+ 15 + 20 ); 	//MERHABA1520
		System.out.println("merhaba"+ 15*20);		//merhaba300
		
		String str1= "hay";
		String str2= "bi��s" ;
		
		System.out.println(str1+str2);
		
		// str1.concat(str2) methdu str1 in sonuna str2 iyi ekler 
		
		System.out.println(str1.concat(str2)); //haybi��s
		
		System.out.println(str1.concat(" ").concat(str2));// istedi�in kadar concat yapabilirsin hay bi�s  yazd�r�r o�luk b�rakt�rm�� oluruz 
		
		System.out.println(str1.concat(" "+ str2)); // hay bi��s yazar yani bo�luk b�rak�r
	}

}
