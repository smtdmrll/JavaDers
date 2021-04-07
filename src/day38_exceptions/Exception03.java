package day38_exceptions;

public class Exception03 {
	public static void main(String[] args) {
//		try-catch blo�undaki e nin g�revi
		
		int sayi1=10;
		int sayi2=0;
		
		Exceptions01 exp = new Exceptions01();
		// e�itli�in solundaki Exception01 hem class ad� hem de exp objesi i�in data t�r� 
		try {
		System.out.println(sayi1/sayi2);
		}catch(ArithmeticException e) {
			//ArithmeticException javada bir class ve e objesi i�in bir data t�r�
			//e ise ArithmeticException class�ndan olu�turdu�umuz objenin ad�
			// o zaman ismi e olmak zorunda de�il ama genel kullan�m bu
			
			System.out.println(e); //java.lang.ArithmeticException: / by zero
			
			//bu durumda javaya sorunu yazmas� i�in f�rsat vermi� hem de application� bloke etmemi� oluruz 	
		
			System.out.println(e.getMessage()); // (/ by zero) yazd�r�r
			
			e.printStackTrace();/*
									java.lang.ArithmeticException: / by zero
									at day38_exceptions.Exception03.main(Exception03.java:13)
	yazd�r�r.
	*/
		}
		
	System.out.println("kod bloke olmad� kii");
	
	}
}
