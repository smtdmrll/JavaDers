package day32_stringbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {
		
		
		StringBuilder sb1 =new StringBuilder("Rümeysa");
		System.out.println(sb1);
		
		sb1.append(" ").append("Çetintürk"+ " "+ "java"); //sb de concat metpdu yok ama apend in içinde toplayabiliyorsun 
		
		System.out.println(sb1);
		
		String cumle= "javayý çok sever";
		sb1.append( cumle, 6, 9); // cümle içerisinde 6. indeks dahil 9. indeks hariç aradakileri ekler 
		System.out.println(sb1);
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		sb1.charAt(5); //bize bilgi getiren metodlar stringbuilder ý deðiþtirmez
		
		System.out.println(sb1.charAt(1));
		
		sb1.delete(17, 25);
		System.out.println(sb1); //17 dahil 25 hariç arasý siler
		
		sb1.deleteCharAt(16);
		System.out.println(sb1);
		
		String isim="Rümeysa Çetintür";
		sb1.equals(isim);
		
		System.out.println(sb1.equals(isim)); // datat türleri farlý olduðu için içeriðin kýyaslanmasý mümmmkün deðil 
												//biri str biri sb equals olmaz
		
		StringBuilder sb2 =new StringBuilder("Rümeysa Çetintür");
		
		System.out.println(sb1.equals(sb2));// fasle ama SB da equals metodu Stringten farklý çalýþýr 
											//ancak ayný obje ile kýyaslandýðýnda true verir
											// == mantýðýyla çalýþýr 
									
		System.out.println(sb1.indexOf("Çetin"));//8
		System.out.println(sb1.indexOf("e", 6));// 6. indeksten sonra e arayacak 
		
		sb1.insert(7, " samet babaaa"); //istediðimiz indeksten itibaren istenen stringi ekler
		System.out.println(sb1);
		
		sb1.insert(0, cumle, 0, 7); //0. indekse cumle stringinden 0 ila 7 arasýndaki (7dahil deðil) stringi ekle 
		System.out.println(sb1);
		
		System.out.println(sb1.lastIndexOf("a", 22)); //22 den önce en son kaçýncý idekste var
		
		System.out.println(sb1.replace(0 , 7, "seher")); //sbnin baþ ve bitiþ indks arasýndaki kýsmý verile string ile deðiþtirir
		
		sb1.reverse();
		System.out.println(sb1); //tersine çevirir 
		sb1.reverse();//bir daha tersine çevirdik yani düz yaptýk :D :D 
		
		
		sb1.setCharAt(2, 'k'); //2. indeksteki harfi deðiþtirdik
		System.out.println(sb1);	
		sb1.setCharAt(1, 'i');
		
		System.out.println(sb1.subSequence(0, 5)); // SB nin indeksler arasý bölümü verir 5 dahil deðil
		
		System.out.println(sb1.substring(8)); //baþlangýç yani 8. indeksten sona kadar yazdýrýr

		StringBuilder sb3 = new StringBuilder("java çokzel");
		StringBuilder sb4 = new StringBuilder("java çokzel");
		
		System.out.println(sb3.equals(sb4));// false verecek
		
		//içeriklerinin eþit oluð olmadýðýna bakmak için stringteki equals methodunu kullanalým 
		
		System.out.println(sb3.toString().equals(sb4.toString()));//true
		// equals metodu iki string arasýnda olduðu için true verdi sb3 ü ve sb4 ü toString metoduyla stringe çevirdik
		//tostring metodu kullanýnca stringbuilder stringe dönþmüþ olur dolayýsýyla tüm string metodlarý kullanýlabilir concat falan fiþman
		
		
		System.out.println(sb1.length());//34
		System.out.println(sb1.capacity());//48
	
		sb1.trimToSize(); // sb için hazýrlanan kapasitedeki fazlalýklarý siler lentgh ile capacity eyi eþit duruma getirir 
		
		
		System.out.println(sb1.length());//34
		System.out.println(sb1.capacity());//34 
		
		System.out.println(sb3.compareTo(sb4)); //harfleri sürekli karþýlaþtýrýr ve eþit olmayan ilk harf ile arasýndaki yani ascii farkýný verir
												// abi okula gel
												// ali okula git deyince 10 verir l ile b arasýnda gerisine bakmaz bulunca hiç farklý bulamazsa 0 döndürür
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
