package day24_arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		//kar���k s�ral� verilen bir Array i s�ral� olarak yazd�r�n�z 
		
		int arr[]= {25,17,6,78,45,69,1};
		
		Arrays.sort(arr);  // sort s�ralama methodu 
		System.out.println(Arrays.toString(arr));
		
		//ayn� arrayin b�y�kten k����e do�ru nas�l yazd�rabiliriz
		
		for (int i = arr.length-1 ; i >=0 ; i--) {
			System.out.print(arr[i] + " ");
		}
		// ayn� array i b�y�kten k����e do�ru nas�l s�ralayabiliriz ?
		
		int arrTers[]=new int[arr.length]; // ilk array in uzunlu�una e�it yeni bir array olu�turdum 
		
		for (int i = 0; i < arrTers.length; i++) {
			arrTers[i]=arr[arr.length-1-i];
		}
		
		
		
		
	}

}
