package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		/*
		 * 1- iç içe array oluþturduðumuzda dýþardaki array a outer array
		 * içerdeki arraylere ise inner array denir
		 * 		
		 * 2- eðer içerdeki arraylerin boyutlarý birbirinden farklýysa 
		 * arrayi ancak tüm elemanlarý yazarak declare edebilirz 
		 * 
		 * 3-MultiDimensionalArray de bir elemanýn indeksi için en dýþdaki array hariç,
		 * elemana kadar iç içe tüm arrayþerin indexlerini yazmak gerekir 
		 */
		
		int arr[][]= {{1,3,5}, {3,5}, {5,9,11,3}}; //iki katlý bir arraydir( ilk elemana ulaþmak için kaç array gerekiyorsa o kadar katlý)
		
		//11 i index ile ifade etmek istersek arr[2][2] dýþtan içe doðru gidilir en dýþtakinin indeksi alýnmaz sonra innerýn indeksi inner diyerek gider
		
		//eðer array i uzunlukla declare etmek istersek inner array uzunluklarý eþit olmalý
		
		int arr2[][]= new int [3][2];
		
		//[3] ilk yazýlan sayý outer arrayin içinde kaç tane inner array olduðunu belirtir 
		//[2] her bir inner array in uzunluðu  
		
		System.out.println(Arrays.toString(arr2));
		
		//MultiDimensionalArray leri yazdýrmak için tostring methodu KULLANILAMAZ
		//ÇÜNKÜ to string methodu outer arrayi stringe çevirir
		//outer arraylerin içinde inner arrayler olduðundan tostring methodunda inner arraylerin referans deðerlerini yazdýrýr
		System.out.println(Arrays.deepToString(arr2));
		
		
		
		
		
		
		
	}
		

	}


