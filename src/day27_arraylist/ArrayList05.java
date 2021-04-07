package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		//verilen bir arrayi liste nasýl çevirebilirz ?
		
		String sayi[] = {"ali", "veli" };
		
		List<String> listArr = Arrays.asList(sayi);
		
		System.out.println(listArr);
				
		Integer arr1[]= {1,2,3};
		List<Integer> list= Arrays.asList(arr1); 
		System.out.println(list);
		
		/*
		 * bazen çok fazla elemana bir kliste oluþturmamýz gerekir 
		 * bu durumda iste elemanlarýný tek tek eklemek yerine 
		 * elemanlarý bir Array e ekler, sonra da arrayi liste çevirebilriz 
		 * örnek bir web sitesinde tüm ürünleri ir listeye eklemek istediðimizde 
		 * 
		 * ancak arrayi liste çevirdikten sonra list esnek olmaz (arrayin özelliklerini taþýr 
		 *  ekleme çýkarma ve temizleme yapýlmaz uzunluðu etkileyen metodlar yani  
		 * 
		 * java bu deðiþimdeki Array ve list i senkronize eder, 
		 * birinde yapýlan deðiþiklik otomatik olarak diðerini de update eder 
		 * 
		 * arr1 array ve list listesi senkron çalýþýr 
		 * birinde yaplan deðþiklik diðerinde kalýcý olarak deðiþir 
		 */
		
		arr1[1]=5;
		
		System.out.println(" Arrays "+ Arrays.toString(arr1));
		System.out.println("list: "+ list);
		
		
		list.set(2, 13);
		System.out.println();
		System.out.println("list: "+ list);
		System.out.println(" Arrays "+ Arrays.toString(arr1));
		
//		list.add(2, 32);
//		System.out.println(list); yapamazsýn çünkü arrayi liste çevirdikten sonra uzunluk deðiþmez yeni ekleme yapaman
		
		
		
		
		
		
	}

}
