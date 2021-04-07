package day12_stringmanupltion;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		/*
		 * equalsignorecase() method u karþýlaþtýdýðý Striglere case sensitive 
		 * büyük küçük harf duyarlýlýðý olmaksýzýn bakar 
		 * Strimgler ayný ise true deðilse false döner 
		 */
	String str1="Ali can";
	String str2= "ali CAN";
	String str3="Ali can  ";
	
	System.out.println(str1.equals(str2));// false verir	
	System.out.println(str1.equalsIgnoreCase(str2)); // true
	
	System.out.println(str1.equals(str3));// str3 ün sonunda boþluk var 	
	System.out.println(str1.equalsIgnoreCase(str3));//false verir ignore case sadece büyük küçük harf önemsemez boþluk u yok sayma yapmaz
	
	
	}

}
