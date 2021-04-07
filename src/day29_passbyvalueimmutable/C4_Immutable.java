package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable {

	public static void main(String[] args) {

		String isim="ali";
		isim.concat("can"); 
		System.out.println(isim); //ali 
		
		System.out.println(isim.concat("can"));// buraya �zel alican yzz�d�r� atama yapmaz 
		System.out.println(isim); //ali 
		
//		/*stringlerde method ile yapt���m�z de�i�iklikler kal�c� olmaz 
		// ��nk� java string class�n� immutable yapm��t�r
		List<String> isimList = new ArrayList<>();
		System.out.println(isimList);//[]
		isimList.add("Ali");
		isimList.add("can");
		System.out.println(isimList); // [ali, can]
		isimList.remove(1);
		System.out.println(isimList);// [ali]
		
//		listlerde method ile yapt���m�z de�i�iklikler KALICI olarak liste i�e-lenir
		//��nk� list mutable dir.
		
		
	}

}
