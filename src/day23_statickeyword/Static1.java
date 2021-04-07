package day23_statickeyword;

public class Static1 {

	static String isim = "mehmet";
	int yas = 49;

	@SuppressWarnings("static-access")//bunu ekleyince lambalar s�n�yormu� 
	public static void main(String[] args) {
		/*
		 * static variable lar olu�turulan t�m objeler i�in ge�erlidir (okul ad� gibi)
		 * mesela bir class'da 1 instance 1de static variable olsun
		 */

		Static1 st1 = new Static1();
		Static1 st2 = new Static1();
		Static1 st3 = new Static1();

		st1.isim = "hasan "; // lambalar�n sebebi static variable lar i�in obje kullanman�za gerek isim=hasan yapsak giderdi ���k 
		st1.yas = 25;
		System.out.println(st1.isim + " " + st1.yas);

		st2.isim = "ay�e";
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
