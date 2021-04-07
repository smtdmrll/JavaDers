package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		//verilen bir arrayde bir elemanýn varolup olmadýðýný nasýl kontrol ederiz 
		
		int arr[] = {10,25,3,16,75};

		int sayi = 25;
		
		boolean flag=false;
		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("array sorulan deðeri içeriyor ");
		}else {
			System.out.println("içermiyor ");
		}
		
		//Arrays classýndan method kulllanrak yapaþlým
		//ilk önce sýralama yapmalýyýz 
		Arrays.sort(arr); // 3 10 16 25 75 oldu þimdi array 
		Arrays.binarySearch(arr, sayi); 
		
		System.out.println(Arrays.binarySearch(arr, sayi)); // aranan sayýnýn indexini döner 3. index 
		System.out.println(Arrays.binarySearch(arr, 10)); // 1. index
		System.out.println(Arrays.binarySearch(arr, 28)); // 28 olsaydý nerde olacaðýný veririrdi ama eksi olarak indeksini deðil sýrasýný verir
		System.out.println(Arrays.binarySearch(arr, 5)); // -2 verdi mesela 5 olsaydý indeksini deðil sýrasýnýn nerde olacaðýný verdi 
		
		
		//binary search aradýðýmýz eleman varsa indexini verir  
		//aradýðýmýz eleman yoksa olsaydý kaçýncý eleman olacaðýný yani indeks deðil sýrasýný - iþareti ile verir
		
		int arr2[]= { 12,15,25,14,3,12,65};
		Arrays.sort(arr2);
		System.out.println(Arrays.binarySearch(arr2, 14));// 3 çýktýsý
		System.out.println(Arrays.binarySearch(arr2, 20));	//-6
		System.out.println(Arrays.binarySearch(arr2, 12));	//1

		//array nasýl string e nasýl çevirilir 
		
		String arrayString = Arrays.toString(arr2); // bu saatten sonra string methodlarý kullanýlabilir
		System.out.println(arrayString); 
		System.out.println(arrayString.substring(5)); //baþtaki köþeliparantez dahil tüm arrayi stringe çevirir
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
