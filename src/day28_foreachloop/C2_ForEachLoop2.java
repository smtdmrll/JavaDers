package day28_foreachloop;

public class C2_ForEachLoop2 {

	public static void main(String[] args) {
		// bir int arr oluþtur bu arraydeki tüm sayýlarýn çarpýmý for each loop ile bul
		
		int arr[]= {1,2,1,2,4,3,1,2};
		int carpim=1;
		for (int i : arr) {
			carpim*=i;

			System.out.print(carpim); //1 2 2 4 16 48 48 96
		}
		
		System.out.println("\n"+carpim); //96
	}

}
