package day42_abstractclasses;

public class IdariPersonel extends Personel {
		/*
		 	extends personel yazarak abstract personele concrete bir child olu�turdum 
		 		ve java cte verdi
		 	��z�m olarak �retti�i 2 ihtimal var
		 		1- Unimplemented(uyarlanmam��) methodlar� uyarla(implement yap)
		 		2- Ya da Personel class�ndan abstract kelimesini kald�r 
		 	Bu class�n �al��abilmesi i�in iki i�lemden brini yapmak zorunday�z 
		 */
	public static void main(String[] args) {
		
	}
	
//	public abstract void surekliCalisma();
		//abstract bir method sadece abstract bir classta olu�turulabilir

	
	@Override
	public void maasHesapla() {
			System.out.println("idari personel maa�� 4000");
			
		}

	
	@Override
	public void mesaiBilgisi() {
			// TODO Auto-generated method stub
			
		}
	
}
