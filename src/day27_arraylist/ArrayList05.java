package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		//verilen bir arrayi liste nas�l �evirebilirz ?
		
		String sayi[] = {"ali", "veli" };
		
		List<String> listArr = Arrays.asList(sayi);
		
		System.out.println(listArr);
				
		Integer arr1[]= {1,2,3};
		List<Integer> list= Arrays.asList(arr1); 
		System.out.println(list);
		
		/*
		 * bazen �ok fazla elemana bir kliste olu�turmam�z gerekir 
		 * bu durumda iste elemanlar�n� tek tek eklemek yerine 
		 * elemanlar� bir Array e ekler, sonra da arrayi liste �evirebilriz 
		 * �rnek bir web sitesinde t�m �r�nleri ir listeye eklemek istedi�imizde 
		 * 
		 * ancak arrayi liste �evirdikten sonra list esnek olmaz (arrayin �zelliklerini ta��r 
		 *  ekleme ��karma ve temizleme yap�lmaz uzunlu�u etkileyen metodlar yani  
		 * 
		 * java bu de�i�imdeki Array ve list i senkronize eder, 
		 * birinde yap�lan de�i�iklik otomatik olarak di�erini de update eder 
		 * 
		 * arr1 array ve list listesi senkron �al���r 
		 * birinde yaplan de��iklik di�erinde kal�c� olarak de�i�ir 
		 */
		
		arr1[1]=5;
		
		System.out.println(" Arrays "+ Arrays.toString(arr1));
		System.out.println("list: "+ list);
		
		
		list.set(2, 13);
		System.out.println();
		System.out.println("list: "+ list);
		System.out.println(" Arrays "+ Arrays.toString(arr1));
		
//		list.add(2, 32);
//		System.out.println(list); yapamazs�n ��nk� arrayi liste �evirdikten sonra uzunluk de�i�mez yeni ekleme yapaman
		
		
		
		
		
		
	}

}
