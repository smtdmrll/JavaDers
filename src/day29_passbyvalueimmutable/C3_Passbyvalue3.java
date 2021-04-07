package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_Passbyvalue3 {

	public static void main(String[] args) {
		/*
		 Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method olusturup list elemanlarini artirmayi deneyelim
  		- 1. Method�da elemanlari for each loop kullanarak artirin
 		- 2. Method�da elemanlari set method�u kullanarak artirin
  		- Method�lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.
		 */
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		
		System.out.println(list); //[10, 11, 12]
		
		degistirFor(list);
		System.out.println("1. method call dan sonra "+ list);
		degistirSet(list);
		System.out.println("set ile de�i�tiridi�imiz liste main methodun i�inde: "+ list);  
		/*
		 * java pass by value kullan�r ancak 
		 * listteki set metodu istisnai olarak methodun i�inde yap�lan de��iiklikleri de kal�c� hale getirir 
		 */
	

	}

	public static void degistirSet(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i)+3);
		}
		System.out.println("set ile de�i�tiridi�imiz liste methodun i�inde: "+ list);
	}

	public static void degistirFor(List<Integer> list) {
		
		for (Integer each : list) {//fot each loop ile listeyi g�ncellemiyoruz 
//									sadece her bir eleman� tek tek �a��r�p �� fazlas�n� yazd�r�yoruz
			
			each +=3;
			System.out.print(each+" ");//13 14 15 each yazd�rd�k 
		}
		System.out.println();
		System.out.println(list);//[10, 11, 12]  list i yazd�rd�k
		
	}
		
	}

