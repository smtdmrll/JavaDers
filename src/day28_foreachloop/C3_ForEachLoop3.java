package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C3_ForEachLoop3 {

	public static void main(String[] args) {
		// verilen arraydeki t�m elemanlar� bir listeye aktaran bir method yaz�n�z 
		//
		
		String arr[]= {"ali", "veli", "ayse", "fatma"};
		
		System.out.println(listeyeCevir(arr)); //[ali, veli, ayse, fatma]
		
		List<String> list =listeyeCevir(arr);
		
		list.add(0, "bu i� bu kadar");
		System.out.println(list); //[bu i� bu kadar, ali, veli, ayse, fatma]
		list.remove(1); //ali yi siker 
		System.out.println(list); //[bu i� bu kadar, veli, ayse, fatma]
		
	}

	public static List<String> listeyeCevir(String[] arr) {
		
		List<String> geciciList	= new ArrayList<>();
		for (String i : arr) { //arr arrayinde her bir eleman�
			geciciList.add(i);
			
		}
		
		return geciciList;
	}

}
