package day40_exceptions;

public class InvalidEmailIdCheckedException extends Exception{
	
	private static final long serialVersionUID = 1L; //java exceptionlar�n tekrars�z olmas�n� sa�lamak i�in	
													//her exceptiona unique bir kod verir

	InvalidEmailIdCheckedException(String mesaj){
		super(mesaj);
	}
}
