package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable {

	public static void main(String[] args) {

		String isim="ali";
		isim.concat("can"); 
		System.out.println(isim); //ali 
		
		System.out.println(isim.concat("can"));// buraya özel alican yzzýdýrý atama yapmaz 
		System.out.println(isim); //ali 
		
//		/*stringlerde method ile yaptýðýmýz deðiþiklikler kalýcý olmaz 
		// çünkü java string classýný immutable yapmýþtýr
		List<String> isimList = new ArrayList<>();
		System.out.println(isimList);//[]
		isimList.add("Ali");
		isimList.add("can");
		System.out.println(isimList); // [ali, can]
		isimList.remove(1);
		System.out.println(isimList);// [ali]
		
//		listlerde method ile yaptýðýmýz deðiþiklikler KALICI olarak liste iþe-lenir
		//çünkü list mutable dir.
		
		
	}

}
