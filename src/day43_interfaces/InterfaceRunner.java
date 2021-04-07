package day43_interfaces;

public class InterfaceRunner implements Interface02 {
	
	public static void main(String[] args) {
	
		/**
		 	/*
      - Interfaces : interface class degildir, interface interface'dir.
      - Interface, icinde sadece shild class'larin implement etmek zorunda old.
       abstract method'lar olan bir sablon gibidir.(to do list)
      - Bir interface'de tum method'lar abstract ve public'dir(yazilsa da yazilmasa da)
      - Bir interface'de tum variable'lar public,static ve final'dir. (yazilsa da yazilmasa da),
       Bu yuzden variable'lara mutlaka deger atanmlaidir(yoksa CTE verir) .
      - Interface'de constructor yoktur, dolayisiyla instantiate edilemezler yani interface'den obje olusturulamaz.
      - Bir class'i interface'echild yapmak icin implements keyword kullanilir. 
       Birden fazla interface'e implements ile child olunabilir. Bu durumda bir kere implements yazilip,
       sonra tum parent interface'ler virgule ayrilarak art arda yazilir. 
       Ancak interface'e chil yapmak istersek yine extends kullanilir. (InterfaceClass1 extends InterfaceClass2)
      - Hiz acisindan anstract class'a gore yavastir.  
     */
		 
		
		/*
		 	static olarak tanýmlanmýþ bir variable veya method 
		 		baþka clasdan clasIsmi.methodIsmi þeklinde çaðýrýlabilir
		 */
		
		Interface02.deneme2();
		
		//default keywordu ile oluþturduðumuz method ise obje üzerinden çaðýrýlabilir
		InterfaceRunner obj = new InterfaceRunner();
		obj.deneme();

	}
}

