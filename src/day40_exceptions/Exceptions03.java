package day40_exceptions;

public class Exceptions03 {
	public static void main(String[] args) {
	
	int arr[]= {1,4,7,8};
	
	try {
	System.out.println(arr[20]);
	}catch(ArrayIndexOutOfBoundsException e){
		e.printStackTrace();
	}finally {
		System.out.println("nolursa olsun bu satýr yazýlsýn ");
	}
	/*
	 	finally blogu
	 		try catch bllogu ile veya sadece try blogu ile çalýþabilir
	 	finally blogu catch blogu ile öngördüðüm bir sorun olduðunda çalýþtýðý gibi 
	 		öngeremediðim bir exc olduðunda da çalýþýr 
	 */


	}

}
