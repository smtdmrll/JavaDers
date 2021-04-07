package day05_wrapperconcetenationoperators;

public class C1_ModulusSon {

	public static void main(String[] args) {
		
		//verilen bir int' in birler basamaðýndaki rakamý yazdýrýn 
		
		int sayi =1469;
		
		System.out.println("birler basamaðý "+ sayi%10);
		
		//verilen sayýnýn bir ler basmaðý hariç geriye kalan basamaklarý yazdýr 
		
		System.out.println(sayi/10); //146
		System.out.println(sayi); //1469
		
		System.out.println(sayi/=10); //146
		System.out.println(sayi); //146
		
		
		//sayi/10 ile sayi/=10 arasýndaki fark
		// = iþareti assignment demektir
		//bir iþlemde = iþareti varsa deðer kalýcý deðiþir = yoksa o anlýk mat iþlemi yapar
		
		

	}

}
