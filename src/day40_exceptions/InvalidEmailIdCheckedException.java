package day40_exceptions;

public class InvalidEmailIdCheckedException extends Exception{
	
	private static final long serialVersionUID = 1L; //java exceptionlarýn tekrarsýz olmasýný saðlamak için	
													//her exceptiona unique bir kod verir

	InvalidEmailIdCheckedException(String mesaj){
		super(mesaj);
	}
}
