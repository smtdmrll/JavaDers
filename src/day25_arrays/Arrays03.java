package day25_arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// verilen bir stringi array a nasýl çeviririz 
		//verilen bir cümlede kaç kelime olduðunu bulunuz 
		//verilen bir cðmlede her kelimenin ilk harfini büyük yapýnýz 
		
		String str = "Herkes javayý tanýsa severdi";
		//stringi kelimelere ayýralým 
		// split methodu 
		
		String arr [] = str.split(" ");  //parçalamak istediðimiz karakteri gir onu yok eder ondan öncesi her kelimeyi bir eleman olarak alýr 
		
		System.out.println(Arrays.toString(arr));
		
		String arr2[] = str.split("java");
		System.out.println(Arrays.toString(arr2));
				
		String arr3[]= str.split("a");
		System.out.println(Arrays.toString(arr3));
		
		String arr4[]= str.split("");
		System.out.println(Arrays.toString(arr4));
		
		
		
		
		
		
		
	}

}
