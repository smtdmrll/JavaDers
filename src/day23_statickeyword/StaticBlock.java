package day23_statickeyword;

public class StaticBlock {

	static String isim;
	//STAT�C BLOCK class �al��t���nda ilk olarak �al���r (main method dan bile �NCE �al���r )
	// STAT�C BLOCK lar static variable lara de�er atamak i�in kullan�r 

	
	static {
		System.out.println("2. static block �al��t� ");
	}

	public static void main(String[] args) {

		isim="Alican";
		System.out.println(isim);
		
	}
	
	static {// mainden sonra yaz�lsa bile �nce static blocklar kendi aras�nda s�ralan�r sonra main �al���r 
		
		isim = "mehmet";
		System.out.println(isim);
	}
}
