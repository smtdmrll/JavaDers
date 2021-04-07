package day41_errors_garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01 {
	
	public static void main(String[] args) {
	
		String str ="";
		for (int i = 0; i <1000 ; i++) {
				str+=i;
			}
		// bu kod çalýþtýðýnda kaç tane obje oluþur
		//1001
		//ilk baþtan bir tane oluþturduk sonra her döngüde string str a concatination yapýlacak 
		//ama string classý immutable olduðu için her yeni deðeri koymak için 
				//yeni bir string objesi oluþturur ve eski objeden pointer silinir 
		//dolayýsýyla loop bittiðinde str için 1 tane pointer iþaret ettiði obje
			//1000 tane de hiçbir pointer ýn iþaret etmediði obje heap memoryde bulunur 
		
		List <Integer> list = new ArrayList<>();
			//bu satýr javaya yeni bir obje oluþturmasýný söylüyor(new kelimesinden anladýk)
		// java yeni obje için yer var mý diye memory i kontrol eder ve memory kritik seviyede ise 
			//Garbage collector u devreye sokuyor(buna java karar veriyor)
		
		//Garbage collector de finalize() methodunu çalýþtýrýr
		//finalize() methodu silinecek objeleri iþaretler ve sonra
			// garbage collecktor finalize olan objeleri siler 
	}
}
