package day42_abstractclasses;

public class C2_Final2 extends C1_Final {

	public static void main(String[] args) {

		System.out.println(C1_Final.SAYÝ);// 10

		// static bir variable okul ismi gibi herkes için aynýdýr

//		C1_Final.SAYÝ+=20;
		// sayi variable ý final olarak tanýmlandýðý için deðiþtirilemez

		C2_Final2 obj = new C2_Final2();
		obj.deneme();
	}

	public void deneme() {
		System.out.println("child classdaki overriding method");
	}
	/*
	public void deneme2() {
		
	}
	
	final class yaptýðýmýzda inherit edilemez
		*/
}
