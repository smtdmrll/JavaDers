package day38_exceptions;

public class Exception03 {
	public static void main(String[] args) {
//		try-catch bloðundaki e nin görevi
		
		int sayi1=10;
		int sayi2=0;
		
		Exceptions01 exp = new Exceptions01();
		// eþitliðin solundaki Exception01 hem class adý hem de exp objesi için data türü 
		try {
		System.out.println(sayi1/sayi2);
		}catch(ArithmeticException e) {
			//ArithmeticException javada bir class ve e objesi için bir data türü
			//e ise ArithmeticException classýndan oluþturduðumuz objenin adý
			// o zaman ismi e olmak zorunda deðil ama genel kullaným bu
			
			System.out.println(e); //java.lang.ArithmeticException: / by zero
			
			//bu durumda javaya sorunu yazmasý için fýrsat vermiþ hem de applicationý bloke etmemiþ oluruz 	
		
			System.out.println(e.getMessage()); // (/ by zero) yazdýrýr
			
			e.printStackTrace();/*
									java.lang.ArithmeticException: / by zero
									at day38_exceptions.Exception03.main(Exception03.java:13)
	yazdýrýr.
	*/
		}
		
	System.out.println("kod bloke olmadý kii");
	
	}
}
