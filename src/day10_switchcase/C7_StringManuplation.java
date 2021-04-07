package day10_switchcase;

public class C7_StringManuplation {

	public static void main(String[] args) {
		/*
		 * VERY IMPORTANT olmazsa olmaz bir konu
		 * stringi de�i�tirme anlm�n� ta��r
		 * nonpri data t�rleri value ile birlikte methodlara sahiptirler
		 * methodlar� kullanarak stringi de�i�tirmeye stringmanuplation deniyor
		 * string metodlar� ge�ici olarak manip�le eder kal�c� assign yapmaz 
		 */

		String str="hello world";
		System.out.println(str.toUpperCase()); //HELLO WORLD (geici olarak manip�le ediyor 
		
		System.out.println(str);// hello world
		
		String str2=str.toUpperCase();// burda str birin manip�le edilmi� hali str2 ye atanm�� olur 
		
		System.out.println(str); //hello world 
		System.out.println(str2);//HELLO WORLD
		 
		
		
		
		
		
		
	}

}
