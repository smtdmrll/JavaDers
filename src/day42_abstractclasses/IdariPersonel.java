package day42_abstractclasses;

public class IdariPersonel extends Personel {
		/*
		 	extends personel yazarak abstract personele concrete bir child oluþturdum 
		 		ve java cte verdi
		 	çözüm olarak ürettiði 2 ihtimal var
		 		1- Unimplemented(uyarlanmamýþ) methodlarý uyarla(implement yap)
		 		2- Ya da Personel classýndan abstract kelimesini kaldýr 
		 	Bu classýn çalýþabilmesi için iki iþlemden brini yapmak zorundayýz 
		 */
	public static void main(String[] args) {
		
	}
	
//	public abstract void surekliCalisma();
		//abstract bir method sadece abstract bir classta oluþturulabilir

	
	@Override
	public void maasHesapla() {
			System.out.println("idari personel maaþý 4000");
			
		}

	
	@Override
	public void mesaiBilgisi() {
			// TODO Auto-generated method stub
			
		}
	
}
