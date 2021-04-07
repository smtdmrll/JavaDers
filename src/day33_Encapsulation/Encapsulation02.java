package day33_Encapsulation;

public class Encapsulation02 {
	
	private String okulIsmi ="yýldýz koleji";
	// okul isminin baþlka classlardan okunmasýnýn ama deðer atanmamasýný istiyorsak 
	//getter() metodu oluþturuyoruz
	private String  tcNo= "12345678901";
	private int hesapNo=5554321;
//	obje oluþturarak deðer deðer atanýp kullanýlmasýný istediðimiza ma
	// ilk atadýðýmýz deüerin görünmemesini istiyorsak setter() metodu kullanýrýz 
	
	public int sayi= 100;
	
	public static void main(String[] args) {
		/*
		  eðer ulaþmak istediðim class üyeleri(class member) public deðilse 
		 baþka packagelerden ulaþmak için ekstra iþlem yapmamýz gerekir  
		
		  Yapabileceðimiz iþlemlerden birincisi ENCAPSULATÝON(data saklama, data hiding)
		 bu classta kimseyle paylaþmak istemediðimiz variable ve metodlar oluþturalým 
		 
		 private yapýnca güvenlik konusunu halletmiþ olduk 
		 Ancaaaak class üyelerinin private olmasý OOP concepte aykýrý 

		 Encapsulation classýmýzda oluþturduðumuz class üyelerine 
		 kimlerin ne oranda ulaþabileceðini belirlemek için yapýlýr 
		 */
		
		
		
		
		

	
	
	
	}
	
	private void deneme() {
		
		System.out.println("Deneme metodu çalýþtý ");		
	}

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
		System.out.println(hesapNo);
	}
	
	





}


