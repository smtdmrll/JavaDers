package day27_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
		// verilen list i array e nas�l �eviririz ha ?
		
		List<String> list = new ArrayList<>();
		list.add("ali");
		list.add("veli");
		
		String arr[]= list.toArray(new String[0]);
		
		System.out.println(Arrays.toString(arr)); 
	}

}
