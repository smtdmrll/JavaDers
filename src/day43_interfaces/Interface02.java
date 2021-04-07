package day43_interfaces;

public interface Interface02 {
	
	/*
	 	buradaki default ve static bizim bildiðimiz defaultla static ile ayný mý 
	 		cevap HAYIR
	 		
	 	bizim bildiðimiz default acces modifierdý
	 		bir methodda birden fazla acces modifier olur mu OLMAZ
	 		bizim interfacete oluþturduðumuz tüm methodlar zaten public ve abstract týr 

	 	interfacete default keyword kullanarak concerete method oluþturabiliriz(yani bodysi olan)
	 		buradaki default keywordu acces modifier deðil javanýn özel bir çözümüdür    
	 		buradaki default keyword yazýldýðý methodun concrete olduðunu belirtir 
	 */
	
	public default void deneme() {
		System.out.println("default lkeyword lu method çalýþtý ");
	}
	
	static void deneme2() {
		System.out.println("static keywordlu method çalýþtý");
	}
	/*
	 	yukarýda default keywordu için söylenenlerinin hepsi static için de geçerlidir. 
	 	
	 	static ve default keywordü kullanarak oluþturduðumuz methodlar override edilmek ZORUNDA DEÐÝLDÝR
	 */
	
}
