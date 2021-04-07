package day45_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1L�nkedList01 {

	public static void main(String[] args) {
		
		/*
		 	linked ba�l� demek 
		 		linkedlist ise t�m elemanlar tren gibi birbirine ba�l�d�r
		 	
		 	Collections da obje olu�tururken olu�turmak istedi�imiz collection�n 
		 		class m� yoksa interface mi oldu�una bakmal�y�z.
		 		E�er olu�turmak istedi�imiz collections interface ise datat t�r� olarak 
		 		o interface i, constructor olarak ise uygun bir class se�meliyiz 
		 		�imdiye kadar List(interface) olu�tururken constructor olarak ArrayList() se�iyorduk 
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
		 	L�nkedList List ve Queue interface lerine implement ile child oldu�undan 
		 		her iki interfaceteki t�m methodlar� override etmek zorunday�z 
		 	��lev olarak ayn� i�i yapan addLast() (queue) ve add() (List ten) inherit edilmi�tir

		 	Ben bir LinkedList olu�turmak istiyorum ama sadece List �zelliklerini ta��s�n istiyor
		 */
		
		List<String> listList= new LinkedList<>();
		
		listList.add("list'ten gelen �zellikler var sadece");

		
//	 	Ben bir LinkedList olu�turmak istiyorum ama sadece Queue �zelliklerini ta��s�n istiyor

		Queue<String> queueList= new LinkedList<>();
		
		queueList.add("sadece queue den gelen �zellikler var");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}




























