package day15_methodcreation;

import java.util.Iterator;

public class C4_ForLoop {

	public static void main(String[] args) {
		/*
		 * 5 defa hello world yazd�ral�m
		 

		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		*/
		
		// bunun yerine loop kullan�yoruz 
		// ne yapaca��m�z� javaya s�yl�yoruz ka� kere yapmas� gerekti�ini de s�yl�yoruz 
	
		
		// t�m looplarda �� �eyi yazmak zorunday�z 
		//1) BA�LANGI� DE�ER� 
		//2) B�T�� DE�ER� 
		//3) ARTI� DE�ER�
		
		for(int i=100 ; i>300 ; i-=5) { // i sadece isim genel kullan�m i'dir
			
			System.out.println(i+ " hello world");
			
		}
		System.out.println("kod �al���r ");
		//not e�er �art k�sm� bizim art���m�za g�re hep true verirse loop sonsuz d�ng�ye girer
		//not loop da art�� de�eri pozitif oldu�u gibi negatif de olabilir  
		//not art�� de�eri bir olmak zorunda de�il farkl� olabilir misal +=5 -=3 gibi gibi 
		//not loop �art� hi� true olmazsa loop body hi� devreye girmez 
	}

}
