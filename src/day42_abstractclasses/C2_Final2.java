package day42_abstractclasses;

public class C2_Final2 extends C1_Final {

	public static void main(String[] args) {

		System.out.println(C1_Final.SAY�);// 10

		// static bir variable okul ismi gibi herkes i�in ayn�d�r

//		C1_Final.SAY�+=20;
		// sayi variable � final olarak tan�mland��� i�in de�i�tirilemez

		C2_Final2 obj = new C2_Final2();
		obj.deneme();
	}

	public void deneme() {
		System.out.println("child classdaki overriding method");
	}
	/*
	public void deneme2() {
		
	}
	
	final class yapt���m�zda inherit edilemez
		*/
}
