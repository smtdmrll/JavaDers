package day23_statickeyword;

public class StaticBlock {

	static String isim;
	//STATÝC BLOCK class çalýþtýðýnda ilk olarak çalýþýr (main method dan bile ÖNCE çalýþýr )
	// STATÝC BLOCK lar static variable lara deðer atamak için kullanýr 

	
	static {
		System.out.println("2. static block çalýþtý ");
	}

	public static void main(String[] args) {

		isim="Alican";
		System.out.println(isim);
		
	}
	
	static {// mainden sonra yazýlsa bile önce static blocklar kendi arasýnda sýralanýr sonra main çalýþýr 
		
		isim = "mehmet";
		System.out.println(isim);
	}
}
