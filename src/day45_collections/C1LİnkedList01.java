package day45_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1LÝnkedList01 {

	public static void main(String[] args) {
		
		/*
		 	linked baðlý demek 
		 		linkedlist ise tüm elemanlar tren gibi birbirine baðlýdýr
		 	
		 	Collections da obje oluþtururken oluþturmak istediðimiz collectionýn 
		 		class mý yoksa interface mi olduðuna bakmalýyýz.
		 		Eðer oluþturmak istediðimiz collections interface ise datat türü olarak 
		 		o interface i, constructor olarak ise uygun bir class seçmeliyiz 
		 		Þimdiye kadar List(interface) oluþtururken constructor olarak ArrayList() seçiyorduk 
		 */
		
		List<String> list= new ArrayList<>();
		list.add("X");
		list.add("Y");
		
		
		LinkedList<String> ll1=new LinkedList<>();	
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);
		ll1.add(1, "C");
		System.out.println(ll1);
		ll1.addAll(list);
		System.out.println(ll1);
		
		ll1.addAll(2, list);
		System.out.println(ll1);
		
		ll1.addLast("K");
		System.out.println(ll1);
		/*
		 	LÝnkedList List ve Queue interface lerine implement ile child olduðundan 
		 		her iki interfaceteki tüm methodlarý override etmek zorundayýz 
		 	Ýþlev olarak ayný iþi yapan addLast() (queue) ve add() (List ten) inherit edilmiþtir

		 	Ben bir LinkedList oluþturmak istiyorum ama sadece List özelliklerini taþýsýn istiyor
		 */
		
		List<String> listList= new LinkedList<>();
		
		listList.add("list'ten gelen özellikler var sadece");

		
//	 	Ben bir LinkedList oluþturmak istiyorum ama sadece Queue özelliklerini taþýsýn istiyor

		Queue<String> queueList= new LinkedList<>();
		
		queueList.add("sadece queue den gelen özellikler var");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}




























