package day11_stringmanupltion;

public class C4_Equals {

	public static void main(String[] args) {
		/*
		 * str.equals(str2) str ve str2 yi karþýlaþtýrýr ve String olarak eþit olup olmadýklarýna bakar 
		 * sonuç olarak true or false döndürür (sonuç)
		
			bazý metodlarýn yaptýklarý iþlem ile döndürdükleri sonuç farklý olabilir
			bir metoda git ali ismindeki elementi sil deriz, 
			o da gidip ali yi bulur ve siler 
			bunu þöyle benzetebilir aliyi öldür dedik öldürdü öldürmesi için ispatý olarak bir parça getirir
			
		 */
		String str="Ali can";
		String str2="Ali can";
		
		//str ile str2 inin eþit olup olmadýðýný yazdýrýn 
		
		System.out.println(str.equals(str2)); // true yazdýrýr
		
		System.out.println(str.equals(str2)? "eþit": "eþit deðil");
		
		//javada strþngler case sensitive dir(büyük küçük harf duyarlýdýr) bir harf bile farklý büyüklükte olsa Stringler eþit olmaz.
		
		
		
		
		

	}

}
