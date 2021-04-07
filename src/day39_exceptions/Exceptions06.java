package day39_exceptions;

import java.util.ArrayList;
import java.util.List;

public class Exceptions06 {
	public static void main(String[] args) {
		
		/*
		 	list ve arrayde var olmayan bir index ile iþlem yapmak isterseniz 
		 		java IndexOutOfBoundsException verir
		 */
		
		
		
		int arr[]= {1,2,5,6};
		
		System.out.println(arr[1]); //2
//		System.out.println(arr[5]); //ArrayIndexOutOfBoundsException
		
		List<String> list = new ArrayList<>();
		
		list.add("baho");
		list.add("celil");
		 System.out.println(list);
		 System.out.println(list.get(1));
		 System.out.println(list.get(345)); //IndexOutOfBoundsExceptio
		 
	}
}
