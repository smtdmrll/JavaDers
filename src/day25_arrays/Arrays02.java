package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		//verilen bir arrayde bir eleman�n varolup olmad���n� nas�l kontrol ederiz 
		
		int arr[] = {10,25,3,16,75};

		int sayi = 25;
		
		boolean flag=false;
		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("array sorulan de�eri i�eriyor ");
		}else {
			System.out.println("i�ermiyor ");
		}
		
		//Arrays class�ndan method kulllanrak yapa�l�m
		//ilk �nce s�ralama yapmal�y�z 
		Arrays.sort(arr); // 3 10 16 25 75 oldu �imdi array 
		Arrays.binarySearch(arr, sayi); 
		
		System.out.println(Arrays.binarySearch(arr, sayi)); // aranan say�n�n indexini d�ner 3. index 
		System.out.println(Arrays.binarySearch(arr, 10)); // 1. index
		System.out.println(Arrays.binarySearch(arr, 28)); // 28 olsayd� nerde olaca��n� veririrdi ama eksi olarak indeksini de�il s�ras�n� verir
		System.out.println(Arrays.binarySearch(arr, 5)); // -2 verdi mesela 5 olsayd� indeksini de�il s�ras�n�n nerde olaca��n� verdi 
		
		
		//binary search arad���m�z eleman varsa indexini verir  
		//arad���m�z eleman yoksa olsayd� ka��nc� eleman olaca��n� yani indeks de�il s�ras�n� - i�areti ile verir
		
		int arr2[]= { 12,15,25,14,3,12,65};
		Arrays.sort(arr2);
		System.out.println(Arrays.binarySearch(arr2, 14));// 3 ��kt�s�
		System.out.println(Arrays.binarySearch(arr2, 20));	//-6
		System.out.println(Arrays.binarySearch(arr2, 12));	//1

		//array nas�l string e nas�l �evirilir 
		
		String arrayString = Arrays.toString(arr2); // bu saatten sonra string methodlar� kullan�labilir
		System.out.println(arrayString); 
		System.out.println(arrayString.substring(5)); //ba�taki k��eliparantez dahil t�m arrayi stringe �evirir
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
