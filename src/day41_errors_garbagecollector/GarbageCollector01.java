package day41_errors_garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01 {
	
	public static void main(String[] args) {
	
		String str ="";
		for (int i = 0; i <1000 ; i++) {
				str+=i;
			}
		// bu kod �al��t���nda ka� tane obje olu�ur
		//1001
		//ilk ba�tan bir tane olu�turduk sonra her d�ng�de string str a concatination yap�lacak 
		//ama string class� immutable oldu�u i�in her yeni de�eri koymak i�in 
				//yeni bir string objesi olu�turur ve eski objeden pointer silinir 
		//dolay�s�yla loop bitti�inde str i�in 1 tane pointer i�aret etti�i obje
			//1000 tane de hi�bir pointer �n i�aret etmedi�i obje heap memoryde bulunur 
		
		List <Integer> list = new ArrayList<>();
			//bu sat�r javaya yeni bir obje olu�turmas�n� s�yl�yor(new kelimesinden anlad�k)
		// java yeni obje i�in yer var m� diye memory i kontrol eder ve memory kritik seviyede ise 
			//Garbage collector u devreye sokuyor(buna java karar veriyor)
		
		//Garbage collector de finalize() methodunu �al��t�r�r
		//finalize() methodu silinecek objeleri i�aretler ve sonra
			// garbage collecktor finalize olan objeleri siler 
	}
}
