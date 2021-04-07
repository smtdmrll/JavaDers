package day23_statickeyword;

public class Static1 {

	static String isim = "mehmet";
	int yas = 49;

	@SuppressWarnings("static-access")//bunu ekleyince lambalar sönüyormuþ 
	public static void main(String[] args) {
		/*
		 * static variable lar oluþturulan tüm objeler için geçerlidir (okul adý gibi)
		 * mesela bir class'da 1 instance 1de static variable olsun
		 */

		Static1 st1 = new Static1();
		Static1 st2 = new Static1();
		Static1 st3 = new Static1();

		st1.isim = "hasan "; // lambalarýn sebebi static variable lar için obje kullanmanýza gerek isim=hasan yapsak giderdi ýþýk 
		st1.yas = 25;
		System.out.println(st1.isim + " " + st1.yas);

		st2.isim = "ayþe";
		st2.yas = 30;
		System.out.println(st2.isim + " " + st2.yas);
		System.out.println(st1.isim + " " + st1.yas);

		st3.isim = "alican";
		st3.yas = 40;

		System.out.println(st3.isim + " " + st3.yas);
		System.out.println(st2.isim + " " + st2.yas);
		System.out.println(st1.isim + " " + st1.yas);

	}

}
