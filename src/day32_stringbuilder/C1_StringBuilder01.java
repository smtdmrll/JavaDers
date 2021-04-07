package day32_stringbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {
		
		
		StringBuilder sb1 =new StringBuilder("R�meysa");
		System.out.println(sb1);
		
		sb1.append(" ").append("�etint�rk"+ " "+ "java"); //sb de concat metpdu yok ama apend in i�inde toplayabiliyorsun 
		
		System.out.println(sb1);
		
		String cumle= "javay� �ok sever";
		sb1.append( cumle, 6, 9); // c�mle i�erisinde 6. indeks dahil 9. indeks hari� aradakileri ekler 
		System.out.println(sb1);
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		sb1.charAt(5); //bize bilgi getiren metodlar stringbuilder � de�i�tirmez
		
		System.out.println(sb1.charAt(1));
		
		sb1.delete(17, 25);
		System.out.println(sb1); //17 dahil 25 hari� aras� siler
		
		sb1.deleteCharAt(16);
		System.out.println(sb1);
		
		String isim="R�meysa �etint�r";
		sb1.equals(isim);
		
		System.out.println(sb1.equals(isim)); // datat t�rleri farl� oldu�u i�in i�eri�in k�yaslanmas� m�mmmk�n de�il 
												//biri str biri sb equals olmaz
		
		StringBuilder sb2 =new StringBuilder("R�meysa �etint�r");
		
		System.out.println(sb1.equals(sb2));// fasle ama SB da equals metodu Stringten farkl� �al���r 
											//ancak ayn� obje ile k�yasland���nda true verir
											// == mant���yla �al���r 
									
		System.out.println(sb1.indexOf("�etin"));//8
		System.out.println(sb1.indexOf("e", 6));// 6. indeksten sonra e arayacak 
		
		sb1.insert(7, " samet babaaa"); //istedi�imiz indeksten itibaren istenen stringi ekler
		System.out.println(sb1);
		
		sb1.insert(0, cumle, 0, 7); //0. indekse cumle stringinden 0 ila 7 aras�ndaki (7dahil de�il) stringi ekle 
		System.out.println(sb1);
		
		System.out.println(sb1.lastIndexOf("a", 22)); //22 den �nce en son ka��nc� idekste var
		
		System.out.println(sb1.replace(0 , 7, "seher")); //sbnin ba� ve biti� indks aras�ndaki k�sm� verile string ile de�i�tirir
		
		sb1.reverse();
		System.out.println(sb1); //tersine �evirir 
		sb1.reverse();//bir daha tersine �evirdik yani d�z yapt�k :D :D 
		
		
		sb1.setCharAt(2, 'k'); //2. indeksteki harfi de�i�tirdik
		System.out.println(sb1);	
		sb1.setCharAt(1, 'i');
		
		System.out.println(sb1.subSequence(0, 5)); // SB nin indeksler aras� b�l�m� verir 5 dahil de�il
		
		System.out.println(sb1.substring(8)); //ba�lang�� yani 8. indeksten sona kadar yazd�r�r

		StringBuilder sb3 = new StringBuilder("java �okzel");
		StringBuilder sb4 = new StringBuilder("java �okzel");
		
		System.out.println(sb3.equals(sb4));// false verecek
		
		//i�eriklerinin e�it olu� olmad���na bakmak i�in stringteki equals methodunu kullanal�m 
		
		System.out.println(sb3.toString().equals(sb4.toString()));//true
		// equals metodu iki string aras�nda oldu�u i�in true verdi sb3 � ve sb4 � toString metoduyla stringe �evirdik
		//tostring metodu kullan�nca stringbuilder stringe d�n�m�� olur dolay�s�yla t�m string metodlar� kullan�labilir concat falan fi�man
		
		
		System.out.println(sb1.length());//34
		System.out.println(sb1.capacity());//48
	
		sb1.trimToSize(); // sb i�in haz�rlanan kapasitedeki fazlal�klar� siler lentgh ile capacity eyi e�it duruma getirir 
		
		
		System.out.println(sb1.length());//34
		System.out.println(sb1.capacity());//34 
		
		System.out.println(sb3.compareTo(sb4)); //harfleri s�rekli kar��la�t�r�r ve e�it olmayan ilk harf ile aras�ndaki yani ascii fark�n� verir
												// abi okula gel
												// ali okula git deyince 10 verir l ile b aras�nda gerisine bakmaz bulunca hi� farkl� bulamazsa 0 d�nd�r�r
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
