package day05_wrapperconcetenationoperators;

public class C1_ModulusSon {

	public static void main(String[] args) {
		
		//verilen bir int' in birler basama��ndaki rakam� yazd�r�n 
		
		int sayi =1469;
		
		System.out.println("birler basama�� "+ sayi%10);
		
		//verilen say�n�n bir ler basma�� hari� geriye kalan basamaklar� yazd�r 
		
		System.out.println(sayi/10); //146
		System.out.println(sayi); //1469
		
		System.out.println(sayi/=10); //146
		System.out.println(sayi); //146
		
		
		//sayi/10 ile sayi/=10 aras�ndaki fark
		// = i�areti assignment demektir
		//bir i�lemde = i�areti varsa de�er kal�c� de�i�ir = yoksa o anl�k mat i�lemi yapar
		
		

	}

}
