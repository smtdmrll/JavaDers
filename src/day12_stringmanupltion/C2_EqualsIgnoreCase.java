package day12_stringmanupltion;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		/*
		 * equalsignorecase() method u kar��la�t�d��� Striglere case sensitive 
		 * b�y�k k���k harf duyarl�l��� olmaks�z�n bakar 
		 * Strimgler ayn� ise true de�ilse false d�ner 
		 */
	String str1="Ali can";
	String str2= "ali CAN";
	String str3="Ali can  ";
	
	System.out.println(str1.equals(str2));// false verir	
	System.out.println(str1.equalsIgnoreCase(str2)); // true
	
	System.out.println(str1.equals(str3));// str3 �n sonunda bo�luk var 	
	System.out.println(str1.equalsIgnoreCase(str3));//false verir ignore case sadece b�y�k k���k harf �nemsemez bo�luk u yok sayma yapmaz
	
	
	}

}
