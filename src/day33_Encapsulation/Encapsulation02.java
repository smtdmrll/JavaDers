package day33_Encapsulation;

public class Encapsulation02 {
	
	private String okulIsmi ="y�ld�z koleji";
	// okul isminin ba�lka classlardan okunmas�n�n ama de�er atanmamas�n� istiyorsak 
	//getter() metodu olu�turuyoruz
	private String  tcNo= "12345678901";
	private int hesapNo=5554321;
//	obje olu�turarak de�er de�er atan�p kullan�lmas�n� istedi�imiza ma
	// ilk atad���m�z de�erin g�r�nmemesini istiyorsak setter() metodu kullan�r�z 
	
	public int sayi= 100;
	
	public static void main(String[] args) {
		/*
		  e�er ula�mak istedi�im class �yeleri(class member) public de�ilse 
		 ba�ka packagelerden ula�mak i�in ekstra i�lem yapmam�z gerekir  
		
		  Yapabilece�imiz i�lemlerden birincisi ENCAPSULAT�ON(data saklama, data hiding)
		 bu classta kimseyle payla�mak istemedi�imiz variable ve metodlar olu�tural�m 
		 
		 private yap�nca g�venlik konusunu halletmi� olduk 
		 Ancaaaak class �yelerinin private olmas� OOP concepte ayk�r� 

		 Encapsulation class�m�zda olu�turdu�umuz class �yelerine 
		 kimlerin ne oranda ula�abilece�ini belirlemek i�in yap�l�r 
		 */
		
		
		
		
		

	
	
	
	}
	
	private void deneme() {
		
		System.out.println("Deneme metodu �al��t� ");		
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


