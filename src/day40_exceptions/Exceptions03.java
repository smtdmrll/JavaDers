package day40_exceptions;

public class Exceptions03 {
	public static void main(String[] args) {
	
	int arr[]= {1,4,7,8};
	
	try {
	System.out.println(arr[20]);
	}catch(ArrayIndexOutOfBoundsException e){
		e.printStackTrace();
	}finally {
		System.out.println("nolursa olsun bu sat�r yaz�ls�n ");
	}
	/*
	 	finally blogu
	 		try catch bllogu ile veya sadece try blogu ile �al��abilir
	 	finally blogu catch blogu ile �ng�rd���m bir sorun oldu�unda �al��t��� gibi 
	 		�ngeremedi�im bir exc oldu�unda da �al���r 
	 */


	}

}
