package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		
//		toplama(list); // varargs esnek olduðu çin liste benzese de list deðil
		
		int arr[]= {15,20,35};
		toplama(arr); // varargs ARRAY olarak çalýþýr ve argument olarak array yollanabilir 
		
		
		
		//kullanýcýdan deðer alarak var çalýþtýrmak istiyorsak girilen deðerleri bir arraye kaydetmeliyiz
		//bunun için kullanýcýdan aldýðýnýz deðerleri esnek olduðu için bir liste koyarýz 
		//sonra listi arraye çeviririz
		
		
		
	}

	public static void toplama(int... var) { 
		
		int toplam = 0;
		for (int each : var) {
			toplam += each;
		}
		System.out.println("toplam : " + toplam); 

	}
	
}
