package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		
//		toplama(list); // varargs esnek oldu�u �in liste benzese de list de�il
		
		int arr[]= {15,20,35};
		toplama(arr); // varargs ARRAY olarak �al���r ve argument olarak array yollanabilir 
		
		
		
		//kullan�c�dan de�er alarak var �al��t�rmak istiyorsak girilen de�erleri bir arraye kaydetmeliyiz
		//bunun i�in kullan�c�dan ald���n�z de�erleri esnek oldu�u i�in bir liste koyar�z 
		//sonra listi arraye �eviririz
		
		
		
	}

	public static void toplama(int... var) { 
		
		int toplam = 0;
		for (int each : var) {
			toplam += each;
		}
		System.out.println("toplam : " + toplam); 

	}
	
}
